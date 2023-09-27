package Mammal;

public abstract class Animal implements Comparable<Animal>{

    double weight;

    public Animal(double weight) {
        this.weight = weight;
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


    @Override
    public int compareTo(Animal o) {
        return Double.compare(this.weight, o.weight);
    }
}
