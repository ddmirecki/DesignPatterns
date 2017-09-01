package sda2.ObserwatorWydawcaISukbsryber;

/**
 * Created by Daniel on 2017-08-30.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        KaczorDonald kd = new KaczorDonald();
        Fakt fakt = new Fakt();
        KubaM km = new KubaM(kd);

        kd.wydajNumer("KD 1");
        Thread.sleep(4000);
        kd.wydajNumer("KD 2");

        km.rezygnujeZGazety();


    }
}
