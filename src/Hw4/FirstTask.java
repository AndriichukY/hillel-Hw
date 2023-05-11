package Hw4;


public class FirstTask {
    public static void main(String[] args) {
        double[][] list = createSinArray();

        for (int i = 0; i < list.length; i++) {
            for(int j = 0; j < list[i].length; ++j) {
                System.out.print(list[i][j] + (j == 5 ? "\n" : " | "));

            }
        }
    }
    static double[][] createSinArray () {
        double[][] sinusTable = new double[6][6];
        int x = 0;
        for (int i = 0; i < sinusTable.length; i++) {
            for(int j = 0; j < sinusTable[i].length; ++j) {
                x = x + 10;
                sinusTable[i][j] = Math.sin(x);
            }
        }

        return sinusTable;
    }
}
