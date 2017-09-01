package sda2.Singleton;

/**
 * Created by Daniel on 2017-09-01.
 */
public class Singleton {

    private static Singleton _instancja;

    private Singleton(){
        System.out.println("singletton");
    }

    public static Singleton getInstance(){
        if(_instancja == null){
            _instancja = new Singleton();
        }
        return _instancja;
    }


}
