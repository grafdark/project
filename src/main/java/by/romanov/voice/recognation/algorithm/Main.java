package by.romanov.voice.recognation.algorithm;

import biz.source_code.dsp.sound.IirFilterAudioInputStream;

/**
 * Created by graf on 20.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("kku");
        AudioReader audioReader = new AudioReader();
        System.out.println(audioReader.readByte("C:\\test.wav").length);
//        IirFilterAudioInputStream iirFilterAudioInputStream;
//        HashMap
//        Recognation recognation = new Recognation();
//        recognation.getArrayAudioSample();

      //  System.out.println(.length);
        System.out.println(AudioReader.toDoubleArray(audioReader.readByte("C:\\test.wav")).length);
        System.out.println("close");
    }
}
