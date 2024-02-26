package isp.lab3.test.ex3;

import isp.lab3.exercise3.Vehicle;

public class TestVehicle {
    public static void main ( String[] args ) {
        Vehicle v1 = new Vehicle ( "Dacia" , "Logan " , 150 , 'B' );
        Vehicle v2 = new Vehicle ( "Ford" , "Kuga" , 180 , 'D' );
        System.out.println ( v1.toString ( ) );
        System.out.println ( v2.toString ( ) );
    }
}
