package two_dimensional_arrays;

public class RotateMatrix {
    public static void main (String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printMatrix(matrix);

        rotate(matrix);
        printMatrix(matrix);
    }

    private static void printMatrix (int[][] matrix) {
        for (int[] row: matrix){
            for (int val: row){
                System.out.print (val + " ");
            }
            System.out.println ();
        }
    }

    private static void rotate(int[][] matrix){

    }
}
