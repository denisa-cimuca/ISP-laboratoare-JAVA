package aut.isp.lab4.exercise5;

public class Actuator {
    private String manufacturer;
    private String model;
    public boolean turnOn(){
        return true;
    }
    public int turnOff(){
        return 1;
    }
    public String toString(){
        return "manufacturer: " + manufacturer +"model: " + model;
    }
}