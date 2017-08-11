import org.jetbrains.annotations.Contract;

import static java.lang.System.err;

/**
 * aProject "Sandbox"
 * "NimTest.java" created by David Wu on Sat,15.07.17.
 */

public class NimTest {
    public static void main(String[] args) {
        new NimTest().testNim(1, 4, 5);
    }

    void testNim(int... input) {
        err.print((new Nim().predictWin(input) == Nim.PLAYER_A) ? "A Wins" : "B Wins");
    }
}

class Nim {
    static final int PLAYER_A = 0;
    static final int PLAYER_B = 1;

    int predictWin(int[] piles) {
        return (calc(piles) == 0) ? PLAYER_B : PLAYER_A;
    }

    @Contract(pure = true)
    private int calc(int[] piles) {
        int nimsum = piles[0];
        for (int i = 1; i < piles.length; i++) {
            nimsum ^= piles[i];
        }
//        err.print("Nim-Sum: "+nimsum+" || ");
        return nimsum;
    }
}

/**
 * End of NimTest.java
 */
