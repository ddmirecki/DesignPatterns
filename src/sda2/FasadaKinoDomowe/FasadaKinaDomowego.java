package sda2.FasadaKinoDomowe;

/**
 * Created by Daniel on 2017-08-31.
 */
public class FasadaKinaDomowego {
    private Telewizor _telewizor;
    private Wzmacniacz _wzmacniacz;
    private ThermoMix _thermomix;

    public FasadaKinaDomowego(Telewizor telewizor, Wzmacniacz wzmacniacz, ThermoMix thermoMix){
        _telewizor = telewizor;
        _wzmacniacz = wzmacniacz;
        _thermomix = thermoMix;
    }

    public void wrocDoDomu(){
        _thermomix.robiePopcorn();
        _wzmacniacz.wlacz();
        _telewizor.wlacz();
        _telewizor.ustawKanal();
        _telewizor.ustawGlosnosc();
    }

    public void wychodzeZDom(){
        _thermomix.wyłącz();
        _telewizor.wylacz();
        _wzmacniacz.wylacz();
    }

}
