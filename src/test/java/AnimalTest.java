import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    // declare objects
    private Animal rax = new Dog("Rax");
    private Animal cat = new Cat("Cat");

    @Test
    void testDogSound(){
        assertEquals("Dog Barks", rax.sounds(),"This test passes : Expected = Actual");
        assertNotEquals("barks", rax.sounds(), "This test case fails due to incorrect output : Bark v barks");

    }
    @Test
    void testDogEats(){
        assertEquals("Rax eats", rax.eat(), "This test case passes : Expected = Actual");
        assertNotEquals("food", rax.eat(), "This test case fails due to case sensitivity of expected output : Food v food");

        /* Extra functionality on test cases to ignore case sensitivity

        *  compareToReturns 0 if two values that are being compared
        *  are the same /equal. So for the test to pass the return value
        *  must be >= ==> true
        */
        assertEquals (true,"rax eats".compareToIgnoreCase(rax.eat()) >= 0,"This test should pass because the test case is not case sensitive");

    }
    @Test
    void testCatSound(){
        assertNotEquals("Barkark", cat.sounds(), "This test case fails due to incorrect expected output");
        assertEquals("Cat Meows", cat.sounds(), "This is test case passes : Expected = Actual");


    }
    @Test
    void testCatEats(){
        assertNotEquals("meat", cat.eat(), "This test case fails : Food v meat ");
        assertEquals("Cat eats", cat.eat() , "This test case passes : Expected = Actual");
        assertNotEquals("food", cat.eat(), "This test case fails due to case sensitivity : Food v food");

        // Extra functionality on test cases to ignore case sensitivity
        assertEquals( true, "food".compareToIgnoreCase(cat.eat()) >= 0 , "This test case passes because 'Food' and and 'food'  are now viewed the same by compareToIgnoreCase");
    }
}