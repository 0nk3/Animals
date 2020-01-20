import java.util.ArrayList;
/* **************************************
 * @author : Ndumiso Onke Fanti         *
 * Description : Home class             *
 * ************************************ */
public class Home{

    private ArrayList<Animal> homeAnimals = new ArrayList<>();    //array list to store animals
    //throwing the exceptions gives abnormal behavior to my program. so Im just gonna print out as error

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
            homeAnimals.get(i).sounds();
        }

    }
}
