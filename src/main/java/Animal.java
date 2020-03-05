/* **************************************
 * @author : Ndumiso Onke Fanti         *
 * Description : Animal class(Dog and   *
 *   Cat inherit from                   *
 * ************************************ */
public class Animal {

    private final String name;

    Animal(String name){
        this.name = name;
    }
    protected String sounds() {
        return "sounds...";
    }
    protected String eat() {
        return this.name + " eats";
    }
}
