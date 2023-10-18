package window;

import qrcode.GenerateQR;

import javax.swing.*;
import com.google.zxing.WriterException;
import java.awt.image.BufferedImage;

public class Window  extends JFrame {

    public Window(String url) throws WriterException {
        GenerateQR generaQR = new GenerateQR();
        BufferedImage imagen = generaQR.createQR(url, 300, 300);
        ImageIcon icono = new ImageIcon(imagen);
        JLabel etiqueta = new JLabel("");

        etiqueta.setIcon(icono);

        this.setIconImage(imagen);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ejemplo de codigo QR");
        this.getContentPane().add(etiqueta);
        this.pack();
    }
}
