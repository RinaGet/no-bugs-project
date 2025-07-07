public class MathOperations {

    public static void main(String[] args) {

        int addCalculation = add(5, 4);
        int subtractCalculation = subtract(0, 2);
        int multiplyCalculation = multiply(0, 9);
        double divideCalculation = divide(4,7);
        System.out.println(addCalculation + " | " + subtractCalculation + " | " + multiplyCalculation + " | " + divideCalculation);

        int findMaxCalculation = findMax(0, 0);
        System.out.println(findMaxCalculation);

        int differenceCalculation = difference(-7, -5);
        System.out.println(differenceCalculation);

        int squareAreaCalculation = squareArea(6);
        System.out.println(squareAreaCalculation);

        int squarePerimeterCalculation = squarePerimeter(10);
        System.out.println(squarePerimeterCalculation);

        double convertSecondsToMinutesCalc = convertSecondsToMinutes(60);
        System.out.println(convertSecondsToMinutesCalc);

        double averageSpeedCalc = averageSpeed(100, 90);
        System.out.println(averageSpeedCalc);

        double averageSpeedCalcul = averageSpeed(50, 10);
        System.out.println(averageSpeedCalcul);

        double findHypotenuseCalc = findHypotenuse(2, 4);
        System.out.println(findHypotenuseCalc);

        double findHypotenuseCalcul = findHypotenuse(5, 10);
        System.out.println(findHypotenuseCalcul);

        double circleCircumferenceCalc = circleCircumference(4);
        System.out.println(circleCircumferenceCalc);

        double circleCircumferenceCalcu = circleCircumference(6);
        System.out.println(circleCircumferenceCalcu);

        double circleCircumferenceCalcul = circleCircumference(0);
        System.out.println(circleCircumferenceCalcul);

        double calculatePercentageCalc = calculatePercentage(10, 5);
        System.out.println(calculatePercentageCalc);

        double celsiusToFahrenheitCalc = celsiusToFahrenheit(4);
        System.out.println(celsiusToFahrenheitCalc);

        double fahrenheitToCelsius = fahrenheitToCelsius(10);
        System.out.println(fahrenheitToCelsius);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static double divide(int x, int y){
        return (double) x / y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(subtract(x, y));
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return side * 4;
    }

    public static double convertSecondsToMinutes(int seconds){
        return (double) seconds /60;
    }

    public static double averageSpeed(double distance, double time){
        return distance/time;
    }

    public static double findHypotenuse(double a, double b){
        return Math.sqrt(a*a + b*b);
    }

    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part){
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c){
        return c * 9 / 5 + 32 ;
    }

    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9 ;
    }
}
