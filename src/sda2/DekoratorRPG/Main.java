package sda2.DekoratorRPG;

/**
 * Created by Daniel on 2017-08-31.
 */
public class Main {
    public static void main(String[] args) {

        Tarcza tarcza = new TarczaDrewniana();
        MithrilCoating mc = new MithrilCoating(tarcza);

        System.out.println("tarcza: " +tarcza.pobierzOpis() + mc.pobierzOpis());

        System.out.println("Tarcza: " + tarcza.pobierzOpis() + tarcza.obrona() + "dodatek "
                + mc.pobierzOpis() + " obrona " + mc.obrona());
    }
}
