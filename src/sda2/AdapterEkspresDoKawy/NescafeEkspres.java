package sda2.AdapterEkspresDoKawy;

/**
 * Created by Daniel on 2017-09-01.
 */
public class NescafeEkspres implements INescafe {
    @Override
    public void kawaNescafe() {
        System.out.println("Nesca zrobiona");
    }

    @Override
    public void getNescafeKaps() {
        System.out.println("podaje kapsulke nescafe");
    }
}
