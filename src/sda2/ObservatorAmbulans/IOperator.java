package sda2.ObservatorAmbulans;

/**
 * Created by Daniel on 2017-08-29.
 */
public interface IOperator {

    void registerObserver();
    void removeObserver();
    void notifyObserver();
}
