import com.practice.qrcodegenerator.domain.WindowDataForm;
import com.practice.qrcodegenerator.domain.WindowQrCode;
import com.google.zxing.WriterException;
import com.practice.qrcodegenerator.service.Service;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Service service = new Service();
        service.servicio();
    }
}
