public class Analysis {

    public static int first(int[] a) {
        return a[0];
    }

    public static int largest(int[] a) {
        int result = a[0];
        for (int i = 1;
             i < a.length;
             i++) {
            if (a[i] > result) {
                result = a[i];
            }
        }
        return result;
    }

    public static int largest(int[][] a) {
        int result = largest(a[0]);
        for (int i = 1;
             i < a.length;
             i++) {
            int largestInRow = largest(a[i]);
            if (largestInRow > result) {
                result = largestInRow;
            }
        }
        return result;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

}
