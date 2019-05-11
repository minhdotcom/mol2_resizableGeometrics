package geometric;

import resizable.Resizable;

public class Rectangle extends Geometric implements Resizable {
    private double width = 10;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void resizable (double resizePercent) {
        this.width = this.width * resizePercent;
    }

}
