/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Sanuth
 */
public class GUIOutput implements MessageOutput{

    @Override
    public final void writeMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
