package sda2.AdapterAnalog;

/**
 * Created by Daniel on 2017-08-31.
 */
public interface IAnalogSignal {
    double[] getAnalog();
    void setAnalog(double[] analogData);
    void printAnalog();
}
