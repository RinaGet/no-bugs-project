package homeWork2;

public class MainForProduct {
    public static void main(String[] args) {
        Product myProduct = new Product("DEXP", 25000);
        //myProduct.printInfo();

        myProduct.setPrice(20000);
        myProduct.applyDiscount(5000);
        myProduct.printInfo();
    }
}
