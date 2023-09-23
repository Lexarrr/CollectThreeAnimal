package Mammal;

public class Sloth extends Mammal implements Walker{

    String name;

    public Sloth(double weight, String name) {
        super(weight);
        this.name = name;

    }

    @Override
    public void toMove() {
        toWalk();
    }

    @Override
    public void toWalk() {
        System.out.println("Sloth walks too slow");
    }
}
