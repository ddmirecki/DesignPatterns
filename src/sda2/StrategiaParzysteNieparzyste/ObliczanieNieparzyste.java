package sda2.StrategiaParzysteNieparzyste;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 2017-09-01.
 */
public class ObliczanieNieparzyste implements ILiczenie {

    @Override
    public int[] liczenie() {
        int[] ints = new int[100];
        int licznik = 0;
        for (int i = 0; i < ints.length ; i++) {
            if(i % 2 != 0){
                ints[licznik] = i;
                licznik++;
            }
        }
        return ints;
    }
}
