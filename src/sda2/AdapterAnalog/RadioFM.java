package sda2.AdapterAnalog;

import java.util.Random;

/**
 * Created by Daniel on 2017-08-31.
 */
public class RadioFM implements IAnalogSignal {
    private double[] _analog = new double[80];



    @Override
    public double[] getAnalog() {
//        double[] analog = new double[80];
        double rangeMin = 0.0;
        double rangeMax = 2.0;
        for (int i = 0; i < 80; i++) {
            Random r = new Random();
            _analog[i] = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        }
        return _analog;
    }

    @Override
    public void setAnalog(double[] analogData) {
        _analog = analogData;

    }

    @Override
    public void printAnalog() {

    }
}
