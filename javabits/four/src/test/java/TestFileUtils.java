import org.example.javabits.FileUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFileUtils {
    @Test
    void TestFileExtension() {
        var res = FileUtil.getFileExtension("src/test/resources/sample.html");
        assertEquals(res, "html");
    }

    @Test
    void TestFileExtension2() {
        assertThrows(NullPointerException.class, () -> {
            FileUtil.getFileExtension(null);
        });
    }

    @Test
    void TestFileExtension3() {
        assertEquals("", FileUtil.getFileExtension(""));
    }
}
