package com.practice.qrcodegenerator.domain;

import com.google.zxing.WriterException;
import com.practice.qrcodegenerator.application.services.QrService;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class WindowDataForm extends JFrame {

    public WindowDataForm() throws WriterException {
        JLabel tag = new JLabel("");
        this.setBounds(20,20,20,20);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setTitle("Data Form");
        this.getContentPane().add(tag);
        this.pack();

        //ImageIcon icon = new ImageIcon();
        //tag.setIcon(icon);

        /*
        Object[] possibilities = {"ham", "spam", "yam"};
        String s = (String)JOptionPane.showInputDialog(
                this,
                "Complete the sentence:\n"
                        + "\"Green eggs and...\"",
                "Customized Dialog",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                possibilities,
                "ham");

         */

        String s = JOptionPane.showInputDialog(
                this,
                "Write link/text to transform to QR code:\n",
                "Data Form",
                JOptionPane.PLAIN_MESSAGE);

        //If a string was returned, say so.
        /*
        if ((s != null) && (s.length() > 0)) {
            setLabel("Green eggs and... " + s + "!");
            return;
        }

        //If you're here, the return value was null/empty.
        setLabel("Come on, finish the sentence!");

         */
    }
}
