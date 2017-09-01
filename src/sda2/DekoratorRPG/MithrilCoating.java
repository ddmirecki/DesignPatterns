package sda2.DekoratorRPG;

/**
 * Created by Daniel on 2017-08-31.
 */
public class MithrilCoating extends TarczaDekorator {
    Tarcza _tarcza;

    public MithrilCoating(Tarcza tarcza){
        _tarcza = tarcza;
    }

    @Override
    double obrona() {
        return _tarcza.obrona() + 5.5;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " plus mithril";
    }
}
