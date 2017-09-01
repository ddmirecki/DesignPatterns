package sda2.ObserwatorPogoda;

/**
 * Created by Daniel on 2017-08-29.
 */
public interface IPodmiot {

    void zarejestrujObserwatora(IObserwator o);
    void usunObserwatora(IObserwator o);
    void powiadomObserwatora();
}
