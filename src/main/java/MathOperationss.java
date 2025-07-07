public class MathOperationss {

    public static void main(String[] args) {

        int addCalculation = add(5,4);
        System.out.println(addCalculation);

        int subtractCalculation = subtract(0, 2);
        System.out.println(subtractCalculation);

        int multiplyCalculation = multiply(0,9);
        System.out.println(multiplyCalculation);

        double divideCalculation = divide(4, 7);
        System.out.println(divideCalculation);

        int findMaxCalc = findMax(5, -4);
        System.out.println(findMaxCalc);

        int differenceCalc = difference(-7, -5);
        System.out.println(differenceCalc);

        int squareAreaCalc = squareArea(4);
        int squarePerimeterCalc = squarePerimeter(6);
        System.out.println(squareAreaCalc + " " + squarePerimeterCalc );

        double convertSecondsToMinutesCalc = convertSecondsToMinutes(360);
        System.out.println(convertSecondsToMinutesCalc);

        double averageSpeedCalc = averageSpeed(360, 60);
        double averageSpeedCalcul = averageSpeed(130, 4);
        System.out.println(averageSpeedCalc + " " + averageSpeedCalcul);

        double findHypotenuseC = findHypotenuse(3, 5);
        double findHypotenuseCalc = findHypotenuse(4,8);
        double findHypotenuseCalcul = findHypotenuse(4, 1);
        System.out.println(findHypotenuseC + " " + findHypotenuseCalc + " " + findHypotenuseCalcul);

        double circleCircumferenceC = circleCircumference(4);
        double circleCircumferenceCalc = circleCircumference(100);
        System.out.println(circleCircumferenceC + " " + circleCircumferenceCalc);

        double calculatePercentageCalc = calculatePercentage(40, 6);
        System.out.println(calculatePercentageCalc);

        double celsiusToFahrenheitCalc = celsiusToFahrenheit(5);
        System.out.println(celsiusToFahrenheitCalc);

        double fahrenheitToCelsiusCalc = fahrenheitToCelsius(103);
        System.out.println(fahrenheitToCelsiusCalc);
    }


    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x/y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(subtract(x, y));
    }

    public static int squareArea(int side){
        return side * side;
    }

    public static int squarePerimeter(int side){
        return side * 4;
    }

    public static double convertSecondsToMinutes(int seconds){
        return (double) seconds/60;
    }

    public static double averageSpeed(double distance, double time) {
        return distance/time;
    }

    public static double findHypotenuse(double a, double b){
        return Math.sqrt(a*a + b*b);
    }

    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part){
        return (part/total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32 ;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9 ;
    }
}
