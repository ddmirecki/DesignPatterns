package sda2.ObserwatorWydawcaISukbsryber;

/**
 * Created by Daniel on 2017-08-30.
 */
public class KubaM implements IOdbiorca {
    private IWydawca _gazeta;

    public KubaM(IWydawca gazeta){
        zaprenumerujGazete(gazeta);
    }

    @Override
    public void odbierzGazete(String numer) {
        System.out.println("jest gazeta numer gazety \n" + numer);
    }

    public void rezygnujeZGazety(){
        _gazeta.usunPrenumeratora(this);
    }
    public void zaprenumerujGazete(IWydawca gazeta){
        _gazeta = gazeta;
        _gazeta.dodajPrenumeratora(this);
    }
}
