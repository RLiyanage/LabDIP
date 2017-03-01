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
public class MessageService {
    private MessageInput messageInput;
    private MessageOutput messageOutput;
    public MessageService(MessageInput messageInput,MessageOutput messageOutput){
        setMessageInput(messageInput);
        setMessageOutput(messageOutput);

    }

    public void readMessage(){
        messageOutput.writeMessage(messageInput.pickUpMessage());
    }

    public void setMessageInput(MessageInput messageInput) {
        this.messageInput = messageInput;
    }

    public void setMessageOutput(MessageOutput messageOutput) {
        this.messageOutput = messageOutput;
    }
    
    
}
