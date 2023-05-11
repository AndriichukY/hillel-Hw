package Hw3;

public class FifthTask {
    public static void main(String[] args) {
        System.out.println(returnTwoLettersFromCenter("Hillel"));
    }

    static String returnTwoLettersFromCenter(String word) {
        int middleCharIndex = word.length() / 2;
        int firstCharIndex = middleCharIndex - 1;

        return word.substring(firstCharIndex, middleCharIndex + 1);
    }
}
