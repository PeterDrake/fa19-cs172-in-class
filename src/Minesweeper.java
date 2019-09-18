public class Minesweeper {
    public static void main(String[] args) {
        boolean[][] mines = createMinefield(10);
        printMinefield(mines);
    }
    static boolean[][] createMinefield(int width) {
        boolean[][] mines = new boolean [width][width];
        for (int i = 0; i < 5; i++) {
            int x = StdRandom.uniform(width);
            int y = StdRandom.uniform(width);
            if (mines [x][y]){
                i--;
            }
            else {
                mines[x][y] = true;
            }

        }
        return mines;
    }
    static void printMinefield(boolean[][] mines) {
        for (int y = mines[0].length-1; y >= 0; y--) {
            for (int x = 0; x < mines.length; x++){
                if (mines [x] [y]){
                    StdOut.print('*');
                }
                else {
                    StdOut.print('.');
                }


            }
            StdOut.println();
        }

    }
}
