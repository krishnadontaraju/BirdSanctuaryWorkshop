import java.util.HashSet;
import java.util.Set;

public class BirdSanctuary {
    static BirdSanctuary instance;

    private BirdSanctuary(){}

   synchronized static BirdSanctuary getInstance() {
        if(instance == null)
            instance = new BirdSanctuary();
        return instance;
    }

    private Set<Birds> birdsList = new HashSet<>();

    void addBird(Birds bird) {
       boolean birdTest = birdsList.stream().anyMatch(i -> i.equals(bird));

       if(!birdTest) {
            birdsList.add(bird);
            bird.incrementCount();
        }

       else
           System.out.println("Already the Bird is added ");
    }

    void removeBird(Birds bird){
        birdsList.remove(bird);
        bird.decrementCount();
    }

    void printEat() {
        for (Birds i : birdsList) {
            if (i instanceof LiveBirds)
                ((LiveBirds) i).eat();
        }
    }

    void printFlyBirds() {
        for (Birds i : birdsList) {
            if (i instanceof FlyableBirds)
                ((FlyableBirds) i).fly();
        }
    }

    void printSwimBirds() {
        for (Birds i : birdsList) {
            if (i instanceof SwimmableBirds)
                ((SwimmableBirds) i).swim();
        }

    }

}
