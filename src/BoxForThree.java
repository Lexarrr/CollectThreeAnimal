import Mammal.Animal;

public class BoxForThree<E> /*extends Animal<E>/*implements Comparable<E>*/{

    E f;
    E s;
    E t;

//    Animal a = new Animal() {
//        @Override
//        public double getWeight() {
//            return super.getWeight();
//        }
//
//        @Override
//        public void toMove() {
//
//        }
//    };


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


//    public void sort() {
//        if (getCount() == 2) {
//            if (f.g < s.hashCode()) {
//                makeComparator();
//                E temp = f;
//                f = s;
//                s = temp;
//            }
//            if (f.hashCode() < t.hashCode()) {
//                makeComparator();
//                E temp = f;
//                f = t;
//                t = temp;
//            }
//
//        }
//    }


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
//    public int getW(double f, E s, E t){
//       f = a.getWeight();
//
//
//
//
//
//    }

    public void put(E one) {
        if (getCount() == 0)
            f = one;
        else if (getCount() == 1)
            if (f == null) {
                f = one;
//                E temp = f;
//                f = s;
//                s = temp;
            }
            else
                s = one;
//            if(a[0].getWeight() > a.getWeight()) {
//
//            }
        else if (getCount() == 2)
            if (s == null) {
                s = one;
//                E temp = s;
//                s = t;
//                t = temp;
            }
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

    @Override
    public int compareTo(E o) {
        return compareTo(o);
    }


//    @Override
//    public int compareTo(E o) {
//        if (> o.getWeight()) {
//            return this.weight - o.getWeight();
//        }
//        return compareTo(getWeight());
//    }



//    public BoxForThree(E f, E s, E t) {
//        this.f = f;
//        this.s = s;
//        this.t = t;
//    }


}



