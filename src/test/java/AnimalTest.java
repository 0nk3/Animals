import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    // declare objects
    private Dog dogObj = new Dog();
    private Cat catObj = new Cat();

    @Test
    void testDogSound(){
        assertEquals("Barks", dogObj.sounds(),"This test passes : Expected = Actual");
        assertNotEquals("barks", dogObj.sounds(), "This test case fails due to incorrect output : Bark v barks");

    }
    @Test
    void testDogEats(){
        assertEquals("Food", dogObj.eat(), "This test case passes : Expected = Actual");
        assertNotEquals("food", dogObj.eat(), "This test case fails due to case sensitivity of expected output : Food v food");

        /* Extra functionality on test cases to ignore case sensitivity

        *  compareToReturns 0 if two values that are being compared
        *  are the same /equal. So for the test to pass the return value
        *  must be >= ==> true
        */
        assert "Food".compareToIgnoreCase(dogObj.eat()) >= 0:"This test should pass because the test case is not case sensitive";

    }
    @Test
    void testCatSound(){
        assertNotEquals("Barkark", catObj.sounds(), "This test case fails due to incorrect expected output");
        assertEquals("Meow", catObj.sounds(), "This is test case passes : Expected = Actual");


    }
    @Test
    void testCatEats(){
        assertNotEquals("meat", catObj.eat(), "This test case fails : Food v meat ");
        assertEquals("Food", catObj.eat() , "This test case passes : Expected = Actual");
        assertNotEquals("food", catObj.eat(), "This test case fails due to case sensitivity : Food v food");

        // Extra functionality on test cases to ignore case sensitivity
        assert "food".compareToIgnoreCase(catObj.eat()) >= 0 : "This test case passes because 'Food' and and 'food'  are now viewed the same by compareToIgnoreCase";
    }
}