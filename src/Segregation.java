public class Segregation {

    public static void main(String[] args) {
        int zeroCount = 3;
        int oneCount = 8;
        int twoCount = 5;
        int width = 4;
        int[] population = createPopulation(zeroCount, oneCount, twoCount);
        int[][] grid = distributePopulation(population, width);
        for (int r = 0; r < width; r++) {
            for (int c = 0; c < width; c++) {
                StdOut.print(grid[r][c]);
            }
            StdOut.println();
        }
    }

    static int[] createPopulation(int zeroCount, int oneCount, int twoCount) {
        int[] result = new int[16];
        for (int i = 0; i < zeroCount; i++) {
            result[i] = 0;
        }
        for (int i = zeroCount; i < zeroCount + oneCount; i++) {
            result[i] = 1;
        }
        for (int i = zeroCount + oneCount; i < zeroCount + oneCount + twoCount; i++) {
            result[i] = 2;
        }
        return result;
    }

    static int[][] distributePopulation(int[] population, int width) {
        int[][] result = new int[width][width];
        int i = 0;
        for (int r = 0; r < width; r++) {
            for (int c = 0; c < width; c++) {
                result[r][c] = population[i];
                i++;
            }
        }
        return result;
    }

}
