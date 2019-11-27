import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    // declare objects
    Dog dogObj = new Dog();
    Cat catObj = new Cat();

    @Test
    public void testDogSound(){
        assertEquals("Bark", dogObj.sounds());         // this test passes
        assertEquals("barks", dogObj.sounds());        // this test fails
    }
    @Test
    public void testDogEats(){
        assertEquals("Food", dogObj.eat());         // This test passes
        assertEquals("food", dogObj.eat());         // This test fails

    }
    @Test
    public void testCatSound(){
        assertEquals("Barkark", catObj.sounds());   // this test fails
        assertEquals("Meow", catObj.sounds());      // this test passes


    }
    @Test
    public void testCatEats(){
        assertEquals("meat", catObj.eat());          //this test fails
        assertEquals("Food", catObj.eat());          // this test passes
        assertEquals("food", catObj.eat());           // this test fails
    }
}