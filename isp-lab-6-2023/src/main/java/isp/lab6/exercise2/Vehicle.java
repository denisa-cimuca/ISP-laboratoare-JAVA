package isp.lab6.exercise2;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Vehicle {
    private String vin;
    private String licensePlate;
    private String make;
    private String model;
    private int year;

    public Vehicle (String vin, String licensePlate , String make , String model , int year ) {
        this.vin=vin;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getVin ( ) {
        return vin;
    }

    public String getLicensePlate ( ) {
        return licensePlate;
    }

    public String getMake ( ) {
        return make;
    }

    public String getModel ( ) {
        return model;
    }

    public int getYear ( ) {
        return year;
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals ( vin , vehicle.vin );
    }

    @Override
    public int hashCode ( ) {
        return Objects.hash ( vin );
    }
    public void addVehicle( Set<Vehicle> registry, Vehicle vehicle) {
        boolean added = registry.add(vehicle);
        if (added) {
            System.out.println("Vehicle added to the registry: " + vehicle);
        } else {
            System.out.println("Vehicle with the same VIN already exists in the registry: " + vehicle);
        }
    }
    @Override
    public String toString ( ) {
        return "Vehicle: " + " " +licensePlate + " " + make + " " + model + " " + year;
    }
}
