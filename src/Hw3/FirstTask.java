package Hw3;

public class FirstTask {
    protected int test = 25;
    public static void main(String[] args) {
      checkTypeOfNumber(6);
    }

    static void checkTypeOfNumber(int number) {
        int result = number % 2;

        if (result == 0){
            System.out.println("The number is even");
        } else
            System.out.println("The number is odd");
    }
}
