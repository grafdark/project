package by.romanov.voice.recognation.algorithm;

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.TransformType;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Created by graf on 20.04.2016.
 */
public class AudioReader {

    public static final int SAMPLE_RATE = 44100;

    private static final int BYTES_PER_SAMPLE = 2;                // 16-bit audio
    private static final int BITS_PER_SAMPLE = 16;                // 16-bit audio
    private static final double MAX_16_BIT = Short.MAX_VALUE;     // 32,767
    private static final int SAMPLE_BUFFER_SIZE = 4096;


    private static SourceDataLine line;   // to play the sound
    private static byte[] buffer;         // our internal buffer
    private static int bufferSize = 0;    // number of samples currently in internal buffer

    static {
        init();
    }

    private static void init() {


        try {
            // 44,100 samples per second, 16-bit audio, mono, signed PCM, little Endian
            AudioFormat format = new AudioFormat((float) SAMPLE_RATE, BITS_PER_SAMPLE, 1, true, false);
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

            line = (SourceDataLine) AudioSystem.getLine(info);
            line.open(format, SAMPLE_BUFFER_SIZE * BYTES_PER_SAMPLE);
            // the internal buffer is a fraction of the actual buffer size, this choice is arbitrary
            // it gets divided because we can't expect the buffered data to line up exactly with when
            // the sound card decides to push out its samples.
            buffer = new byte[SAMPLE_BUFFER_SIZE * BYTES_PER_SAMPLE / 3];
        } catch (LineUnavailableException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        // no sound gets made before this call
        line.start();
    }

    private AudioInputStream audioInputStream;

    /**
     * Reads audio samples from a file (in .wav or .au format) and returns
     * them as a double array with values between -1.0 and +1.0.
     *
     * @param path path and the name of the audio file
     * @return the array of samples
     */

    public double[] voiceInput(String path) {
        byte[] data = readByte(path);
        int N = data.length;
        double[] d = new double[N / 2];
        for (int i = 0; i < N / 2; i++) {
            d[i] = ((short) (((data[2 * i + 1] & 0xFF) << 8) + (data[2 * i] & 0xFF))) / ((double) MAX_16_BIT);
            //System.out.println(d[i]);
        }
        return d;
    }

    // return data as a byte array
    public static byte[] readByte(String filename) {
        byte[] data = null;
        AudioInputStream ais = null;
        try {
            // try to read from file
            File file = new File(filename);
            ais = AudioSystem.getAudioInputStream(file);
            data = new byte[ais.available()];
            ais.read(data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("Could not read " + filename);
        } catch (UnsupportedAudioFileException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(filename + " in unsupported audio format");
        }
        return data;
    }

    public static double[] toDoubleArray(byte[] byteArray) {
        int times = Double.SIZE / Byte.SIZE;
        System.out.println(times);
        double[] doubles = new double[byteArray.length / times];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = ByteBuffer.wrap(byteArray, i * times, times).getDouble();
            System.out.println(doubles[i]);
        }
        return doubles;
    }

    public static Complex[] fft(double[] doubleArray){

        FastFourierTransformer transformer = new FastFourierTransformer(DftNormalization.UNITARY);
        Complex[] complexNumbers = transformer.transform(doubleArray, TransformType.FORWARD);
        return complexNumbers;
    }

}
