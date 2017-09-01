package sda2.ObserwatorPogoda;

/**
 * Created by Daniel on 2017-08-29.
 */
public class WarunkiBierzace implements IWyswietl, IObserwator {
    private float _temperatura;
    private float _cisnienie;
    private float _wilgotnosc;
    private IPodmiot _danePogodowe;

    public WarunkiBierzace(IPodmiot danePogodowe){
        _danePogodowe = danePogodowe;
        _danePogodowe.zarejestrujObserwatora(this);
    }


    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f, %f, %f, ", _temperatura, _cisnienie, _wilgotnosc);
    }

    @Override
    public void aktualizuj(float temperatura, float cisnienie, float wilgotnosc) {
        _cisnienie = cisnienie;
        _temperatura = temperatura;
        _wilgotnosc = wilgotnosc;
        wyswietl();
    }
}
