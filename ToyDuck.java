public class ToyDuck extends Birds implements FlyableBirds,SwimmableBirds{

    static int count;

    public void incrementCount() {
        count++;
    }

    int getCount() {
        return count;
    }

    void decrementCount() {
        count--;
    }

    public void fly() {
        System.out.println("Toy Duck is now Flying");
    }

    public void swim() {
        System.out.println("Toy Duck is now Swimming");
    }
}
