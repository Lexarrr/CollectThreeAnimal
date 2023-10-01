package Mammal;

public class Sloth extends Mammal implements Walker{

    String name;
    double age;

    public Sloth(double weight, String name, double age) {
        super(weight);
        this.name = name;
        this.age = age;

    }

    public double getAge() {
        return age;
    }

    @Override
    public void toMove() {
        toWalk();
    }

    @Override
    public void toWalk() {
        System.out.println("Sloth walks too slow");
    }

    @Override
    public String toString() {
        return "Sloth{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
