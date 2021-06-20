/**
 * ****************************************************************************
 * Purpose: This Class is implemented to Read the Text from a file, split it
 * into words and arrange it as Linked List. Take a user input to search a Word
 * in the List. If the Word is not found then add it o the list, and if it found
 * then remove the word from the List. In the end save the list into a file.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 16-06-2021 **********************************************************
 */
package bridgelabz.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;


public class UnOrderedList {
    private static LinkedList<String> list = new LinkedList<String>();

    /**
     * This is the main method or starting point of program.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        String[] dataArray = fileReader("E:\\BridgeLabs Training\\Java\\Data Structure\\DataStructurePrograms\\src\\Data.txt");
        for (String temp : dataArray) {
            list.add(temp);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the you want to find : ");
        String userInput = scanner.next();

        editFile(userInput);

        fileWriter(list);

    }

    /**
     * Method for read the txt file, Splits each line into words and store the words into array.
     *
     * @param filePath : Name of file or full path of file.
     * @throws IOException :
     */
    private static String[] fileReader(String filePath) throws IOException {
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

    /**
     * Method for write the txt file, fetch words from list and write into txt file .
     *
     * @param list : new word stored list
     * @throws IOException
     */
    public static void fileWriter(LinkedList<String> list) throws IOException {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str = str.concat(list.get(i)).concat(" ");
        }
        FileWriter fileWriter = new FileWriter("E:\\BridgeLabs Training\\Java\\Data Structure\\DataStructurePrograms\\src\\OutputData.txt");
        for (int i = 0; i < str.length(); i++) {
            fileWriter.write(str.charAt(i));
        }
        System.out.println("Writing successful");
        fileWriter.close();
    }

    /**
     * Method for checking if word is present in the list. if , remove from list else
     * store into the list.
     *
     * @param word : sring or word queried by user
     */
    private static void editFile(String word) {
        if (list.contains(word)) {
            list.remove(word);
        } else {
            list.add(word);
        }
    }
}
