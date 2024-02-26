package isp.lab5.exercise2;

public class Exercise2 {
    public static void main(String[] args){
        Laptop l = new Laptop ( 100 );
        SmartPhone p = new SmartPhone ( 35 );
        SmartWatch w =new SmartWatch ( 20 );
        System.out.println(l.charge ( 10 ));
        System.out.println(p.charge ( 10 ));
        System.out.println(w.charge ( 10 ));
    }
}
