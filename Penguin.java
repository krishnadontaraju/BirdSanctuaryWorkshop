public class Penguin extends Birds implements SwimmableBirds,LiveBirds {
    static int count;
    public void fly(){
    }

    public void eat() {
        System.out.println("Penguin is eating small fish");
    }

    public void swim() {
        System.out.println("Penguin is Swimming");
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

