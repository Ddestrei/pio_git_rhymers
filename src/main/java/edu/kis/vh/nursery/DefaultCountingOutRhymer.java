package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ROZMIAR = 12;

    private int[] NUMBERS = new int[ROZMIAR];

    private static final int BLAD = -1;

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == BLAD;
    }

    public boolean isFull() {
        return total == ROZMIAR-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return BLAD;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return BLAD;
        return NUMBERS[total--];
    }

}
