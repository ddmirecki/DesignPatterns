package sda2.ObserwatorPogoda2.ObserwatorPogoda;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Daniel on 2017-08-29.
 */
public class WarunkiBierzace implements IWyswietl, Observer {
    private float _temperatura;
    private float _cisnienie;
    private float _wilgotnosc;
    private Observable _danePogodowe;

    public WarunkiBierzace(Observable danePogodowe){
        _danePogodowe = danePogodowe;
        danePogodowe.addObserver(this);
    }


    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f, %f, %f, ", _temperatura, _cisnienie, _wilgotnosc);
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof sda2.ObserwatorPogoda2.ObserwatorPogoda.DanePogodowe)
        _cisnienie = ((sda2.ObserwatorPogoda2.ObserwatorPogoda.DanePogodowe) o).getCisnienie();
        _temperatura = ((sda2.ObserwatorPogoda2.ObserwatorPogoda.DanePogodowe) o).getTemperatura();
        _wilgotnosc = ((sda2.ObserwatorPogoda2.ObserwatorPogoda.DanePogodowe) o).getWilgotnosc();
        wyswietl();
    }
}
