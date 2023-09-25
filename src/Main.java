import Mammal.Animal;
import Mammal.Deer;
import Mammal.Otter;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
    }

    private static void ex2() {
        BoxForThree<Otter> bft = new BoxForThree<>();
        System.out.println(bft + ": " + bft.getCount());
        bft.put(new Otter(12.5, "Otto"));
        System.out.println(bft + ": " + bft.getCount());
        bft.put(new Otter(14.5, "Rotto"));
        System.out.println(bft + ": " + bft.getCount());
        bft.put(new Otter(10.5, "Motto"));
        System.out.println(bft + ": " + bft.getCount());

//        Arrays.sort(bft, new Comparator<Otter>() {
//            @Override
//            public int compare(Otter o, Otter t) {
//                if (o.getWeight() != t.getWeight()) {
//                    return (int) (o.getWeight() - t.getWeight());
//                }
//                return o.getName().compareTo(t.getName());
//            }
//        });
//        System.out.println(Arrays.toString(new BoxForThree[]{bft}));

    }

    private static void ex1() {

        Animal a = new Deer(120.2, "Gambi");
        Animal a1 = new Deer(100, "Vambi");
        Animal a2 = new Deer(44.8, "Bambi");

        Printer<Deer> p = new Printer<>();
        p.identical((Deer) a, (Deer) a1, (Deer) a2);


    }
}
