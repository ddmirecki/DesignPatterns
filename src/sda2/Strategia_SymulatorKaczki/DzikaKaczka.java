package sda2.Strategia_SymulatorKaczki;

/**
 * Created by Daniel on 2017-08-28.
 */
public class DzikaKaczka extends Kaczka {
    public DzikaKaczka(){
        latanie = new LatamBoMamSkrzydla();
        kwakanie = new Kwacz();
    }

    @Override
    public void wyswietl(){
        System.out.println("wyświetlam dziką kaczkę!");
    }
}
