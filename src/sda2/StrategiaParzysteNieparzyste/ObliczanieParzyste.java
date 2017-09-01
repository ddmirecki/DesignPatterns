package sda2.StrategiaParzysteNieparzyste;

/**
 * Created by Daniel on 2017-09-01.
 */
public class ObliczanieParzyste implements ILiczenie {

    @Override
    public int[] liczenie(int[] ints) {
        int licznik = 0;
        for (int i = 0; i < ints.length; i++) {
            if (i % 2 == 0) {
                ints[licznik] = i;
                licznik++;
            }
        }
        return ints;
    }
}