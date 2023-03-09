public class WednesdayHomework {
//Write the Java Function that:
// Given an n x n binary grid, in one step you can choose two adjacent rows of the grid and swap them. x
// A grid is said to be valid if all the cells above the main diagonal are zeros. x
// Return the minimum number of steps needed to make the grid valid, or -1 if the grid cannot be valid. x
// The main diagonal of a grid is the diagonal that starts at cell (1, 1) and ends at cell (n, n). x

  private int count;

  public static void main(String[] args) {
    int[][] grid = new int[3][3];
    grid[0] = new int[]{0, 2, 2};
    grid[1] = new int[]{0, 2, 0};
    grid[2] = new int[]{0, 0, 0};
    WednesdayHomework inst = new WednesdayHomework();
    System.out.println(inst.swapIfValid(grid));

  }

  public int swapIfValid(int[][] grid) {
    int current = grid.length - 1;
    count = 0;
    //
    for(int i=0; i < grid.length; i++){
      boolean match = false;
      int start = grid.length - current - 1;
      for(int j = start; j < grid.length; j++){
        if(hasRequiredZeroes(grid[j], current)){
          match = true;

          for(int k= j; k > start; k--){
            swap(grid, k, k-1);
          }
          break;
        }
      }
      if(!match) {
        return -1;
      }
      current--;
    }
    return count;
  }
  private boolean hasRequiredZeroes(int[] row, int numZero){
    if(numZero <= 0) return true;
    for(int i = row.length-1;i >= 0; i--){
      if(row[i] == 0){
        numZero--;
        if(numZero == 0) {
          return true;
        }
      } else {
        break;
      }
    }
    return numZero <= 0;
  }
  private void swap(int[][] grid, int row1, int row2){
    int[] temp = grid[row1];
    grid[row1] = grid[row2];
    grid[row2] = temp;
    count++;
  }
}