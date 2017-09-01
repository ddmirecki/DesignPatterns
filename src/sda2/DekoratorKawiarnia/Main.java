package sda2.DekoratorKawiarnia;

/**
 * Created by Daniel on 2017-08-30.
 */
public class Main {
    public static void main(String[] args) {

        MocnaPalona mp = new MocnaPalona();
        Czekolada czek = new Czekolada(mp);
        Mleko mleko = new Mleko(czek);

        System.out.println("Napój: " + mleko.pobierzOpis() + mleko.koszt());

        System.out.printf("Nazwa: %s :: Cena: %f", czek.pobierzOpis(), czek.koszt());


    }
}
