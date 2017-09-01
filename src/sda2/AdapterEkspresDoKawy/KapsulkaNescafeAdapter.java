package sda2.AdapterEkspresDoKawy;

/**
 * Created by Daniel on 2017-09-01.
 */
public class KapsulkaNescafeAdapter implements IBosch {
    private INescafe _inescafe;

    public KapsulkaNescafeAdapter(INescafe iNescafe){
        _inescafe = iNescafe;
    }


    @Override
    public void kawaBosch() {
        _inescafe.getNescafeKaps();
    }

    @Override
    public void getBoschKaps() {
    _inescafe.kawaNescafe();
    }
}
