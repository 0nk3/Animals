/* **************************************
 * @author : Ndumiso Onke Fanti         *
 * Description : Animal class(Dog and   *
 *   Cat inherit from                   *
 * ************************************ */
public class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }
    protected String sounds() {
        return "sounds...";
    }
    protected String eat() {
        return "Food";
    }
}
