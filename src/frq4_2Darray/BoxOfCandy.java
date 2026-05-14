package frq4_2Darray;

public class Candy
{
    /** Returns a String representing the flavor of this piece of candy */
    public String getFlavor(){
        
    }

// There may be instance variables, constructors, and methods that are not shown.
}

public class BoxOfCandy {

    /** box contains at least one row and is initialized in the constructor. */
    private Candy[][] box;
    /**
     * Moves one piece of candy in column col, if necessary and possible, so that the box
     * element in row 0 of column col contains a piece of candy, as described in part (a).
     * Returns false if there is no piece of candy in column col and returns true otherwise.
     * Precondition: col is a valid column index in box.
     */
    public boolean moveCandyToFirstRow(int col)
    {
        if(box[0][col] != null) return true;
        else {
            for(int i = 1; i < box.length; i++){
                if(box[i][col] != (null)) {
                    box[0][col] = box[i][col];
                    box[i][col] = null;
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * Removes from box and returns a piece of candy with flavor specified by the parameter, or
     * returns null if no such piece is found, as described in part (b)
     */
    public Candy removeNextByFlavor(String flavor)
    {
        for(int row = box.length-1; row >= 0; row--){
            for(int col = 0; col < box[row].length; col++ ){

                if(box[row][col] != null && box[row][col].getFlavor().equals(flavor)) {
                    Candy temp = box[row][col];
                    box[row][col] = null;
                    return temp;
                }
            }
        }
        return null;
    }
// There may be instance variables, constructors, and methods that are not shown.
}
