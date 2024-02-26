package isp.lab5.exercise3;

public class Exercise3 {
    public static void main(String[] args){
        MonitoringService m = new MonitoringService (  );
        Sensor s = new Sensor ( "Arad", "apa" );
        System.out.println(m.toString ());
        System.out.println(s.toString ());
    }
}
