package aula243;

import java.util.*;

public class Aula243 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();
        Set<String> set3 = new LinkedHashSet<>();

        set1.add("TV");
        set1.add("Tablet");
        set1.add("Notebook");

        set2.add("TV");
        set2.add("Tablet");
        set2.add("Notebook");

        set3.add("TV");
        set3.add("Tablet");
        set3.add("Notebook");

        print(set1);
        print(set2);
        print(set3);



    }

    public static void print(Set<?> set){
        System.out.println("==============");
        for(Object item : set){
            System.out.println(item);
        }
        System.out.println("==============");
    }
}
