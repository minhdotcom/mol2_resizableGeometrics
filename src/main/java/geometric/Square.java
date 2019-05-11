package geometric;

import resizable.Resizable;

public class Square extends Rectangle implements Resizable {
    private double size = 10;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void resizable (double resizePercent) {
        this.size = this.size * resizePercent;
    }
}
