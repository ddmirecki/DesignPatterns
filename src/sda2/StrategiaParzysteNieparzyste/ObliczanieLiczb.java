package sda2.StrategiaParzysteNieparzyste;

/**
 * Created by Daniel on 2017-09-01.
 */
public class ObliczanieLiczb extends Bonifacy {
    private ILiczenie _iliczenie;

    public ObliczanieLiczb(ILiczenie iLiczenie){
        _iliczenie = iLiczenie;
    }

    @Override
    public void wyswietl() {
        System.out.println(" i licze liczby nieparzyste");
    }

    public int[] obliczLiczby(int[] liczby){
        return _iliczenie.liczenie(liczby);
    }
}
