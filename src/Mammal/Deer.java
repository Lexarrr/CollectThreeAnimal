package Mammal;

public class Deer extends Mammal implements Walker, Runner {

    String name;

    public Deer(double weight, String name) {
        super(weight);
        this.name = name;
    }

    @Override
    public void toMove() {
        toWalk();
        toRun();
    }

    @Override
    public void toWalk() {
        System.out.println("Mammal.Deer walks");
    }

    @Override
    public void toRun() {
        System.out.println("Mammal.Deer runs");
    }



    @Override
    public String toString() {
        return "Deer{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }


}
