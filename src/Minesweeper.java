public class Minesweeper {
    public static void main(String[] args) {
        boolean[][] mines = createMinefield(10);
        printMinefield(mines);
        StdDraw.setScale(-0.5, mines.length-0.5);
        drawMinefield(mines);
        while (true) {
            handleMouseClick(mines);
        }
    }

    static int countNeighboringMines(boolean[][] mines, int x, int y) {
        int count = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if ((i >= 0 && i < mines.length)&&(j >=0 && j < mines.length)) {
                    if (mines[i][j]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static void handleMouseClick(boolean[][] mines) {
        while (!StdDraw.isMousePressed()) {
            //do nothing
        }
        double x = Math.round(StdDraw.mouseX());
        double y = Math.round(StdDraw.mouseY());
        while (StdDraw.isMousePressed()) {
            //do nothing
        }
        StdOut.println(x + "," + y);
        if (mines[(int) x][(int) y]) {
            StdOut.println("Boom");
        } else {
            StdOut.println("Safe");
        }
    }

    /**
     * Returns a width by width grid of mines or not mines,
     * with five randomly placed mines.
     */
    static boolean[][] createMinefield(int width) {
        boolean[][] mines = new boolean[width][width];
        for (int i = 0; i < 5; i++) {
            int x = StdRandom.uniform(width);
            int y = StdRandom.uniform(width);
            if (mines[x][y]) {
                i--;
            } else {
                mines[x][y] = true;
            }

        }
        return mines;
    }

    static void printMinefield(boolean[][] mines) {
        for (int y = mines[0].length - 1; y >= 0; y--) {
            for (int x = 0; x < mines.length; x++) {
                if (mines[x][y]) {
                    StdOut.print('*');
                } else {
                    StdOut.print('.');
                }


            }
            StdOut.println();
        }

    }

    static void drawMinefield(boolean[][] mines) {
        for (int x = 0; x < mines.length; x++) {
            for (int y = 0; y < mines.length; y++) {
                if (mines[x][y]) {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledCircle(x, y, 0.3);
                    StdDraw.setPenColor();
                }
                else {
                    int n = countNeighboringMines(mines, x, y);
                    if (n != 0) {
                        StdDraw.text(x, y, "" + n);
                    }
                }
                StdDraw.square(x, y, 0.5);
            }
        }
    }
}
