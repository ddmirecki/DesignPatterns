package sda2.Strategia_SymulatorKaczki;

/**
 * Created by Daniel on 2017-08-28.
 */
public class Main {
    public static void main(String[] args) {
        PlaskonosKaczka plaskonosKaczka = new PlaskonosKaczka();
        DzikaKaczka dzikaKaczka = new DzikaKaczka();
        GumowaKaczka gumowaKaczka = new GumowaKaczka();
        KaczkaWabik kaczkaWabik = new KaczkaWabik();

//        gumowaKaczka.wyswietl();
//        gumowaKaczka.wykonajKwakanie();
//        gumowaKaczka.wykonajLatanie();
//        plaskonosKaczka.wykonajKwakanie();
//        plaskonosKaczka.wykonajLatanie();

        KaczkaModel kaczkaModel = new KaczkaModel();
        kaczkaModel.wyswietl();
        kaczkaModel.wykonajLatanie();
        kaczkaModel.setLatanie(new LotZNapedemRakietowym());
        kaczkaModel.wykonajLatanie();
    }
}
