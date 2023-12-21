package aula64;

public class Triangulo {
    public double A;
    public double B;
    public double C;

    public double area;


    public double perimetro;


    public Triangulo(){

    }


    public  Triangulo(double A, double B, double C){
        this.A = A;
        this.B = B;
        this.C = C;
        this.setPerimetro();
        this.setArea();
    }

    public void setPerimetro(){
        this.perimetro = (this.A + this.B + this.C) / 2;
    }
    public void setArea (){
        this.area = Math.sqrt(this.perimetro * (this.perimetro - this.A) * ( this.perimetro - this.B) * ( this.perimetro - this.C) );
    }
}
