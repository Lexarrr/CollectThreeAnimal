package Mammal;

public class Otter extends Mammal implements Runner, Walker {

    String name;

    public Otter(double weight, String name) {
        super(weight);
        this.name = name;
    }

    @Override
    public void toMove() {

    }

    @Override
    public void toRun() {
        System.out.println("Otter runs");
    }

    @Override
    public void toWalk() {
        System.out.println("Otter walks");
    }

    @Override
    public String toString() {
        return "Otter{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
