package labs_examples.input_output.labs;
import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

public class Exercise_02 {
    public static void main (String[] args) {
        String inputPath = "./src/labs_examples/input_output/files/char_data.txt";
        String outputPath = "./src/labs_examples/input_output/files/char_data_output.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            try(FileWriter w = new FileWriter(outputPath)) {
                encrypt(br, w);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try(BufferedReader br = new BufferedReader(new FileReader(outputPath))) {
            try(FileWriter w = new FileWriter(inputPath)) {
                decrypt(br, w);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void encrypt(BufferedReader input, Writer output) throws IOException{
        String l;
        while ((l = input.readLine()) != null) {
            for (int i = 0; i < l.length(); i++) {
                char curr = l.charAt(i);
                if (curr == 't') {
                    curr = '-';
                }
                output.write(curr);
            }
            output.write("\n");
        }
    }
    public static void decrypt(BufferedReader input, Writer output) throws IOException {
        String l;
        while ((l = input.readLine()) != null) {
            for (int i = 0; i < l.length(); i++) {
                char curr = l.charAt(i);
                if (curr == '-') {
                    curr = 't';
                }
                output.write(curr);
            }
            output.write("\n");
        }
    }
}