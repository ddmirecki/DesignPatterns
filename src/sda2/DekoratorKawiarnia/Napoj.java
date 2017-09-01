package sda2.DekoratorKawiarnia;

/**
 * Created by Daniel on 2017-08-30.
 */
public abstract class Napoj {

    protected String opis;

    public String pobierzOpis(){
        return opis;
    }
    public abstract double koszt();


}
