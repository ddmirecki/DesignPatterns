package sda2.AdapterAnalog;

/**
 * Created by Daniel on 2017-08-31.
 */
public class DigitalRadio implements IDigitalSignal {
    private int[] _digitalRadio;


    @Override
    public int[] getDigit() {
        return _digitalRadio;
    }

    @Override
    public void setDigit(int[] digitData) {

    }

    @Override
    public void printDigit() {

    }
}
