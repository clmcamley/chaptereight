//Exercise 8.1

import java.util.Scanner;

public class SumElementsByColumn {
    public static void main(String[] args) {
        testSumColumn();
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sumOfColumn = 0;

        for (int i = 0; i < m.length; i ++) {
            sumOfColumn += m[i][columnIndex];
        }

        return sumOfColumn;
    }

    public static void testSumColumn() {
        Scanner input = new Scanner(System.in);

        double matrix[][] = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
        }
    }
}
