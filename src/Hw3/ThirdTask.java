package Hw3;

public class ThirdTask {
    public static void main(String[] args) {
        checkAbsolute(-4, 4);
    }

    static void checkAbsolute(double firstValue, double secondValue) {
        if (Math.abs(firstValue) > Math.abs(secondValue)) {
            System.out.println("The absolute value " + firstValue + " is bigger than " + secondValue);
        } else if (Math.abs(firstValue) < Math.abs(secondValue)) {
            System.out.println("The absolute value " + secondValue + " is bigger than " + firstValue);
        } else
            System.out.println("The absolute values are equal");
    }
}
