package multipleArrays;

public class multipleArrays {
    public static void main(String[] args) {
        int[] simpleArray = new int[5];
        int[] simplerArray = {1, 2, 36, 6, 98};

        int[][] matrix = {
                {1, 2, 3},
                {6, 8, 7},
                {3, 99, 64}
        };

        int[][] uglyMatrix = {{3, 3, 3, 3, 3,}, {123, 456, 123, 456, 456, 123}, {5}};

        System.out.println(matrix[1][2]);

        int[][] generatedMatrix = new int[5][];

        //nepouziva se
        generatedMatrix[3] = new int[2];
        generatedMatrix[1] = new int[6];

        int rows = 10;
        int cols = 10;
        int[][] matrix1 = new int[rows][cols];

        int counter = 1;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = counter;
                counter++;
            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println(matrix1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
