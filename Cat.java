/* **************************************
 * @author : Ndumiso Onke Fanti         *
 * Description : Cat class which        *
 *  implements its own sound() method   *
 * ************************************ */
public class Cat extends Animal {

    private static String name = "Stormy";

    Cat() {
        super(name);
    }
    public void sounds(){
        System.out.println("Cat meows");
    }
}
