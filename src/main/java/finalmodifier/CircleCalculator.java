package finalmodifier;

public class CircleCalculator {

    public static final double PI = 3.4;

    public double calculatePerimeter(double r) {
        return 2 * r * PI;
    }

    public double calculateArea(double r) {
        return Math.pow(r, 2) * PI / 4;
    }
}
