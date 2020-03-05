/* **************************************
 * @author : Ndumiso Onke Fanti         *
 * Description : Dog class which        *
 *  implements its own sound method     *
 * ************************************ */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String sounds() {
        return "Dog Barks";
    }
}
