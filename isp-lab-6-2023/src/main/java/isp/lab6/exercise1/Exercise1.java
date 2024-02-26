package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1 {
    public static void main ( String[] args ) {
        List<Student> studs = new ArrayList<> ( );
        Map<String, Student> studMap = new HashMap<> ( );
        Student student1 = new Student ( "Denisa" , "Cimuca" , "1234" );
        student1.addGrade ( "ISP" , 10 );
        student1.addGrade ( "TS" , 9 );
        student1.addGrade ( "EIM" , 8 );
        studs.add ( student1 );
        System.out.println ( );

        Student student2 = new Student ( "Daria" , "Pop" , "5678" );
        student2.addGrade ( "ISP" , 5 );
        student2.addGrade ( "TS" , 7 );
        student2.addGrade ( "EIM" , 6 );
        studs.add(student2);
        System.out.println ( );


        Student student3 = new Student ( "Tavi" , "Marian" , "0905" );
        student3.addGrade ( "ISP" , 9 );
        student3.addGrade ( "TS" , 8 );
        student3.addGrade ( "EIM" , 10 );
        studs.add(student3);
        studs.remove(student2);
        System.out.println();

        double media1 = student1.getAverageGrade ();
        double media2 = student2.getAverageGrade ();
        double media3 = student3.getAverageGrade ();
        System.out.println (  );


    }

}
