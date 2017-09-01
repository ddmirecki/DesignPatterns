package sda2.StrategiaPodatki;

/**
 * Created by Daniel on 2017-08-28.
 */
public class Niemcy implements ICalculateTax {
    double podatekNiemiec = 1.30;

    @Override
    public double calulate(double kwota) {
        return kwota*podatekNiemiec;
    }
}
