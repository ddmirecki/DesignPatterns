package sda2.AdapterAnalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Daniel on 2017-08-31.
 */
public class Main {
    public static void main(String[] args) {
    RadioFM radioFM = new RadioFM();
        AnalogToDigitalAdapter adapter = new AnalogToDigitalAdapter(radioFM);
        int[] digit = adapter.getDigit();


        for (int adapter1 : digit) {
            System.out.println(adapter1);
        }


//        for (int i = 0; i < radioFM.getAnalog().length ; i++) {
//            System.out.println(radioFM.getAnalog()[i]);
//        }

//        for (int i = 0; i < analog.length; i++) {
//            System.out.println(analog[i]);
//        }
//        System.out.println("----------------");
//        StringBuilder sb = new StringBuilder();
//        int counter = 0;
//        int[] ints = new int[80];
//        int[] digits = new int[80];
//        int temp = 0;
//        String[] bin = new String[80];
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < analog.length; i = i + 8) {
//            for (int j = i; j < i+8 ; j++) {
//                if(analog[j] <1.0){
//                    ints[j] = 0;
//                }else{
//                    ints[j] = 1;
//                }
//                stringBuilder.append(ints[j]);
//                System.out.println(ints[j]);
//                bin[j] = String.valueOf(ints[j]);
//            }
//
//            digits[counter] = temp;
//            temp = 0;
//            counter++;
//            System.out.println("++++++++++");
//
//        }
//        String s = stringBuilder.toString();
//        System.out.println(Arrays.toString(bin));
//        System.out.println(s);
//        System.out.println(Arrays.toString(digits));
//
//        Random random = new Random();
//        double[] zzz = random.doubles(80, 0.0, 2.0).toArray();
//        double[] doubles = Arrays.copyOfRange(zzz, 0, 8);




    }




}
