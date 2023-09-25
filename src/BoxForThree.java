import Mammal.Animal;

import java.util.Comparator;

public class BoxForThree<E> {

    E f;
    E s;
    E t;




    public BoxForThree() {
        f = null;
        s = null;
        t = null;

    }

    public int getCount() {
        if (f == null && s == null && t == null)
            return 0;
        if (f == null || s == null)
            return 1;
        else if (s == null || t == null)
            return 2;
        return 3;



    }

    public void sort() {
        if (getCount() == 2) {
            if (f.hashCode() < s.hashCode()) {
                makeComparator();
                E temp = f;
                f = s;
                s = temp;
            }
            if (f.hashCode() < t.hashCode()) {
                makeComparator();
                E temp = f;
                f = t;
                t = temp;
            }

        }
    }

    public static <T extends Comparable<T>> Comparator<T> makeComparator() {
        return new Comparator<T>() {
            public int compare(T left, T right) {
                return left.compareTo(right);
            }
        };
    }
//    <E extends Comparable<E>> void bubbleSort() {
//        List<E> alist = new ArrayList<>();
//        alist.add((E) f);
//        alist.add((E) s);
//        alist.add((E) t);
//        int n = alist.size();
//        for (int i = 0; i < n-1; i++){
//            for (int j = 0; j < n-i-1; j++){
//                if (alist.get(j).compareTo(alist.get(j + 1)) > 0) {
//                    E temp = alist.get(j);
//                    alist.set(j, alist.get(j + 1));
//                    alist.set(j + 1, temp);
//                }
//            }
//        }
//    }

    Animal animal = new Animal() {


        @Override
        public void toMove() {

        }
    };

    public void put(E one) {
        if (getCount() == 0)
            f = one;
        else if (getCount() == 1)
            if (f == null)
                f = one;
            else
                s = one;
//            if(animal.getWeight() > animal.getWeight()) {
//                E temp = f;
//                f = s;
//                s = temp;
//            }
        else if (getCount() == 2)
            if (s == null)
                s = one;
            else
                t = one;
        else
            System.out.println("no");


    }

    @Override
    public String toString() {
        return "BoxForTwo{" +
                "first=" + f +
                ", second=" + s +
                ", third=" + t +
                '}';
    }


}


