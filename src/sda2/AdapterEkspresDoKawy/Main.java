package sda2.AdapterEkspresDoKawy;

/**
 * Created by Daniel on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {
        BoschEkspres boschEkspres = new BoschEkspres();
        NescafeEkspres nescafeEkspres = new NescafeEkspres();

        KapsulkaNescafeAdapter kapsulkaNescafeAdapter = new KapsulkaNescafeAdapter(nescafeEkspres);

        kapsulkaNescafeAdapter.getBoschKaps();
        kapsulkaNescafeAdapter.kawaBosch();
        System.out.println("---");
        boschEkspres.getBoschKaps();
        boschEkspres.kawaBosch();


    }
}
