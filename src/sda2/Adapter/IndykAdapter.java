package sda2.Adapter;

/**
 * Created by Daniel on 2017-08-31.
 */
public class IndykAdapter implements IKaczka {
    private IIndyk _iIndyk;

    public IndykAdapter(IIndyk iIndyk){
        _iIndyk = iIndyk;
    }

    @Override
    public void kwacz() {
        _iIndyk.gulgocze();
    }

    @Override
    public void lataj() {
    _iIndyk.lataj();
    }
}
