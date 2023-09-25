package Mammal;

public abstract class Animal {

    double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    public Animal() {

    }


    public double getWeight() {
        return weight;
    }


    public abstract void toMove();

    @Override
    public String toString() {
        return "Mammal.Animal{" +
                "weight=" + weight +
                '}';
    }


}
