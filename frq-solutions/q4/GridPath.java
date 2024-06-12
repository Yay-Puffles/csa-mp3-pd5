import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
   public Location getNextLoc(int row, int col) {
     Location locR = new Location(row, col+1);
     Location locB = new Location(row+1, col);
     if (row == grid.length-1){
       return locR;
     }
     else if (col == grid[0].length-1){
       return locB;
     }
     else {
       if (grid[row][col+1] < grid[row+1][col]) {
         return locR;
       } 
       else {
         return locB;
       }
     }
   }

  
  // PART B
   public int sumPath(int row, int col) {
     int sum = grid[row][col];
     while (row < grid.length-1 && col < grid[0].length-1){
       Location loc = getNextLoc(row, col);
       sum += grid[loc.getRow()][loc.getCol()];
       row = loc.getRow();
       col = loc.getCol();
     }
     return sum;
   }

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
