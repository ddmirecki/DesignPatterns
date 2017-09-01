package sda2.DekoratorKawiarnia;

/**
 * Created by Daniel on 2017-08-30.
 */
public class MocnaPalona extends Napoj {

    public MocnaPalona(){
        opis = "MocnoPalona";
    }

    @Override
    public double koszt() {
        return 0.99;
    }


}
