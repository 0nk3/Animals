import java.util.ArrayList;
/* **************************************
 * @author : Ndumiso Onke Fanti         *
 * Description : Home class             *
 * ************************************ */
public class Home{

//   private static int countObjects = 0;
//    Home(){S
//        countObjects++;
//        System.out.println(countObjects);
//    }
    private ArrayList<Animal> homeAnimals = new ArrayList<>();    //arrraylist to store animals

    void adoptPet(Animal animal){
        if(homeAnimals.contains(animal)){
            System.out.println("You cant adopt the same animal twice! ");
        }
        else{
            homeAnimals.add(animal);
        }
    }

    void makeAllSounds() {
        for (int i = 0; i < homeAnimals.size(); i++) {
            homeAnimals.get(i).sounds();
        }

    }
}
