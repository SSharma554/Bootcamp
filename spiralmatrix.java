import java.util.*;

public class spiralmatrix {

    public static List<Integer> spiralOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int srow = 0, scol = 0, erow = m-1, ecol = n-1;

        List<Integer> ans = new ArrayList<>();

        while(srow <= erow && scol <= ecol) {
            //top
            for(int j=scol; j<=ecol; j++) {
                ans.add(mat[srow][j]);
            }

            //right
            for(int i=srow+1; i<=erow; i++) {
                ans.add(mat[i][ecol]);
            }

            //bottom
            for(int j=ecol-1; j>=scol; j--) {
                if(srow == erow) {
                    break;
                }
                ans.add(mat[erow][j]);
            }

            //left
            for(int i=erow-1; i>=srow+1; i--) {
                if(scol == ecol) {
                    break;
                }
                ans.add(mat[i][scol]);
            }

            srow++; erow--; scol++; ecol--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        List<Integer> res = spiralOrder(mat);

        System.out.print("Spiral: ");
        for(int x : res) {
            System.out.print(x + " ");
        }
    }
}