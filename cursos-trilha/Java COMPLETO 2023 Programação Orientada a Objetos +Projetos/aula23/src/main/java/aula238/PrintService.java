package aula238;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    List<Object> list = new ArrayList<>();
    public void addValue(Object value){
        list.add(value);

    }

    public Object first(){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }
    public void print(){
        System.out.print("Numbers ->");
        for(Object n: list){
            System.out.print(" | " + n);
        }
        System.out.println();

    }
}
