package homeWork2;

public class MainForBook {
    public static void main(String[] args){
        Book myBook = new Book("LoremIpsum", "Tester");

        myBook.setAuthor("Super Tester");
        myBook.printInfo();
    }
}
