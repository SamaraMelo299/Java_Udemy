package Interfaces.ex3.application;

import Interfaces.ex3.model.entities.AbstractShape;
import Interfaces.ex3.model.enums.Color;
import Interfaces.ex3.model.entities.Circle;
import Interfaces.ex3.model.entities.Rectangle;
import Interfaces.ex3.model.entities.Shape;

public class Program3 {

    public static void main(String[] args) {

        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
    }
}
