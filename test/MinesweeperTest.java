import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinesweeperTest {

    @Test
    void countNeighboringMinesWorksCorrectly() {
        boolean [][] mines=new boolean[3][3];
        mines [1][0]=true;
        mines [2][2]=true;
        assertEquals(1,Minesweeper.countNeighboringMines(mines,2,0));
        assertEquals(2,Minesweeper.countNeighboringMines(mines,1,1));
    }
    @Test
    void detectsWin(){
        boolean [][] mines=new boolean[3][3];
        mines [1][0]=true;
        mines [2][2]=true;
        boolean [][]revealed=new boolean[3][3];
        revealed [0][2]=true;
        revealed [1][2]=true;
        revealed [0][1]=true;
        revealed [1][1]=true;
        revealed [2][1]=true;
        revealed [0][0]=true;
        assertFalse(Minesweeper.hasWon(mines,revealed));
        revealed [2][0]=true;
        assertTrue(Minesweeper.hasWon(mines,revealed));
    }

    @Test
    void autoClears() {
        boolean [][] mines = new boolean[3][3];
        mines[0][2] = true;
        mines[2][2] = true;
        boolean [][] revealed = new boolean[3][3];
        Minesweeper.autoClear(mines, revealed, 0, 0);
        boolean [][] correct = {{true, true, false},
                                {true, true, false},
                                {true, true, false}};
        assertArrayEquals(correct, revealed);
    }
}