
import javax.sound.sampled.LineUnavailableException;

public class hey_song {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        int bpm = 120;
        double beatLength = 60.0 / bpm;

        long whole = (long) (4 * beatLength * 1000);
        long wholeplus1 = (long) (5 * beatLength * 1000);
        long hey = (long) (3.5 * beatLength * 1000);
        long half = (long) (2 * beatLength * 1000);
        long one_and_a_half = (long) (1.5 * beatLength * 1000);
        long dotted_half = (long) (3 * beatLength * 1000);
        long quarter = (long) (beatLength * 1000);
        long eighth = (long) (beatLength * 1000 / 2);
        long sixteenth = (long) (beatLength * 1000 / 4);
        try {
            tone.tone((int) 311.13, (int)hey);
            tone.tone((int) 311.13, (int)eighth);
            tone.tone((int) 293.66, (int)hey);
            tone.tone((int) 293.66, (int)eighth);
            tone.tone((int) 261.63, (int)wholeplus1);

            tone.tone((int) 0, (int)quarter); // rest

            tone.tone((int) 261.63, (int)quarter);
            tone.tone((int) 293.66, (int)quarter);

            tone.tone((int) 311.13, (int)hey);
            tone.tone((int) 311.13, (int)eighth);
            tone.tone((int) 293.66, (int)hey);
            tone.tone((int) 293.66, (int)eighth);
            tone.tone((int) 261.63, (int)wholeplus1);

            tone.tone((int) 0, (int)quarter); // rest

            tone.tone((int) 261.63, (int)quarter);
            tone.tone((int) 293.66, (int)quarter);

            tone.tone((int) 311.13, (int)hey);
            tone.tone((int) 311.13, (int)eighth);
            tone.tone((int) 293.66, (int)hey);
            tone.tone((int) 293.66, (int)eighth);
            
            tone.tone((int) 349.23, (int)dotted_half);
            tone.tone((int) 0, (int)eighth); // rest
            tone.tone((int) 349.23, (int)eighth);
            tone.tone((int) 329.63, (int)whole);

            tone.tone((int) 0, (int)eighth); // rest

            tone.tone((int) 261.63, (int)eighth);
            tone.tone((int) 261.63, (int)eighth);
            tone.tone((int) 261.63, (int)eighth);
            tone.tone((int) 261.63, (int)eighth);
            tone.tone((int) 261.63, (int)eighth);
            tone.tone((int) 261.63, (int)eighth);
            tone.tone((int) 261.63, (int)eighth);

            // 1

            tone.tone((int) 349.23, (int)quarter);
            tone.tone((int) 349.23, (int)quarter);
            tone.tone((int) 311.13, (int)quarter);

            tone.tone((int) 0, (int)one_and_a_half);

            tone.tone((int) 466.16, (int)eighth);
            tone.tone((int) 466.16, (int)eighth);
            tone.tone((int) 466.16, (int)eighth);

            tone.tone((int) 261.63, (int)quarter);
            tone.tone((int) 261.63, (int)quarter);

            // 2 

            tone.tone((int) 349.23, (int)quarter);
            tone.tone((int) 349.23, (int)quarter);
            tone.tone((int) 311.13, (int)quarter);

            tone.tone((int) 0, (int)one_and_a_half);

            tone.tone((int) 466.16, (int)eighth);
            tone.tone((int) 466.16, (int)eighth);
            tone.tone((int) 466.16, (int)eighth);

            tone.tone((int) 261.63, (int)quarter);
            tone.tone((int) 261.63, (int)quarter);

            // 3

            tone.tone((int) 349.23, (int)quarter);
            tone.tone((int) 349.23, (int)quarter);
            tone.tone((int) 311.13, (int)quarter);

            tone.tone((int) 0, (int)one_and_a_half);

            tone.tone((int) 466.16, (int)eighth);
            tone.tone((int) 466.16, (int)eighth);
            tone.tone((int) 466.16, (int)eighth);

            tone.tone((int) 261.63, (int)quarter);
            tone.tone((int) 261.63, (int)quarter);

            // bla bla bla go fight win

        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

}