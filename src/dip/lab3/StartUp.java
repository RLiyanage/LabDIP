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
public class StartUp {
    public static void main(String[] args) {
       MessageInput keyboardInput = new KeyboardInput();
       MessageOutput consoleOutput = new ConsoleOutput();
       MessageInput fileInput = new FileInput();
       
       MessageService messageService = new MessageService(fileInput,consoleOutput);
       //messageService.doRead();
       messageService.readMessage();
    }
}
