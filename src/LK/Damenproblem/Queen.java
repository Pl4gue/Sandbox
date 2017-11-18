package LK.Damenproblem;

public class Queen extends Figure {

    private Queen() {
    }

    public static Queen getInstance(int x, int y) {
        Queen ret = new Queen();
        ret.setX(x);
        ret.setY(y);
        return ret;
    }

    @Override
    public boolean move(int x, int y) {
        if (moveCross(x, y) || moveDiagonal(x, y)) {
            return true;
        }
        return false;
    }

    public boolean isYQueenCross(int y,Figure[][] field) {
        for(int x=0;x<8;x++) {
            if (field[x][y] == null) {
                continue;
            }
            if (field[x][y] instanceof Queen) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Q";
    }
}

