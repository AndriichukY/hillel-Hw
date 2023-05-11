package Hw3;

public class FourthTask {
    public static void main (String[] args) {
        checkTriangleType(3, 8, 3);
    }

    static void checkTriangleType(double a, double b, double c) {
        if (a == b || b == c || a == c) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is not isosceles.");
        }
    }
}
