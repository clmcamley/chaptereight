//Exercise 8.10

public class LargestRowAndColumn {
    public static void main(String[] args) {
        int[][] randomMatrix = new int[4][4];

        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix[i].length; j++) {
                randomMatrix[i][j] = (int)(Math.floor(Math.random() * 2));
                System.out.printf("%d ", randomMatrix[i][j]);
            }
            System.out.printf("\n");
        }

        int maxRowSum = 0;
        int rowIndex = 0;
        for (int i = 0; i < randomMatrix.length; i ++) {
            int sumOfRow = 0;
            for (int j = 0; j < randomMatrix[i].length; j++) {
                sumOfRow += randomMatrix[i][j];
            }
            if (sumOfRow > maxRowSum) {
                maxRowSum = sumOfRow;
                rowIndex = i;
            }
        }

        int maxColumnSum = 0;
        int columnIndex = 0;
        for (int i = 0; i < randomMatrix[0].length; i++) {
            int sumOfColumn = 0;
            for (int j = 0; j < randomMatrix.length; j++) {
                sumOfColumn += randomMatrix[j][i];
            }
            if (sumOfColumn > maxColumnSum) {
                maxColumnSum = sumOfColumn;
                columnIndex = i;
            };
        }

        System.out.println("The largest row index: " + rowIndex);
        System.out.println("The largest column index: " + columnIndex);
    }
}
