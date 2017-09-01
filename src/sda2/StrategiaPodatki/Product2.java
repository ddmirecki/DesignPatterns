package sda2.StrategiaPodatki;

/**
 * Created by Daniel on 2017-08-28.
 */
public class Product2 implements IProduct {
    private String name = "super";
    private int priceNetto = 10;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPriceNetto() {
        return priceNetto;
    }

}
