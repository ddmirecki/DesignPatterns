package sda2.StrategiaParzysteNieparzyste;

import java.util.Arrays;

/**
 * Created by Daniel on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {


        ObliczanieLiczb obliczanieLiczb = new ObliczanieLiczb(new ObliczanieParzyste());
        int[] ints = new int[]{4, 3, 2, 6, 5, 1};
        int[] ints1 = obliczanieLiczb.obliczLiczby(ints);
        System.out.println(Arrays.toString(ints1));


    }
}