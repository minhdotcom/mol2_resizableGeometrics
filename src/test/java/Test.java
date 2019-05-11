import geometric.*;
import resizable.*;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        Geometric[] geometrics = new Geometric[3];
//        geometrics[0] = new Circle();
//        geometrics[1] = new Rectangle();
//        geometrics[2] = new Square();
//
//        for (Geometric element : geometrics) {
//            if (element instanceof Circle) {
//                Circle circle = (Circle) element;
//                circle.resizable(2);
//                System.out.println("circle: " + circle.getRadius());
//            } else if (element instanceof Square) {
//                Square circle = (Square) element;
//                circle.resizable(2);
//                System.out.println("square: " + circle.getSize());
//            } else if (element instanceof Rectangle) {
//                Rectangle circle = (Rectangle) element;
//                circle.resizable(2);
//                System.out.println("rectangle: " + circle.getWidth());
//            }
//        }

        ArrayList <Geometric> geometric = new ArrayList<>();
        geometric.add(new Circle());
        geometric.add(new Rectangle());
        geometric.add(new Square());

        for (Geometric element : geometric) {
            if (element instanceof Circle) {
                Circle circle = (Circle) element;
                circle.resizable(2);
                System.out.println("circle: " + circle.getRadius());
            } else if (element instanceof Square) {
                Square circle = (Square) element;
                circle.resizable(2);
                System.out.println("square: " + circle.getSize());
            } else if (element instanceof Rectangle) {
                Rectangle circle = (Rectangle) element;
                circle.resizable(2);
                System.out.println("rectangle: " + circle.getWidth());
            }
        }

    }
}
