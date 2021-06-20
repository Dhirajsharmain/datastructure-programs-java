package bridgelabz.services;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import static bridgelabz.utility.Utility.fileReader;
import static bridgelabz.utility.Utility.fileWriter;

public class OrderedList {

    private static LinkedList<String> list = new LinkedList<String>();

    /**
     * This is the main method or starting point of program.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        String[] dataArray = fileReader("E:\\BridgeLabs Training\\Java\\Data Structure\\DataStructurePrograms\\src\\NumbersList.txt");
        for (String temp : dataArray) {
            list.add(temp);
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the you want to find : ");
//        String userInput = scanner.next();

        //fileWriter(list, "OutputNumbersList.txt");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
