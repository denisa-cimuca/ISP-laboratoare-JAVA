package isp.lab5.exercise1;

import java.time.LocalDateTime;

public class Order {
    private String oderId;
    private LocalDateTime date;
    private Double totalPrice;


    public Order ( String oderId , LocalDateTime date , Double totalPrice ) {
        this.oderId = oderId;
        this.date = date;
        this.totalPrice = totalPrice;
    }
    public String getOderId(){
        return oderId;
    }
    public void setOderId(String oderld){
        this.oderId = oderld;
    }
    public LocalDateTime getDate(){
        return date;
    }
    public void setDate(LocalDateTime date){
        this.date = date;
    }
    public Double getTotalPrice(){
        return totalPrice;
    }
    public void setTotalPrice(Double totalPrice){
        this.totalPrice = totalPrice;
    }
    public String toString(){
        return oderId + " " + date + " " + totalPrice;
    }

}
