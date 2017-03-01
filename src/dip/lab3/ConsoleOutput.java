/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Sanuth
 */
public class ConsoleOutput implements MessageOutput{

    @Override
    public final void writeMessage(String message) {
        System.out.println("Message: \n" + message);
    }
   
}
