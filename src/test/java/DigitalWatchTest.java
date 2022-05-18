package test.java;

import main.java.AlarmModule;
import main.java.DigitalWatch;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalWatchTest {

    public static DigitalWatch x;
    public static AlarmModule y;
    @BeforeAll
    public static void init() {
        x = new DigitalWatch();
        y = new AlarmModule();
    }
    // Make sure class DigitalWatch extends AlarmModule
    @Nested
    class BottomUp {
        @Test
        public void testam() {
            assertFalse(y.check());
            assertFalse(y.unset());
            assertTrue(y.set());
            assertTrue(y.check());
            assertTrue(y.set());
            assertFalse(y.set());
            assertTrue(y.unset());
        }


        @Test
        public void testdw1(){
            assertTrue(x.input('t'));
        }

        @Test
        public void testdw2(){
            assertTrue(x.input('a'));
        }

        @Test
        public void testdw3(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw4(){
            assertTrue(x.input('c'));
        }

        @Test
        public void testdw5(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw6(){
            assertTrue(x.input('u'));
        }

        @Test
        public void testdw7(){
            assertTrue(x.input('t'));
        }

        @Test
        public void testdw8(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw9(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw10(){
            assertTrue(x.input('m'));
        }

        @Test
        public void testdw11(){
            assertTrue(x.input('D'));
        }

        @Test
        public void testdw12(){
            assertTrue(x.input('M'));
        }

        @Test
        public void testdw13(){
            assertTrue(x.input('Y'));
        }

        @Test
        public void testdw14(){
            assertTrue(x.input('t'));
        }
    }

    // Make sure class DigitalWatch extends AlarmModStub
    @Nested
    class TopDown{

        @Test
        public void testdw1(){
            assertTrue(x.input('t'));
        }

        @Test
        public void testdw2(){
            assertTrue(x.input('a'));
        }

        @Test
        public void testdw3(){
            assertTrue(x.input('u'));
        }

        @Test
        public void testdw4(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw5(){
            assertTrue(x.input('c'));
        }

        @Test
        public void testdw6(){
            assertTrue(x.input('t'));
        }

        @Test
        public void testdw7(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw8(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw9(){
            assertTrue(x.input('m'));
        }

        @Test
        public void testdw10(){
            assertTrue(x.input('D'));
        }

        @Test
        public void testdw11(){
            assertTrue(x.input('M'));
        }

        @Test
        public void testdw12(){
            assertTrue(x.input('Y'));
        }

        @Test
        public void testdw13(){
            assertTrue(x.input('t'));
        }

        @Test
        public void testam(){
            assertFalse(y.check());
            assertFalse(y.unset());
            assertTrue(y.set());
            assertTrue(y.check());
            assertTrue(y.set());
            assertFalse(y.set());
            assertTrue(y.unset());
        }

    }
}
