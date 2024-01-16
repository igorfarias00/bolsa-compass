package aula241.entities;

public class Rectangle extends Shape{
    private double b;
    private double a;

    public Rectangle(double b, double a) {
        this.b = b;
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double calArea() {
        area = Math.pow(a, 2) + Math.pow(b,2);
        return area;
    }
}
