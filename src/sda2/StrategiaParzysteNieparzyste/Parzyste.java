package sda2.StrategiaParzysteNieparzyste;

/**
 * Created by Daniel on 2017-09-01.
 */
public class Parzyste extends Bonifacy {

    public Parzyste(){
        iLiczenie = new ObliczanieParzyste();
    }

    @Override
    public void wyswietl() {
        System.out.println(" i licze parzyste");
    }
}
