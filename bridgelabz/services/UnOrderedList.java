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

import java.io.IOException;
import java.util.LinkedList;

import static bridgelabz.utility.Utility.fileReader;

public class UnOrderedList {

    /**
     * This is the main method or starting point of program.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        LinkedList<String> list = new LinkedList<String>();
        String[] dataArray = fileReader("E:\\BridgeLabs Training\\Java\\Data Structure\\DataStructurePrograms\\src\\Data.txt");
        for (String temp:dataArray) {
            list.add(temp);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
