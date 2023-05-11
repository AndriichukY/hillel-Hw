package Hw4;

import java.util.Arrays;
import java.util.Random;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceEvenNumbers(createRandomArray())));
    }

    static int[] createRandomArray() {
        Random randomGenerator = new Random();
        int[] randomArray = new int[5];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomGenerator.nextInt();
        }

        return randomArray;
    }

    static int[] replaceEvenNumbers(int [] array) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }

        return array;
    }

}
