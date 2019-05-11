package geometric;

import resizable.Resizable;

public class Circle extends Geometric implements Resizable {
    private double radius = 10;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resizable (double resizePercent) {
        this.radius = this.radius * resizePercent;
    }
}
