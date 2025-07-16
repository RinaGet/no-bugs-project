package homeWork2;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double calculateArea(){ //площадь S = π * r²
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(){//длина окружности
        return 2 * Math.PI * radius;
    }
}
