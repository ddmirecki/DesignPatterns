package sda2.StrategiaParzysteNieparzyste;

import java.util.Arrays;

/**
 * Created by Daniel on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {


        ObliczanieLiczb obliczanieLiczb = new ObliczanieLiczb(new ObliczanieNieparzyste());
        int[] ints = new int[]{1, 2, 3, 4, 5, 6};
        int[] ints1 = obliczanieLiczb.obliczLiczby(ints);
        System.out.println(Arrays.toString(ints1));


    }
}