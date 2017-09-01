package sda2.Adapter;

import java.util.ArrayList;

/**
 * Created by Daniel on 2017-08-31.
 */
public class Main {
    public static void main(String[] args) {
        DzikiIndyk dzikiIndyk = new DzikiIndyk();
        DzikaKaczka dzikaKaczka = new DzikaKaczka();
        IndykAdapter ia = new IndykAdapter(dzikiIndyk);
        KaczkaAdapter ka = new KaczkaAdapter(dzikaKaczka);

        ArrayList<IKaczka> ptaki = new ArrayList<>();
        ptaki.add(dzikaKaczka);
        ptaki.add(ia);
        uruchomKwakanieILatanie(ptaki);
        ka.lataj();
        ka.gulgocze();
        ia.lataj();
        ia.kwacz();

    }


    public static void uruchomKwakanieILatanie(ArrayList<IKaczka> ptaki){
        for (IKaczka iKaczka : ptaki) {
            iKaczka.kwacz();
            iKaczka.lataj();

        }

    }
}
