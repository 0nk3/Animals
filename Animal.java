/* **************************************
 * @author : Ndumiso Onke Fanti         *
 * Description : Animal class(Dog and   *
 *   Cat inherit from                   *
 * ************************************ */
class Animal {

    private String name;

    Animal(String name){
        this.name = name;
    }
    protected void sounds() {
        System.out.println("sounds ...");
    }
    protected void eat() {
        System.out.println(this.name + " eats");
    }
}
