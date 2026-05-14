package frq4_2Darray;

public class SumOrSameGame {

    private int[][] puzzle;
    /**
     * Creates a two-dimensional array and fills it with random integers,
     * as described in part (a)
     * Precondition: numRows > 0; numCols > 0
     */
    public SumOrSameGame(int numRows, int numCols)
    {
        this.puzzle = new int[numRows][numCols];
        for(int i = 0 ; i < puzzle.length; i++){
            for(int j = 0 ; j < puzzle[i].length; j++)
                puzzle[i][j] = (int)(Math.random() * 9 + 1);
        }

    }
    /**
     * Identifies and clears an element of puzzle that can be paired with
     * the element at the given row and column, as described in part (b)
     * Preconditions: row and col are valid row and column indices in puzzle.
     * The element at the given row and column is between 1 and 9, inclusive.
     */
    public boolean clearPair(int row, int col)
    {
        int element = puzzle[row][col];
        if(element == 0) return false;
        for(int i = row; i < puzzle.length; i++) {//we only check rows below row so i >= row is redundant
            for (int j = 0; j < puzzle[i].length; j++) {
                if (i == row && j == col) continue;
                if (puzzle[i][j] == element || puzzle[i][j] + element == 10) {
                    puzzle[i][j] = 0;
                    puzzle[row][col] = 0;
                    return true;
                }
            }
        }
        return false;
    }
/* There may be instance variables, constructors,
and methods that are not shown. */
}
