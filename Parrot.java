public class Parrot extends Birds implements FlyableBirds,LiveBirds {
    static int count;
    public void fly() {
        System.out.println("Parrot is now flying");
    }

    public void eat() {
        System.out.println("Parrot is eating");
    }

    public void incrementCount() {
        count++;
    }

    public void decrementCount() {
        count--;
    }

    int getCount() {
        return count;
    }

}
