package sda2.DekoratorKawiarnia;

/**
 * Created by Daniel on 2017-08-30.
 */
public class Bezkofeinowa extends Napoj {

    public Bezkofeinowa(){
        opis = "Bezkofeinowa";
    }

    @Override
    public double koszt() {
        return 1.05;
    }



}
