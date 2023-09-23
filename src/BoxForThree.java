import Mammal.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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


    public static int findMin(int[] Min) {
        int mn = Min[0];
        int i = 0;
        while (i < Min.length) {
            if (mn > Min[i]) {
                mn = Min[i];
            }
            i++;
        }
        return mn;
    }

    public static int[] sortByMin(int[] mas) {
        int mn = findMin(mas);
        int rs = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 1; j < mas.length; j++) {
                if (mas[j] < mn) {
                    rs = mas[j];
                    mas[i] = mas[j];
                    mas[j] = rs;
                }
            }
        }
        return mas;
    }

    public void sort() {
        E min = f;
        int i = 0;
        if (f > s){

        }
    }

    public void put(E one) {
        if (getCount() == 0)
            f = one;
        else if (getCount() == 1)
            if (f == null)
                f = one;
            else
                s = one;
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


