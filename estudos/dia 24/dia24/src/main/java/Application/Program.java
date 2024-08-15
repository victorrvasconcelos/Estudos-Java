package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

          int n = sc.nextInt();
          int[][] matrix = new int[n][n];

          for (int i = 0; i < matrix.length; i++) {
              for (int j = 0; j < matrix[i].length; j++) {
                  matrix[i][j] = sc.nextInt();
              }
          }
          System.out.println("Main diagonal:");
          for (int i = 0; i < matrix.length; i++) {
              System.out.print(matrix[i][i] + " ");
          }
          System.out.println();

          int negativo = 0;
          System.out.print("Negative numbers = ");
          for (int i = 0; i < matrix.length; i++) {
              for (int j = 0; j < matrix[i].length; j++) {
                  if (matrix[i][j] < 0) {
                      negativo++;
                  }
              }
          }
          System.out.print(negativo);

        sc.close();
    }
}
