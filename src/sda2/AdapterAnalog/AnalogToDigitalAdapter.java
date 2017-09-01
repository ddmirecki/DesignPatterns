package sda2.AdapterAnalog;

/**
 * Created by Daniel on 2017-08-31.
 */
public class AnalogToDigitalAdapter implements IDigitalSignal {
    private IAnalogSignal _iAnalogSignal;

    public AnalogToDigitalAdapter(IAnalogSignal analogSignal) {
        _iAnalogSignal = analogSignal;
    }

    private int[] analogToDigitalSignal() {
        double[] analog = _iAnalogSignal.getAnalog();
        int[] digital = new int[10];
        int counter = 0;
        int licznik2 = 0;
        int sum = 0;

        for (int i = 0; i < analog.length; i = i + 8) {
            for (int j = i; j < i + 8; j++) {
                if (analog[j] > 1.0) {
                    sum += Math.pow(2, counter);
                }
                counter++;
            }
            counter = 0;
            digital[licznik2] = sum;
            sum = 0;
            licznik2++;
        }
        return  digital;
    }


    @Override
    public int[] getDigit() {
        return analogToDigitalSignal();
    }

    @Override
    public void setDigit(int[] digitData) {

    }

    @Override
    public void printDigit() {

    }
}
