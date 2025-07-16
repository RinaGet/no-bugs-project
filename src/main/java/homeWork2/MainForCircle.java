package homeWork2;

public class MainForCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10.1);
        //System.out.println(myCircle.getRadius());

        myCircle.setRadius(20);
        //System.out.println(myCircle.getRadius());

        System.out.println(myCircle.calculateArea() + " " + myCircle.calculateCircumference());
    }
}
