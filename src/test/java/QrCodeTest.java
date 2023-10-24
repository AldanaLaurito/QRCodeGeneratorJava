import com.google.zxing.WriterException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.practice.qrcodegenerator.domain.WindowQrCode;

public class QrCodeTest {

    @Test
    public void QrSuccesfullyGenerated() throws WriterException {
        WindowQrCode windowQrCode = new WindowQrCode("https://medium.com/el-acordeon-del-programador");

        Assertions.assertNotNull(windowQrCode.getIconImage());
    }
}