package aut.isp.lab4.exercise2;

import aut.isp.lab4.exercise1.AquariumController;

public class FishFeederTest {
    public static void main(String[] args) {
        FishFeeder f = new FishFeeder (4);
        System.out.println(f.toString ());

        FishFeeder f1 = new FishFeeder (14);
        System.out.println(f1.toString ());
    }
}
