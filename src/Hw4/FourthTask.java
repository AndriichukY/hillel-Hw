package Hw4;

public class FourthTask {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {103, 5, 58, 18, -8};

        System.out.println("The min number in array is: " + identifyMinNumber(arrayOfNumbers));
        System.out.println("The max number in array is: " + identifyMaxNumber(arrayOfNumbers));
    }

    static int identifyMinNumber(int[] arrayOfNumbers) {
        int minNumber = arrayOfNumbers[0];

        for (int i = 1; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] < minNumber) {
                minNumber = arrayOfNumbers[i];
            }

        }

        return minNumber;
    }

    static int identifyMaxNumber(int[] arrayOfNumbers) {
        int maxNumber = arrayOfNumbers[0];

        for (int i = 1; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] > maxNumber) {
                maxNumber = arrayOfNumbers[i];
            }
        }

        return maxNumber;
    }
}
