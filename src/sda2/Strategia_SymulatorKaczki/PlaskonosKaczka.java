package sda2.Strategia_SymulatorKaczki;

/**
 * Created by Daniel on 2017-08-28.
 */
public class PlaskonosKaczka extends Kaczka {
    public PlaskonosKaczka(){
        latanie = new LatamBoMamSkrzydla();
        kwakanie = new Kwacz();
    }

    @Override
    public void wyswietl() {
        System.out.println("Wyświetlam płaskonosa!");
    }
}
