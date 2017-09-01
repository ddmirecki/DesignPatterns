package sda2.Strategia_SymulatorKaczki;

/**
 * Created by Daniel on 2017-08-28.
 */
public class GumowaKaczka extends Kaczka {
    public GumowaKaczka(){
        latanie = new NieLatam();
        kwakanie = new Piszczenie();
    }

    @Override
    public void wyswietl() {
        System.out.println("wyświetlam gumową kaczkę");
    }
}
