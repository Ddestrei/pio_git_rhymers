package edu.kis.vh.nursery;

/**
 * Klasa ta tworzy rym first in first out
 * Dziedziczy on od klasy DefaultCountingOutRhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * @return zwraca wartość temp.countOut()
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
