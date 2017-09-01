package sda2.StrategiaParzysteNieparzyste;

import java.util.Arrays;

/**
 * Created by Daniel on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {

        Bonifacy bonifacy = new Nieparzyste();
        Parzyste parzyste = new Parzyste();
        Nieparzyste nieparzyste = new Nieparzyste();


    ObliczanieNieparzyste obliczanieNieparzyste = new ObliczanieNieparzyste();
        int[] liczenie = obliczanieNieparzyste.liczenie();

        System.out.println(Arrays.toString(liczenie));


    }
}
