package sda2.DekoratorKawiarnia;

/**
 * Created by Daniel on 2017-08-30.
 */
public class Espresso extends Napoj {

    public Espresso(){
        opis = "Espresso";
    }

    @Override
    public double koszt() {
        return 1.99;
    }


}
