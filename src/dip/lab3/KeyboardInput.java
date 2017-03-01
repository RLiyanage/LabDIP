/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author Sanuth
 */
public class KeyboardInput implements MessageInput {

    @Override
    public final String pickUpMessage() {
        System.out.println("Please enter the message:");
        Scanner keyboard = new Scanner(System.in);
        String message = keyboard.nextLine();
        return validateMessage(message);
    }

    @Override
    public final String validateMessage(String message) {
        if (message == null || message.isEmpty()) {
            System.out.println(" Plese enter valid message");
        }
        return message;
    }
}
