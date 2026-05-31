import java.util.*;

public class matrixdiagonaldiff {
    public static int diagonalDifference(int[][] mat) {
        int n = mat.length;
        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            primary += mat[i][i]; 
            secondary += mat[i][n - 1 - i];
        }

        return Math.abs(primary - secondary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println(diagonalDifference(mat));
        sc.close();
    }
}