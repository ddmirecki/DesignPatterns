package sda2.StrategiaPodatki;

/**
 * Created by Daniel on 2017-08-28.
 */
public class Product1 implements IProduct {
    private String name = "duper";
    private int priceNetto = 100;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPriceNetto() {
        return priceNetto;
    }
}
