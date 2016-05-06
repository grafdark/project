package by.romanov.voice.recognation.algorithm;

import javax.sound.sampled.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by graf on 01.05.2016.
 */
public class MyAudioReader {

    private static final int SAMPLE_RATE = 44100;
    private int sampleSizeInBits = 16;
    private int channels = 1;          //Монофонический звук
    private boolean signed = true;     //Флаг указывает на то, используются ли числа со знаком или без
    private boolean bigEndian = true;

    public void getAudioSample() throws LineUnavailableException {
//        AudioFormat audioFormat = new AudioFormat(SAMPLE_RATE, sampleSizeInBits, channels, signed, bigEndian);
//        DataLine .Info info = new DataLine.Info(TargetDataLine.class, audioFormat);
//        final ByteArrayOutputStream out = new ByteArrayOutputStream();
//        final TargetDataLine line = (TargetDataLine) AudioSystem.getLine(info);
//        line.open(audioFormat);
//        line.s;
////        TargetDataLine targetDataLine = new TargetDataLine() {
////        }
    }
}
