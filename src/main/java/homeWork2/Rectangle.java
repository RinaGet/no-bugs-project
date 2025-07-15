package homeWork2;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.height = height; // 'this.' => ключевое слово. Использую, чтобы явно указать, что я присваиваю значения полям ТЕКУЩЕГО ОБЪЕКТА, а не ЛОКАЛЬНЫМ переменным
        this.width = width;
    }

    double getWidth(){
        return this.width;
    }

    double getHeight(){
        return this.height;
    }

    void setWidth(double newWidth){
        this.width = newWidth;
    }

    public double calculateArea(){
        return this.width * this.height;
    }

}
