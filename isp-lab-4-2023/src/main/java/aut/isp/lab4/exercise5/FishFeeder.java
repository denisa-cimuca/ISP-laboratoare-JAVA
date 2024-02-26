package aut.isp.lab4.exercise5;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;
    public FishFeeder(int meals){
        this.meals = meals;
    }
    public int feed(){
        meals = meals + 1;
        return meals;
    }
    public int fillUp(){
        if(feed () <= 14){
            meals = 14 - meals;
            return meals;}
        if(feed ()  > 14)
            meals = 0;
        return meals;
    }
    public String toString(){

        return String.valueOf (fillUp ()  ) ;
    }
}

