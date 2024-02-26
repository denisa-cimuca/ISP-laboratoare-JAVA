package aut.isp.lab4.exercise5;

public class AquariumController {
    private FishFeeder feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private int temperature;
    public void setFeedingTime( float feedingTime){

        this.feedingTime = feedingTime;
    }
    public void setCurrentTime( float currentTime){
        this.currentTime = currentTime;
        if( feedingTime - currentTime == 1.70)
            System.out.println ( "fillUp" );
    }
    public void checkTemperature(){
    }
    public  void checkWaterLevel(){
    }

    public String toString(){
        return "feedingTime: " + feedingTime;}

    public static void main(String[] args) {

    }
}
