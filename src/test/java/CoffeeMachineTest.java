package test.java;

import main.java.CoffeeMachine;
import main.java.CoffeeStorage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {

    public static CoffeeMachine x;
    public static CoffeeStorage y;
    @BeforeAll
    public static void init(){
        x = new CoffeeMachine();
        y = new CoffeeStorage();
    }
    // Make sure class CoffeeMachine extends CoffeeStorage
    @Nested
    class BottomUp{
        @Test
        public void testCr(){
            assertFalse(y.useBeans());
            assertFalse(y.useWater());
            assertFalse(y.useMilk());
            assertFalse(y.useChocolate());
            y.refillBeans(1);
            y.refillWater(1);
            y.refillMilk(1);
            y.refillChocolate(1);
            assertTrue(y.useBeans());
            assertTrue(y.useWater());
            assertTrue(y.useMilk());
            assertTrue(y.useChocolate());
        }


        @Test
        public void testCm1(){
            assertFalse(x.input('c'));
        }

        @Test
        public void testCm2(){
            assertFalse(x.input('l'));
        }

        @Test
        public void testCm3(){
            assertFalse(x.input('m'));
        }

        @Test
        public void testCm4(){
            assertTrue(x.input('r'));
        }

        @Test
        public void testCm5(){
            assertTrue(x.input('c'));
        }

        @Test
        public void testCm6(){
            assertTrue(x.input('m'));
        }

        @Test
        public void testCm7(){
            assertTrue(x.input('w'));
        }

        @Test
        public void testCm8(){
            assertTrue(x.input('b'));
        }

        @Test
        public void testCm9(){
            assertTrue(x.input('v'));
        }

        @Test
        public void testCm10(){
            assertTrue(x.input('c'));
        }

    }

    // Make sure class CoffeeMachine extends CoffeeResStub
    @Nested
    class TopDown{
        @Test
        public void testCm1(){
            assertTrue(x.input('c'));
        }

        @Test
        public void testCm2(){
            assertTrue(x.input('l'));
        }

        @Test
        public void testCm3(){
            assertTrue(x.input('m'));
        }

        @Test
        public void testCm4(){
            assertTrue(x.input('r'));
        }

        @Test
        public void testCm5(){
            assertTrue(x.input('c'));
        }

        @Test
        public void testCm6(){
            assertTrue(x.input('m'));
        }

        @Test
        public void testCm7(){
            assertTrue(x.input('w'));
        }

        @Test
        public void testCm8(){
            assertTrue(x.input('b'));
        }

        @Test
        public void testCm9(){
            assertTrue(x.input('v'));
        }

        @Test
        public void testCm10(){
            assertTrue(x.input('c'));
        }

        @Test
        public void testCr(){
            assertFalse(y.useBeans());
            assertFalse(y.useWater());
            assertFalse(y.useMilk());
            assertFalse(y.useChocolate());
            y.refillBeans(1);
            y.refillWater(1);
            y.refillMilk(1);
            y.refillChocolate(1);
            assertTrue(y.useBeans());
            assertTrue(y.useWater());
            assertTrue(y.useMilk());
            assertTrue(y.useChocolate());
        }

    }



}