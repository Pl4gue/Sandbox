package LK.Damenproblem;

import java.util.Arrays;

public class Game {
    Figure[][] figureField = new Figure[8][8];

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


    private void backtracking() {
        dfs(0, figureField);
    }

    private boolean dfs(int x, Figure[][] field) {
        if (goalReached(field)) {
            return true;
        }
        for (int y = 0; y < 8; y++) {
            Queen q = Queen.getInstance(x, y);
            if (!q.isYQueenCross(y, field)
                    && check(field, x, y)) {
                set(x, y, q, field);
                x++;
                if (dfs(x, field)) {
                    return true;
                } else {
                    x--;
                    remove(x, y, field);
                    continue;
                }
            }
        }
        return false;
    }

    boolean check(Figure[][] field, int X, int Y) {
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
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
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                System.out.print((figureField[x][y] == null ? "X" : figureField[x][y]) + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String... args) {
        Game game = new Game();
        game.backtracking();
        game.print();
    }
}
