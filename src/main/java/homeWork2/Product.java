package homeWork2;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name = name;
    }

    public double getPrice(){
        return this.price = price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public void applyDiscount(double discount){
        price = price - Math.min(discount, price);
    }

    public void printInfo(){
        System.out.println("Laptop " + getName() + ". Price: " + getPrice());
    }

}
