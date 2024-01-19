package multipleArrays;

public class multipleArrays {
    public static void main(String[] args) {
        int [] simpleArray = new int[5];
        int [] simpleArrays = {1,2,4,6,3,53,98};

        int [] [] matrix = {
                {1,2,3},
                {6,8,7},
                {3,99,64},
        };

        int[][] uglyMatrix = {{3,3,3,3,3,3}, {123,456,789,456,123}, {5}};

        System.out.println(matrix[1][2]);

        int[][] generatedMAtrix = new int[4][];

        //nepouziva se
        generatedMAtrix[3] = new int[2];
        generatedMAtrix[1] = new int[6];



    }
}
