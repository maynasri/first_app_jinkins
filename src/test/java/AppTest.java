import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testGreet() {
        Main app = new Main();
        assertEquals("Hello, World!", app.greet("World"));
    }
}
