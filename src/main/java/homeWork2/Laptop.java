package homeWork2;

public class Laptop {
    private String brand;
    private double price;

    public Laptop(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public String getBrand(){
        return this.brand;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public void setBrand(String newBrand){
        this.brand = newBrand;
    }

    public void printInfo(){
        System.out.println(getBrand() + " " + getPrice());
    }
}
