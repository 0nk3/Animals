/* **************************************
 * @author : Ndumiso Onke Fanti         *
 * Main Method for Animals              *
 * ************************************ */
public class Main {
    public static void main(String[] args) {

        Animal rax = new Dog("Rax");
        System.out.println(rax.eat());
        System.out.println(rax.sounds());

        System.out.println("===============================================");
        Animal stormy =  new Cat("Stormy");
        System.out.println(stormy.eat());
        System.out.println(stormy.sounds());

        System.out.println("===============================================");
        Home home = new Home();
        Dog bobby = new Dog("Bobby");
        Dog bishop = new Dog("Bishop");
        Cat micky = new Cat("Micky");

        home.adoptPet(bobby);
        home.adoptPet(bishop);
        home.adoptPet(micky);
        home.makeAllSounds();

        home.adoptPet(bishop);
    }
}
