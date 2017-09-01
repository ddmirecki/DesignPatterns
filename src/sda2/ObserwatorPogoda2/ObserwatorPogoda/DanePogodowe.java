package sda2.ObserwatorPogoda2.ObserwatorPogoda;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by Daniel on 2017-08-29.
 */
public class DanePogodowe extends Observable{
    // deklaracja zmiennych obiektowych


    private float _temperatura;
    private float _cisnienie;
    private float _wilgotnosc;


    public DanePogodowe(){
    }

    public void odczytZmiennych(){
        setChanged();
        notifyObservers();
    }



    public void ustawZmienne(float temperatura, float cisnienie, float wilgotnosc){
        _temperatura = temperatura;
        _cisnienie = cisnienie;
        _wilgotnosc = wilgotnosc;
        odczytZmiennych();
    }

    public float getTemperatura(){
        return _temperatura;
    }
    public float getCisnienie(){
        return _cisnienie;
    }
    public float getWilgotnosc(){
        return _wilgotnosc;
    }

}
