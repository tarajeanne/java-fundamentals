package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) throws IOException {
        String inputPath = "./src/labs_examples/input_output/files/byte_data";
        String outputPath = "./src/labs_examples/input_output/files/byte_data_write";
        FileInputStream f = null;
        FileOutputStream of = null;
        BufferedInputStream bf = null;
        try {
            f = new FileInputStream(inputPath);
            bf = new BufferedInputStream(f);
            of = new FileOutputStream(outputPath);
            byte[] buffer = new byte[5];
            int bytesRead = 0;
            while ((bytesRead = bf.read(buffer)) != -1) {
                for (byte i : buffer) {
                    of.write(i);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (f != null) {
                f.close();
            }
            if (of != null) {
                of.close();
            }

        }


    }
}