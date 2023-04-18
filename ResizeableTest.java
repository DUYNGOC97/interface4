package interface4;

import inheritance.Square;

public class ResizeableTest {
    public static void main(String[] args) {

        Circle[] c = new Circle[2];
        c[0] = new Circle(3.2);
        c[1] = new Circle(5.2);

        for(Circle circle:c) {
            System.out.println("befor resizing: ");
            System.out.println(circle);


            circle.resize(50);
            System.out.println("after resizing: ");
            System.out.println(circle);

            }
        Rectangle[] r = new Rectangle[2];
        r[0] = new Rectangle(3,5);
        r[1] = new Rectangle(5,2);

        for(Rectangle rectangle:r) {
            System.out.println("befor resizing: ");
            System.out.println(rectangle);


            rectangle.resize(50);
            System.out.println("after resizing: ");
            System.out.println(rectangle);
        }
        }
    }

