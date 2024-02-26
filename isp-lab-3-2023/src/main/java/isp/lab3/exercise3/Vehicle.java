package isp.lab3.exercise3;

 public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    public Vehicle ( String model , String type , int speed , char fuelType ) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public char getFuelType() {
        return fuelType;
    }
    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }
    public String toString(){
        return model + "("+ type + ") speed" + speed + " fuel type " + fuelType;
    }
    }




