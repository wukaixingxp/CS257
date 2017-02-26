import java.util.*;

/**
 * Created by Kaixing on 2/25/2017.
 */
public class Board {
    public Grid[][] gridList;

    public void setGridList(Grid[][] gridList) {
        this.gridList = gridList;
    }
    public void startGame() {
        Grid[][] gridList = new Grid[4][4];
        gridList[1][1] = new Grid();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Grid grid = new Grid();
                grid.setxLocation(i);
                grid.setyLocation(j);
                gridList[i][j] = grid;
            }
        }
        setGridList(gridList);
    }
    // This function generate a random grid in a random location, and assign a number value to the grid.
    public void generateRandom(){
        Random generateGrid = new Random();
        // First, we generate a random location.
        int location = generateGrid.nextInt(15);
        int x = location/4;
        int y = location%4;
        Grid grid = this.gridList[x][y];
        // If the location is used, generate a random location again.
        if (grid.getDisplay()){
            generateRandom();
            return;
        }
        // Generate a random number and assign to the grid.
        int num = generateGrid.nextInt(2);
        if (num == 0){
            grid.setNumber(2);
            grid.setDisplay(true);
        }
        if (num == 1){
            grid.setNumber(4);
            grid.setDisplay(true);
        }
        this.gridList[x][y] = grid;
    }
    public void rollLeft(){
        rollOnerowLeft(gridList[0][0]);
        rollOnerowLeft(gridList[1][0]);
        rollOnerowLeft(gridList[2][0]);
        rollOnerowLeft(gridList[3][0]);
    }
    private void rollOnerowLeft(Grid startGrid) {
        int x = startGrid.getxLocation();
        int y = startGrid.getyLocation();
        while (y < 4) {
            y = y + 1;
            startGrid.merge(this.gridList[x][y]);
        }
    }
}
