public class Duck extends Birds implements FlyableBirds,SwimmableBirds,LiveBirds{
    static int count;

    public void fly(){
        System.out.println("Duck is now flying");
    }


    public void eat() {
        System.out.println("Duck is eating fish");
    }

    public void incrementCount() {
        count++;
    }

    int getCount() {
        return count;
    }

    public void decrementCount() {
        count--;
    }


    public void swim() {
        System.out.println("Duck is Swimming");
    }

}
