package isp.lab5.exercise2;

public class SmartPhone {
    private int batteryLevel;
    public SmartPhone(int batteryLevel){
        this.batteryLevel = batteryLevel;
    }
    public int getBatteryLevel(){
        return batteryLevel;
    }
    public int charge(int durationInMinutes){
        double charge = 1 * durationInMinutes;
        batteryLevel += charge;
        if(batteryLevel > 100){
            batteryLevel = 100;
        }
        return batteryLevel;
    }
}
