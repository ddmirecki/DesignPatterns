package sda2.ObserwatorPogoda;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 2017-08-29.
 */
public class DanePogodowe implements IPodmiot {
    // deklaracja zmiennych obiektowych

    private List<IObserwator> _obserwatorzy;
    private float _temperatura;
    private float _cisnienie;
    private float _wilgotnosc;


    public DanePogodowe(){
        _obserwatorzy = new ArrayList<>();
    }

    public void odczytZmiennych(){
        powiadomObserwatora();
    }


    @Override
    public void zarejestrujObserwatora(IObserwator obserwator) {
        _obserwatorzy.add(obserwator);
    }

    @Override
    public void usunObserwatora(IObserwator obserwator) {
    _obserwatorzy.remove(obserwator);
    }

    @Override
    public void powiadomObserwatora() {
    for(IObserwator obserwator: _obserwatorzy){
        obserwator.aktualizuj(_temperatura, _cisnienie, _wilgotnosc);
    }
    }

    public void ustawZmienne(float temperatura, float cisnienie, float wilgotnosc){
        _temperatura = temperatura;
        _cisnienie = cisnienie;
        _wilgotnosc = wilgotnosc;
        odczytZmiennych();
    }


}
