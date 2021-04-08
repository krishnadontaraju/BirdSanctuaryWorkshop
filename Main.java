public class Main {

    public static void main(String[] args) {

        BirdSanctuary sanctuary = BirdSanctuary.getInstance();

        Penguin livePenguin = new Penguin();
        Duck liveDuck = new Duck();
        Parrot liveParrot = new Parrot();
        Birds newDuck = new Duck();
        Birds newToyDuck = new ToyDuck();

        sanctuary.addBird(liveDuck);
        sanctuary.addBird(liveParrot);
        sanctuary.addBird(livePenguin);
        sanctuary.addBird(newDuck);
        sanctuary.addBird(liveDuck);
        sanctuary.addBird(newToyDuck);
        sanctuary.addBird(newToyDuck);

        sanctuary.removeBird(newDuck);

        sanctuary.printEat();
        sanctuary.printFlyBirds();
        sanctuary.printSwimBirds();

        System.out.println(liveDuck.getCount());
        System.out.println(liveParrot.getCount());
        System.out.println(livePenguin.getCount());

    }
}
