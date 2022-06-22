public class Leetcode59 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int i = 0;
        int j = 0;
        int k = 0;
        int count = 1;
        int loop = 0;
        for (int a = 1; a <= Math.pow(n,2); a++) {
            matrix[i][j] = a;
            // move right
            if (i==k && j<(n-k-1)) {
                j++;
            }
            // move down
            else if (j==(n-k-1) && i<(n-k-1)) {
                i++;
            }
            // move left
            else if (i==(n-k-1) && j>(k)) {
                j--;
            }
            // move up
            else if (j==(k) && i>k+1) {
                i--;
                count++;
            }
            else  {
                k++;
                j++;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = generateMatrix(9);
        System.out.println("done");
        for (int[] row: matrix) {
            for (int num: row) {
                System.out.print(num);
            }
            System.out.print("\n");
        }
    }
}
