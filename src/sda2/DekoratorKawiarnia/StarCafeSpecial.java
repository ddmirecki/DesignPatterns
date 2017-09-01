package sda2.DekoratorKawiarnia;

/**
 * Created by Daniel on 2017-08-30.
 */
public class StarCafeSpecial extends Napoj {

    public StarCafeSpecial(){
        opis = " StarCafeSpecial";
    }

    @Override
    public double koszt() {
       return 10.99;
    }


}
