import javax.sound.sampled.*;

public class tone {

    public static void tone(int hz, int msecs) throws LineUnavailableException {
        float sampleRate = 44100;
        byte[] buf = new byte[1];
        AudioFormat af = new AudioFormat(sampleRate, 8, 1, true, false);
        try (SourceDataLine sdl = AudioSystem.getSourceDataLine(af)) {
            sdl.open(af);
            sdl.start();
            int numSamples = (int) (msecs * sampleRate / 1000); // correct sample count
            for (int i = 0; i < numSamples; i++) {
                double angle = i / (sampleRate / hz) * 2.0 * Math.PI;
                buf[0] = (byte) (Math.sin(angle) * 127);
                sdl.write(buf, 0, 1);
            }
            sdl.drain();
        }
    }
}
