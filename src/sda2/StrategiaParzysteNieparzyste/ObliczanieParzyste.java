package sda2.StrategiaParzysteNieparzyste;

/**
 * Created by Daniel on 2017-09-01.
 */
public class ObliczanieParzyste implements ILiczenie {

    @Override
    public int[] liczenie(int[] ints) {
        int licznik = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                ints[licznik] = ints[i];
                licznik++;
            }
        }
        int[] tabCalculated = new int[licznik];
        for (int i = 0; i < tabCalculated.length ; i++) {
            tabCalculated[i] = ints[i];
        }
        return tabCalculated;
    }
}