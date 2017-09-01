package sda2.Strategia_SymulatorKaczki;

/**
 * Created by Daniel on 2017-08-28.
 */
public class KaczkaWabik extends Kaczka {
    public KaczkaWabik(){
        latanie = new NieLatam();
        kwakanie = new NieKwacz();
    }

    @Override
    public void wyswietl() {
        System.out.println("wyświetlam kaczke wabik");
    }
}
