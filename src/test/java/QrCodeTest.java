import com.google.zxing.WriterException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import window.Window;

public class QrCodeTest {

    @Test
    public void QrSuccesfullyGenerated() throws WriterException {
        Window window = new Window("https://medium.com/el-acordeon-del-programador");

        Assertions.assertNotNull(window.getIconImage());
    }
}