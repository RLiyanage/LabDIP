/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Sanuth
 */
public class FileInput implements MessageInput {


    @Override
    public final String pickUpMessage() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = keyboard.nextLine();
        File file = new File(filename);
        String str = "";
        try {
            try (Scanner inputFile = new Scanner(file)) {
                while (inputFile.hasNext()) {
                    str += inputFile.nextLine()+ "\n";
                    
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }
        return validateMessage(str);
    }

    @Override
    public final String validateMessage(String message) {
        if (message == null || message.isEmpty()){
            System.out.println("here is no data in the file.");
        }
        return message;
    }
}
