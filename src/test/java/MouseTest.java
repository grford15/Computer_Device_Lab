import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {
    Mouse mouse;

    @Before
    public void setUp() throws Exception {
        mouse = new Mouse("Wireless");
    }

    @Test
    public void mouseHasType(){
        assertEquals("Wireless", mouse.getType());
    }

    @Test
    public void mouseCanClick() {
        assertEquals("Click click click", mouse.inputData());
    }
}
