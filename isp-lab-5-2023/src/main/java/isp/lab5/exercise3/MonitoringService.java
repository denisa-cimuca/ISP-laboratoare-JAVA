package isp.lab5.exercise3;

public class MonitoringService {
    private double avarageTemperatureSensors;
    private double avarageAllSensors;
    private Sensor sensor;
    public double getAvarageTemperatureSensors(){
        return avarageTemperatureSensors;
    }
    public void setAvarageTemperatureSensors(double avarageTemperatureSensors){
        this.avarageTemperatureSensors = avarageTemperatureSensors;
    }
    public double getAvarageAllSensors(){
        return avarageAllSensors;
    }
    public void setAvarageAllSensors(double avarageAllSensors){
        this.avarageAllSensors = avarageAllSensors;
    }
    public MonitoringService(double avarageTemperatureSensors, double avarageAllSensors){
        this.avarageTemperatureSensors = avarageTemperatureSensors;
        this.avarageAllSensors = avarageAllSensors;
    }
    public MonitoringService(){
        avarageTemperatureSensors =  avarageTemperatureSensors;
        avarageAllSensors = avarageAllSensors;
        sensor = sensor;
    }
    public String toString(){
        return String.valueOf ( avarageTemperatureSensors + avarageAllSensors );
    }
}
