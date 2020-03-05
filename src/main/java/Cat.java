/* **************************************
 * @author : Ndumiso Onke Fanti         *
 * Description : Cat class which        *
 *  implements its own sound() method   *
 * ************************************ */
public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public String sounds(){
        return "Cat Meows";
    }
}
