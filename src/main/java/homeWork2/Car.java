package homeWork2;

public class Car {

    private String brand;
    private int year;

    public Car (String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    String getBrand(){
        return this.brand;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    int getYear(){
        return this.year;
    }

    void setYear(int newYear){
        this.year = newYear;
    }

    void print(){
        System.out.println("Brand: " + this.brand + ", Year:" + this.year);
    }

}
