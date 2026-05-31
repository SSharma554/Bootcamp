public class rotatematrix {
    public static int[][] rotate180(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] res = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = mat[n - 1 - i][m - 1 - j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] b = rotate180(a);

        for (int[] row : b) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}