package LK.Damenproblem;

import java.util.Arrays;

public class Game {
    private Figure[][] figureField = new Figure[8][8];
    private int fieldsize = 8;
    private int solutionCount = 1;

    private void init(int size) {
        figureField = new Figure[size][size];
        fieldsize = size;
    }

    private boolean set(int x, int y, Figure figure, Figure[][] field) {
        if (field[x][y] instanceof Figure) {
            return false;
        }
        field[x][y] = figure;
        return true;
    }

    private boolean remove(int x, int y, Figure[][] field) {
        if (field[x][y] instanceof Figure) {
            field[x][y] = null;
            return true;
        }
        return false;
    }


    private void backtracking(boolean print) {
        if (print) {
            dfs(0, figureField, true);
        }
    }

    private boolean dfs(int x, Figure[][] field, boolean print) {
        if (goalReached(field)) {
            if (print) {
                print();
            }
            return true;
        }
        for (int y = 0; y < fieldsize; y++) {
            Queen q = Queen.getInstance(x, y);
            if (!q.isYQueenCross(y, field, fieldsize)
                    && check(field, x, y)) {
                set(x, y, q, field);
                dfs(x + 1, field, print);
                remove(x, y, field);
                continue;
            }
        }
        return false;
    }

    boolean check(Figure[][] field, int X, int Y) {
        for (int y = 0; y < fieldsize; y++) {
            for (int x = 0; x < fieldsize; x++) {
                if (field[x][y] == null) {
                    continue;
                }
                if (field[x][y].move(X, Y)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean goalReached(Figure[][] field) {
        for (Figure[] x : field) {
            if (!Arrays.stream(x).anyMatch(figure -> figure instanceof Queen)) {
                return false;
            }
        }
        return true;
    }

    private void print() {
        System.out.println(String.format("Solution %d:", solutionCount));
        solutionCount++;
        for (int y = 0; y < fieldsize; y++) {
            for (int x = 0; x < fieldsize; x++) {
                System.out.print((figureField[x][y] == null ? "X" : figureField[x][y]) + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    public static void main(String... args) {
        Game game = new Game();
        game.init(8);
        game.backtracking(true);
    }
}
