/* **************************************
 * @author : Ndumiso Onke Fanti         *
 * Description : Dog class which        *
 *  implements its own sound method     *
 * ************************************ */
public class Dog extends Animal {

    private static String name = "Rax";

    Dog(){
        super(name);
    }
    public void sounds() {
        System.out.println("Dog barks");
    }
}
