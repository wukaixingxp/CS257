/**
 * Created by Kaixing on 2/25/2017.
 */
public class Grid {
    private int number = 0;
    private boolean display = false;
    private int xLocation;
    private int yLocation;

    public int getNumber() {
        return this.number;
    }

    public boolean getDisplay() {
        return this.display;
    }

    public int getxLocation() {
        return this.xLocation;
    }
    public int getyLocation() {
        return this.yLocation;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }
    public void setxLocation(int xLocation) {
        this.number = xLocation;
    }
    public void setyLocation(int yLocation) {
        this.number = yLocation;
    }
    public void merge(Grid mergeGrid) {
        if (mergeGrid == null) {
            System.out.println("merging with null");
            return;
        }
        if (!mergeGrid.getDisplay()) {
            return;
        }
        if (mergeGrid.getNumber() == this.number) {
            this.number = this.number * 2;
            mergeGrid.setNumber(0);
            mergeGrid.setDisplay(false);
        }
    }
}


