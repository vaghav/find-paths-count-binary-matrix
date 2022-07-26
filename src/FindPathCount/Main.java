package FindPathCount;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private int count = 0;

    public static void main(String[] args) {

        // write your code here
        int[][] array = {

                {1, 1, 1},

                {1, 1, 1},

                {1, 1, 1}

        };
        new Main().findPaths(array);
    }

    private void findPaths(int[][] array) {
        List<String> list = new ArrayList<>();
        findPathsCount(array, 0, 0, list);
        System.out.println(count);
    }


    private void findPathsCount(int[][] mat, int i, int j, List<String> list) {
        int m = mat.length - 1;
        int n = mat[0].length - 1;
        //return if i or j crosses matrix size
        if (i > m || j > n) {
            return;
        }

        if (mat[i][j] != 1) {
            return;
        }


        //list.add("[" + i + "," + j + "]");
        if (i == m && j == n) {
            this.count++;
        }

        findPathsCount(mat, i + 1, j, list);
        findPathsCount(mat, i, j + 1, list);
    }
}
