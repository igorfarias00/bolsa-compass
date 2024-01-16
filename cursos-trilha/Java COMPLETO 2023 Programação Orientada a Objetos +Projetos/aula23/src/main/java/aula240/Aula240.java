package aula240;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aula240 {
    public static void main(String[] args) {
//        List<Object> myObjs = new ArrayList<>();
//        List<Integer> myNumbers = new ArrayList<>();
//
//        myObjs = myNumbers; // erro de compilação

        List<?> myObjs = new ArrayList<>(); // tipos coringas
        List<Integer> myNumbers = new ArrayList<>();

        myObjs = myNumbers; //

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

    }

    private static void printList(List<?> list) {
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
