package sda2.DekoratorRPG;

/**
 * Created by Daniel on 2017-08-30.
 */
public abstract class Tarcza {

    protected String opis;

    abstract double obrona();

    public String pobierzOpis(){
        return opis;
    };
}
