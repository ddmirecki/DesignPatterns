package sda2.StrategiaParzysteNieparzyste;

import java.util.Arrays;

/**
 * Created by Daniel on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {


        ObliczanieLiczb obliczanieLiczb = new ObliczanieLiczb(new ObliczanieNieparzyste());



    ObliczanieNieparzyste obliczanieNieparzyste = new ObliczanieNieparzyste();
        int[] liczenie = obliczanieNieparzyste.liczenie();

        System.out.println(Arrays.toString(liczenie));


    }
}
