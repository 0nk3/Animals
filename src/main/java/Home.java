import java.util.ArrayList;
/* **************************************
 * @author : Ndumiso Onke Fanti         *
 * Description : Home class             *
 * ************************************ */
public class Home{

    private ArrayList<Animal> homeAnimals = new ArrayList<>();

    void adoptPet(Animal animal){
        if(!homeAnimals.contains(animal)){
            homeAnimals.add(animal);
        }
        else{
            System.err.println("You cant adopt the same animal twice!");
        }
    }

    void makeAllSounds() {
        for (int i = 0; i < homeAnimals.size(); i++) {
            if(homeAnimals.get(i) instanceof  Dog){
                System.out.println("Dog Barks");
            }
            System.out.println("Cat Meows");
        }

    }
}
