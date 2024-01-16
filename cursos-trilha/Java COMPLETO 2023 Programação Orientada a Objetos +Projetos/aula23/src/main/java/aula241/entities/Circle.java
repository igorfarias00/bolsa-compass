package aula241.entities;

public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calArea() {
        area = Math.pow(radius, 2) * Math.PI;
        return area;
    }
}
