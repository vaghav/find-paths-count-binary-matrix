package FindPathCount;

public class Main {

    private static int count = 0;

    public static void main(String[] args) {

        // write your code here
        int[][] array = {

                {1, 0, 1},

                {1, 0, 0},

                {1, 1, 1}

        };

        System.out.println(findPathsCount(array, 0, 0));
    }

    private static int findPathsCount(int[][] mat, int i, int j) {
        int m = mat.length - 1;
        int n = mat[0].length - 1;

        if (i > m || j > n) {
            return 0;
        }

        if (mat[i][j] != 1) {
            return 0;
        }

        if (i == m && j == n) {
            return 1;
        }

        return findPathsCount(mat, i + 1, j) + findPathsCount(mat, i, j + 1);
    }
}
