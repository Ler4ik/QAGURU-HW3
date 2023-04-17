import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class SimpleTest {

    @Test
    void simple1(){
        assertTrue(true);
    }

    @Test
    void simple2(){
        assertTrue(true);
    }

    @Test
    void simple3(){
        assertTrue(true);
    }

    @Test
    void simple4(){
        assertTrue(true);
    }

    @Test
    void simple5(){
        assertTrue(false);
    }

    @Test
    void simple6(){
        assertTrue(false);
    }

    @Test
    @Disabled
    void simple7(){
        assertTrue(false);
    }

    @Test
    @Disabled
    void simple8(){
        assertTrue(false);
    }
}
