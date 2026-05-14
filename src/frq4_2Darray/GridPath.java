package frq4_2Darray;


public class Location
{
    private int theRow;
    private int theCol;
    public Location(int r, int c)
    {
        theRow = r;
        theCol = c;
    }
    public int getRow()
    { return theRow; }
    public int getCol()
    { return theCol; }
}
public class GridPath {

    /** Initialized in the constructor with distinct values that never change */
    private int[][] grid;
    /**
     * Returns the Location representing a neighbor of the grid element at row and col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in grid.
     * row and col do not specify the element in the last row and last column of grid.
     */
    public Location getNextLoc(int row, int col) {
        int element;
        Location downNeighbour = new Location(row + 1, col);
        Location rightNeighbour = new Location(row, col + 1);
        int dN = grid[row + 1][col];
        int rN = grid[row][col + 1];
        if (col < grid[0].length - 1 && row < grid.length - 1 ) {
            element = Math.min(dN , rN);
            return (element == dN ? downNeighbour : rightNeighbour);
        } else if (col == grid[0].length - 1) {
            return downNeighbour;
        }
            return rightNeighbour;
    }
    /**
     * Computes and returns the sum of all values on a path through grid, as described in
     * part (b)
     * Preconditions: row is a valid row index and col is a valid column index in grid.
     * row and col do not specify the element in the last row and last column of grid.
     */
    public int sumPath(int row, int col)
    {
        int curRow = row;
        int curCol = col;
        int sum = 0;
        while(curRow != grid.length - 1 || curCol != grid[0].length - 1){
            sum += grid[curRow][curCol];
            Location currentLocation = getNextLoc(curRow, curCol);
            curRow = currentLocation.getRow();
            curCol = currentLocation.getCol();
        }
        return sum + grid[curRow][curRow];
    }
// There may be instance variables, constructors, and methods that are not shown.
}
