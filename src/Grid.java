import java.util.ArrayList;

public class Grid {
    private int numRows;
    private int numColumns;
    private String[][] grid;

    public class Location {
        private int row;
        private int column;

        public Location(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "row=" + row +
                    ", column=" + column +
                    '}';
        }
    }

    public Grid(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.grid = new String[numRows][numColumns];
    }

    public void add(int row, int column, String description) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            grid[row][column] = description;
        } else {
            throw new IndexOutOfBoundsException("Invalid grid location");
        }
    }

    public String getDescription(int row, int column) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            return grid[row][column];
        }
        else {
            throw new IndexOutOfBoundsException("Invalid grid location");
        }
    }
    public ArrayList<Location>getDescribedLocations(){
        ArrayList<Location>describedLocations = new ArrayList<>();
        for(int i = 0; i<numRows; i++){
            for(int j = 0; j<numColumns;j++){
                if(grid[i][j]!=null){
                    describedLocations.add(new Location(i,j));

                }
            }
        }
        return describedLocations;
    }

}
