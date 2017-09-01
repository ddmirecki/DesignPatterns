package sda2.DekoratorRPG;

/**
 * Created by Daniel on 2017-08-30.
 */
public class TarczaDrewniana extends TarczaDekorator {

    @Override
    double obrona() {
        return 10.5;
    }

    @Override
    public String pobierzOpis() {
        return "Tarcza Drewniana";
    }
}
