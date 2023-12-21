package aula66;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(){

    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return this.price * this.quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

}
