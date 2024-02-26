package isp.lab6.exercise1;

import java.util.*;

public class Student {

    private String FirstName;
    private String LastName;
    private String ID;
    private HashMap<String, Integer> grades = new HashMap<> ();

    public Student ( String firstName , String LastName , String ID) {
        this.FirstName = firstName;
        this.LastName = LastName;
        this.ID = ID;
    }

    public String getFirstName ( ) {
        return FirstName;
    }

    public String getLastName ( ) {
        return LastName;
    }

    public String getID ( ) {
        return ID;
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;
        Student student = (Student) o;
        return Objects.equals ( ID , student.ID );
    }

    @Override
    public int hashCode ( ) {
        return Objects.hash ( ID );
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }
    public double getAverageGrade() {
        double suma = 0;
        int count = 0;
        for (int grade : grades.values()) {
            suma += grade;
            count++;
        }
        return suma / count;
    }

    @Override
    public String toString ( ) {
        return FirstName + " " + LastName + " " + ID + " " + grades;
    }

}
