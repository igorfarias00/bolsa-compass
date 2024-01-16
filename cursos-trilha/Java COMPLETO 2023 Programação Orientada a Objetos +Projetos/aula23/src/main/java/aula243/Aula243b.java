package aula243;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Aula243b {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // union
        Set<Integer> union = new TreeSet<>(a);
        union.addAll(b);
        System.out.println(union);

        // intersection
        Set<Integer> intersection = new TreeSet<>(a);
        intersection.retainAll(b);
        System.out.println(intersection);

        // differemce
        Set<Integer> differemce = new TreeSet<>(a);
        differemce.removeAll(b);
        System.out.println(differemce);

    }
}
