package bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utility {

    /**
     * Method for read the txt file, Splits each line into words and store the words into array.
     *
     * @param filePath : Name of file or full path of file.
     * @throws IOException :
     */
    public static String[] fileReader(String filePath) throws IOException {
        String line;
        String[] wordsArray = new String[0];

        //Opens a file in read mode
        FileReader file = new FileReader(filePath);
        BufferedReader bufferReader = new BufferedReader(file);

        //Gets each line till end of file is reached
        while ((line = bufferReader.readLine()) != null) {
            //Splits each line into words
            wordsArray = line.split(" ");
        }
        bufferReader.close();
        return wordsArray;
    }
}
