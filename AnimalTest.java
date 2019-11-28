import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    // declare objects
    Dog dogObj = new Dog();
    Cat catObj = new Cat();

    @Test
    void testDogSound(){
        assertEquals("Bark", dogObj.sounds(),"This test passes : Expected = Actual");
        assertEquals("barks", dogObj.sounds(), "This test case fails due to incorrect output : Bark v barks");
    }
    @Test
    void testDogEats(){
        assertEquals("Food", dogObj.eat(), "This test case passes : Expected = Actual");
        assertEquals("food", dogObj.eat(), "This test case fails due to case sensitivity of expected output : Food v food");

    }
    @Test
    void testCatSound(){
        assertEquals("Barkark", catObj.sounds(), "This test case fails due to incorrect expected output");
        assertEquals("Meow", catObj.sounds(), "This is test case passes : Expected = Actual");


    }
    @Test
    void testCatEats(){
        assertEquals("meat", catObj.eat(), "This test case fails : Food v meat ");
        assertEquals("Food", catObj.eat() , "This test case passes : Expected = Actual");
        assertEquals("food", catObj.eat(), "This test case fails due to case sensitivity : Food v food");           // this test fails
    }
}