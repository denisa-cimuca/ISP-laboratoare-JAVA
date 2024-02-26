package isp.lab5.exercise2;

public class Laptop {
    private int batteryLevel;
    public Laptop(int batteryLevel){
        this.batteryLevel = batteryLevel;
    }
    public int getBatteryLevel(){
        return batteryLevel;
    }
    public int charge(int durationInMinutes){
        double charge = 2 * durationInMinutes;
        batteryLevel += charge;
        if(batteryLevel > 100){
            batteryLevel = 100;
        }
        return batteryLevel;
    }
}
