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
    public String sounds() {
        return "Bark";
    }
}
