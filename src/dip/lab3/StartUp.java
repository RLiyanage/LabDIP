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
       MessageInput input = new KeyboardInput();
       MessageOutput output = new GUIOutput();

       MessageService messageService = new MessageService(input,output);
       //MessageService messageService1 = new MessageService (input,output);       
       messageService.produceMessage();
       //messageService1.produceMessage();
    }
}
