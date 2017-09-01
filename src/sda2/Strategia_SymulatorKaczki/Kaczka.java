package sda2.Strategia_SymulatorKaczki;

/**
 * Created by Daniel on 2017-08-28.
 */
public abstract class Kaczka {
   protected ILatanie latanie;
   protected IKwakanie kwakanie;
//    public void kwacz(){
//        System.out.println("kwa kwa!");
//    }
    public void plywaj(){
        System.out.println("pływu pływu");
    }
    public void wyswietl(){
        System.out.println("wyświetlam kaczkę!");
    }

    public void wykonajLatanie(){
        latanie.lec();
    }
    public void wykonajKwakanie(){
        kwakanie.kwacz();
    }

    public void setKwakanie(IKwakanie kwakanie){
        this.kwakanie = kwakanie;
    }
    public void setLatanie(ILatanie latanie){
        this.latanie = latanie;
    }

//    public void lec(){
//        System.out.println("kaczka lataczka!");
//    }


}
