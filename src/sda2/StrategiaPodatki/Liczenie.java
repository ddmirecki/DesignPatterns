package sda2.StrategiaPodatki;

import java.util.List;

/**
 * Created by Daniel on 2017-08-28.
 */
public class Liczenie {
    private ICalculateTax _calculateTax;
    private List<IProduct> _products;

    public Liczenie(ICalculateTax calculateTax, IProduct product){
        _calculateTax = calculateTax;
        _products = (List<IProduct>) product;
    }
//    public double getFullCost(IProduct product){
//        _products.

//    }

}
