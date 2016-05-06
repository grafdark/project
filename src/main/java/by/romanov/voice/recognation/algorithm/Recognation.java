package by.romanov.voice.recognation.algorithm;

import biz.source_code.dsp.math.Complex;
import biz.source_code.dsp.transform.Dft;

import javax.sound.sampled.AudioFormat;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Voice;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/**
 * Created by graf on 19.04.2016.
 */
public class Recognation {
    AudioReader audioReader = new AudioReader();
    Voice voice = new Voice();
    SynthesizerModeDesc synthesizerModeDesc = new SynthesizerModeDesc();
    public void getArrayAudioSample(){
     //   System.out.println(Dft.goertzel(audioReader.voiceInput()));

//        Complex[] array = Dft.directDft(audioReader.voiceInput("C:\\test.wav"));
//        for (int i = 0; i< array.length; i++){
//            System.out.println(array[i]);
//        }
    }


}
