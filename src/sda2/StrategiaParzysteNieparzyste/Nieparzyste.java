package sda2.StrategiaParzysteNieparzyste;

/**
 * Created by Daniel on 2017-09-01.
 */
public class Nieparzyste extends Bonifacy {

    public Nieparzyste(){
        iLiczenie = new ObliczanieNieparzyste();
    }

    @Override
    public void wyswietl() {
        System.out.println(" i licze liczby nieparzyste");
    }
}
