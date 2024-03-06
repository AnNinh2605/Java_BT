public class Alphabetic_Patterns {
    public static void main(String[] args) {
        int n = 5;
        // find the width & height of matrix
        int matrixHeight = 2 * n - 1;
        int matrixWidth = 4 * n - 3;

        // array charactor
        char[] letterArr = new char[n];
        for (int i = 0; i < n; i++) {
            letterArr[i] = (char) ('a' + i);
        }
        //print matrix
        for (int i = 0; i < matrixHeight / 2 + 1; i++) {
            int check = n - 1;
            for (int j = 0; j < matrixWidth; j++) {
                if (((matrixWidth - 4 * i - 1) / 2 <= j) && (j <= (matrixWidth + 4 * i - 1) / 2) && (j % 2 == 0)) {
                    System.out.print(letterArr[check]);
                    if (j >= matrixWidth / 2) {
                        check++;
                    } else {
                        check--;
                    }
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        for (int i = matrixHeight / 2 - 1; i >= 0; i--) {
            int check = n - 1;
            for (int j = 0; j < matrixWidth; j++) {
                if (((matrixWidth - 4 * i - 1) / 2 <= j) && (j <= (matrixWidth + 4 * i - 1) / 2) && (j % 2 == 0)) {
                    System.out.print(letterArr[check]);
                    if (j >= matrixWidth / 2) {
                        check++;
                    } else {
                        check--;
                    }
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
