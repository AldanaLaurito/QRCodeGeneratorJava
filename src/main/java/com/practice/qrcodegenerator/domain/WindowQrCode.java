package com.practice.qrcodegenerator.domain;

import com.practice.qrcodegenerator.application.services.QrService;

import javax.swing.*;
import com.google.zxing.WriterException;
import java.awt.image.BufferedImage;

public class WindowQrCode extends JFrame {

    public WindowQrCode(String url) throws WriterException {
        QrService qrCodeGenerator = new QrService();
        BufferedImage image = qrCodeGenerator.createQR(url, 300, 300);
        ImageIcon icon = new ImageIcon(image);
        JLabel tag = new JLabel("");

        tag.setIcon(icon);

        this.setIconImage(image);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("QR code");
        this.getContentPane().add(tag);
        this.pack();
        this.setVisible(true);
    }
}
