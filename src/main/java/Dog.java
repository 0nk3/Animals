/* **************************************
 * @author : Ndumiso Onke Fanti         *
 * Description : Dog class which        *
 *  implements its own sound method     *
 * ************************************ */
public class Dog extends Animal {

    public static String name = "Rax";

    Dog(){
        super(name);
    }
    @Override
    public String sounds() {
        System.out.println("Dog Barks");
        return "Barks";
    }
}
