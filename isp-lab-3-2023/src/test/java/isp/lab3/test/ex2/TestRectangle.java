package isp.lab3.test.ex2;

import isp.lab3.exercise2.Rectangle;

public class TestRectangle {
        public static void main(String[] args){
            Rectangle rectangle1 = new Rectangle();
            System.out.println("Rectange 1:");
            System.out.println("Length:" + rectangle1.getLength());
            System.out.println("Width:" + rectangle1.getWidth());
            System.out.println("Color:" + rectangle1.getColor());
            System.out.println("Perimeter:" + rectangle1.getPerimeter());
            System.out.println("Area:" + rectangle1.getArea());

            Rectangle rectangle2 = new Rectangle(5,9, "purple");
            System.out.println("Rectange 2:");
            System.out.println("Length:" + rectangle2.getLength());
            System.out.println("Width:" + rectangle2.getWidth());
            System.out.println("Color:" + rectangle2.getColor());
            System.out.println("Perimeter:" + rectangle2.getPerimeter());
            System.out.println("Area:" + rectangle2.getArea());
        }
    }
