package isp.lab6.exercise2;

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Set<Vehicle> registry = new HashSet<> ( );
        //Map<String,Integer> vehMap = new HashMap<> (  );
        Vehicle vehicle1 = new Vehicle ( "BN23LDV" , "LP34" , "Ford" , "Kuga" , 2010 );
        registry.add (vehicle1 );
        System.out.println ( );

        Vehicle vehicle2 = new Vehicle ( "BN09DXT" , "LP25" , "Audi" , "S5" , 2015 );
        registry.add ( vehicle2 );
        System.out.println ( );

        Vehicle vehicle3 = new Vehicle ( "CJ29DUR" , "ER10" , "Audi" , "S6" , 2007 );
        registry.add ( vehicle3 );
        System.out.println ( );

        Vehicle duplicateVehicle = new Vehicle ( "SB28STY" , "TY56" , "Dacia" , "Logan" , 2000 );
        if ( !registry.add ( duplicateVehicle ) ) {
            System.out.println ( "Error" );
        }
        System.out.println ( );

        Vehicle vehicle4 = new Vehicle ( "CJ29DUR" , "ER10" , "Audi" , "S6" , 2007 );
        if ( registry.add (vehicle4  ) ) {
            System.out.println ( "Vehicle added to registry" );
        }
        else{
            System.out.println ( "Vehicle already exists in registry" );
        }
//remove
        registry.remove(vehicle3);
        System.out.println (  );

//check
        String vinFind = "SJ29ATD";
        boolean found = false;
        for(Vehicle vehicle : registry){
            if(vehicle.getVin ().equals ( vinFind )){
                found = true;
            }
        }
        if(found) {
            System.out.println ( ( "Found in registry" ) );
        }
        else {
            System.out.println ( "Not found in registry" );
        }
        }
    }


