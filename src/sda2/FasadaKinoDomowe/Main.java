package sda2.FasadaKinoDomowe;

/**
 * Created by Daniel on 2017-08-31.
 */
public class Main {
    public static void main(String[] args) {
        Telewizor tv = new Telewizor();
        ThermoMix tm = new ThermoMix();
        Wzmacniacz wzm = new Wzmacniacz();

        FasadaKinaDomowego fasada = new FasadaKinaDomowego(tv, wzm, tm);
        fasada.wrocDoDomu();
        System.out.println("-----------");
        fasada.wychodzeZDom();
    }
}
