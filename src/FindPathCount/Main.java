package FindPathCount;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int count = 0;

    public static void main(String[] args) {

        // write your code here
        int[][] array = {

                {1, 1, 1},

                {1, 0, 1},

                {1, 1, 1}

        };
        new Main().findPathsCount(array, 0, 0);
        System.out.println(count);
    }

    private void findPathsCount(int[][] mat, int i, int j) {
        int m = mat.length - 1;
        int n = mat[0].length - 1;

        if (i > m || j > n) {
            return;
        }

        if (mat[i][j] != 1) {
            return;
        }
        
        if (i == m && j == n) {
            this.count++;
        }

        findPathsCount(mat, i + 1, j);
        findPathsCount(mat, i, j + 1);
    }
}
