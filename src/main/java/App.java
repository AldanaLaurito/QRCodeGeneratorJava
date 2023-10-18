import window.Window;
import com.google.zxing.WriterException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        try {
            Window window = new Window("https://medium.com/el-acordeon-del-programador");

            window.setVisible(true);

        } catch (WriterException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, "null", ex);
        }
    }
}
