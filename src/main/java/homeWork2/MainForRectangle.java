package homeWork2;

public class MainForRectangle {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(10, 20.5);

        myRectangle.setWidth(10.5);

        System.out.println(myRectangle.calculateArea());
    }
}
