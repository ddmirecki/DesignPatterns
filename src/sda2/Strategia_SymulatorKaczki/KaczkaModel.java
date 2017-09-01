package sda2.Strategia_SymulatorKaczki;

/**
 * Created by Daniel on 2017-08-28.
 */
public class KaczkaModel extends Kaczka {
    public KaczkaModel(){
        latanie = new LatamBoMamSkrzydla();
        kwakanie = new NieKwacz();
    }

    @Override
    public void wyswietl() {
        System.out.println("kaczka model");
    }
}
