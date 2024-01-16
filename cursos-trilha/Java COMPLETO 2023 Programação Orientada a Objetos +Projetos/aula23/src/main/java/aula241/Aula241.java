package aula241;

import aula241.entities.Circle;
import aula241.entities.Rectangle;
import aula241.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Aula241 {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(myShapes));

    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for(Shape s : list){
            sum += s.calArea();
        }

        return sum;
    }
}
