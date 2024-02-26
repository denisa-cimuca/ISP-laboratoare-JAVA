package isp.lab3.test.ex4;

import isp.lab3.exercise4.MyPoint;

public class TestMyPoint {
    public static void main(String[] args){
        MyPoint p1 = new MyPoint(1,1,1);
        MyPoint p2 = new MyPoint(2,3,4);
        System.out.println("Point 1:" + p1.toString());
        System.out.println("Point 2:" + p2.toString());
    }
}
