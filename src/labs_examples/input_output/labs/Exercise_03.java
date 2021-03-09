package labs_examples.input_output.labs;

import javax.sound.midi.Sequence;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
        String inputPath1 = "src/labs_examples/input_output/files/byte_data";
        String inputPath2 = "src/labs_examples/input_output/files/byte_data2";
        FileInputStream file1 = null;
        FileInputStream file2 = null;
        SequenceInputStream sequence = null;
        try {
            file1 = new FileInputStream(inputPath1);
            file2 = new FileInputStream(inputPath2);
            sequence = new SequenceInputStream(file1, file2);
            int i;
            while ((i = sequence.read()) != -1) {
                System.out.print((char)i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}