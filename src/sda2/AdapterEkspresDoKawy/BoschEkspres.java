package sda2.AdapterEkspresDoKawy;

/**
 * Created by Daniel on 2017-09-01.
 */
public class BoschEkspres implements IBosch {
    @Override
    public void kawaBosch() {
        System.out.println("kawa bosch zrobiona");
    }

    @Override
    public void getBoschKaps() {
        System.out.println("podaje kapsulke Bosch");
    }
}
