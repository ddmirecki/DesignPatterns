package sda2.Adapter;

/**
 * Created by Daniel on 2017-08-31.
 */
public class DzikaKaczka implements IKaczka {
    @Override
    public void kwacz() {
        System.out.println("kwakwa!");
    }

    @Override
    public void lataj() {
        System.out.println("Fru Kaczka");
    }
}
