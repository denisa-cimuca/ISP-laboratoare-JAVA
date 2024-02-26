package isp.lab5.exercise2;

public class SmartWatch {
    private int batteryLevel;
    public SmartWatch(int batteryLevel){
        this.batteryLevel = batteryLevel;
    }
    public int getBatteryLevel(){
        return batteryLevel;
    }
    public int charge(int durationInMinutes){
        double charge = 0.5 * durationInMinutes;
        batteryLevel += charge;
        if(batteryLevel > 100){
            batteryLevel = 100;
        }
        return batteryLevel;
    }
}
