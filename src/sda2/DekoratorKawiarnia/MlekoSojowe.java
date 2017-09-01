package sda2.DekoratorKawiarnia;

/**
 * Created by Daniel on 2017-08-30.
 */
public class MlekoSojowe extends SkladnikiDekorator {
    private Napoj _napoj;

    public MlekoSojowe(Napoj napoj){
        _napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return _napoj.pobierzOpis() + " Mleko sojowe";
    }

    @Override
    public double koszt() {
        return _napoj.koszt() + 0.15;
    }
}
