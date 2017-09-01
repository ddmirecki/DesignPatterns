package sda2.ObserwatorPogoda2.ObserwatorPogoda;

/**
 * Created by Daniel on 2017-08-29.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        DanePogodowe dp = new DanePogodowe();
        WarunkiBierzace wb = new WarunkiBierzace(dp);

        dp.ustawZmienne(11, 1030, 45);

        Thread.sleep(10000);
        dp.ustawZmienne(15, 1050, 50);

    }
}
