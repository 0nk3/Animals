/* **************************************
 * @author : Ndumiso Onke Fanti         *
 * Description : Cat class which        *
 *  implements its own sound() method   *
 * ************************************ */
public class Cat extends Animal {

    public static String name = "Stormy";

    Cat() {
        super(name);
    }
    @Override
    public String sounds(){
        System.out.println("Meow");
        return "Meow";
    }
}
