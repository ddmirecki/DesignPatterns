package sda2.StrategiaSortowanie;

/**
 * Created by Daniel on 2017-08-28.
 */
public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter(new BubbleSort());
        int[] tab = {1, 4, 2, 1, 1};
        int[] sorted = sorter.doSorting(tab);
    }
}
