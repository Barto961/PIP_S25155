package com.company;

import static com.company.Main.RandomMatrix.createRandomMatrix;

public class Main {
//cw1
   import java.util.Random;

    public class RandomMatrix {

        public static int[][] createRandomMatrix(int n) {
            int[][] matrix = new int[n][n];
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = random.nextInt(10);
                }
            }
            return matrix;
        }
//cw2
        public static void main(String[] args) {
            int[][] matrix = createRandomMatrix(5);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

int[][] matrix1 = createRandomMatrix(5);
    int[][] matrix2 = createRandomMatrix(5);
    int[][] sum = sum(matrix1, matrix2);


}
