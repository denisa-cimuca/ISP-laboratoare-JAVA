package isp.lab5.exercise3;

public class Sensor {
    private String installLocation;
    private String name;
    public class PressureSensor extends Sensor{
        private double pressure;
        public PressureSensor(String installLocation, String name){
            super ( installLocation,name);
        }
    }
    public class TemperatureSensor extends Sensor{
        private double temperature;
        public TemperatureSensor(String installLocation, String name){
            super (installLocation,name);
        }
    }
    public Sensor(String installLocation, String name){
        this.installLocation = installLocation;
        this.name = name;
    }
    public String toString(){
        return installLocation + " " + name;
    }
}
