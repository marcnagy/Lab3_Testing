package test.java;

import main.java.ATM;
import main.java.ATMstorage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    public static ATM atm;
    public static ATMstorage atmStorage;

    // Make sure class ATM extends ATMStorageStub
    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            atm = new ATM();
            atmStorage = new ATMstorage();
        }

        @Test
        public void testatm1(){
            assertTrue(atm.input('l'));
        }

        @Test
        public void testatm2(){
            assertTrue(atm.input('w'));
        }

        @Test
        public void testatm3(){
            assertTrue(atm.input('d'));
        }

        @Test
        public void testatm4(){
            assertTrue(atm.input('o'));
        }

        @Test
        public void testatm5(){
            assertTrue(atm.input('u'));
        }

        @Test
        public void testatm6(){
            assertTrue(atm.input('f'));
        }

        @Test
        public void testatm7(){
            assertTrue(atm.input('l'));
        }

        @Test
        public void testatmStorage(){
            assertFalse(atmStorage.withdraw());
            atmStorage.fill(1);
            assertTrue(atmStorage.withdraw());
            assertFalse(atmStorage.withdraw());
            atmStorage.fill(3);
            assertTrue(atmStorage.withdraw());
            assertTrue(atmStorage.withdraw());
            assertTrue(atmStorage.withdraw());
        }

    }


    // Make sure class ATM extends ATMstorage
    @Nested
    class BottomUp{
        @BeforeAll
        public static void init(){
            atm = new ATM();
            atmStorage = new ATMstorage();
        }

        @Test
        public void testatmStorage(){
            assertFalse(atmStorage.withdraw());
            atmStorage.fill(1);
            assertTrue(atmStorage.withdraw());
            assertFalse(atmStorage.withdraw());
            atmStorage.fill(3);
            assertTrue(atmStorage.withdraw());
            assertTrue(atmStorage.withdraw());
            assertTrue(atmStorage.withdraw());
        }


        @Test
        public void testatm1(){
            assertTrue(atm.input('l'));
        }

        @Test
        public void testatm2(){
            assertFalse(atm.input('w'));
        }

        @Test
        public void testatm3(){
            assertTrue(atm.input('d'));
        }

        @Test
        public void testatm4(){
            assertTrue(atm.input('w'));
        }

        @Test
        public void testatm5(){
            assertTrue(atm.input('o'));
        }

        @Test
        public void testatm6(){
            assertTrue(atm.input('u'));
        }

        @Test
        public void testatm7(){
            assertTrue(atm.input('f'));
        }

        @Test
        public void testatm8(){
            assertTrue(atm.input('l'));
        }

        @Test
        public void testatm9(){
            assertTrue(atm.input('l'));
        }

    }

}