package com.practice.qrcodegenerator.service;

import com.google.zxing.WriterException;
import com.practice.qrcodegenerator.domain.WindowQrCode;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Service {
    boolean continueFlow = true;
    String textToConvertToQr;

    public void servicio(){
        JFrame windowFrame = new JFrame();
        JLabel tag = new JLabel("");
        windowFrame.setBounds(20,20,20,20);
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.getContentPane().add(tag);
        windowFrame.pack();

        try {
                while(continueFlow){
                    textToConvertToQr = JOptionPane.showInputDialog(
                            windowFrame,
                            "Write link/text to transform to QR code:\n",
                            "Data Form",
                            JOptionPane.PLAIN_MESSAGE);

                    if((textToConvertToQr == null) || (textToConvertToQr.length() == 0)){
                        int option = JOptionPane.showConfirmDialog(windowFrame, "Do you want to close the program?");
                        /*
                        JOptionPane optionPane = new JOptionPane(
                                "The only way to close this dialog is by",
                                JOptionPane.QUESTION_MESSAGE,
                                JOptionPane.YES_NO_OPTION);

                         */

                        /*
                        if(!optionPane.getWantsInput())
                            continueFlow = false;

                         */
                        if(option == 0)
                            continueFlow = false;
                }else{
                        continueFlow = false;
                    }
            }


            if(textToConvertToQr != null && textToConvertToQr.length() > 0) {
                new WindowQrCode(textToConvertToQr);
            } else {
                System.exit(0);
            }
        } catch (WriterException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, "Text to convert to QR: " + textToConvertToQr, ex);
            JOptionPane.showMessageDialog(windowFrame,
                    "Error occurred while generating the QR Code.",
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
