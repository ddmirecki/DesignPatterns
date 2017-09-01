package sda2.Adapter;


/**
 * Created by Daniel on 2017-08-31.
 */
public class KaczkaAdapter implements IIndyk {
    private IKaczka _iKaczka;

    public KaczkaAdapter(IKaczka iKaczka){
        _iKaczka = iKaczka;
    }

    @Override
    public void gulgocze() {
        _iKaczka.kwacz();
    }

    @Override
    public void lataj() {
    _iKaczka.lataj();
    }
}
