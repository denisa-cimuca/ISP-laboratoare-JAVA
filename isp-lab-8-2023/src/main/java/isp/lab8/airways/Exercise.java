package isp.lab8.airways;

import examples.files.FilesAndFoldersUtil;

import java.io.File;
import java.nio.file.Files;
import java.util.List;
import java.util.scanner;

public class Exercise {
    public static void main(String[] args) {
        //1. create route
        //input route
        // routs folder exists
        File routes = new File();
        FilesAndFoldersUtil.createFolder ( "routes/ LRCL-TASOD" );
        FilesAndFoldersUtil.createFolder ( "routes/ TASOD-SOPAV" );
        FilesAndFoldersUtil.createFolder ( "routes/ SOPAV-BIRGU" );
        FilesAndFoldersUtil.createFolder ( "routes/ BIRGU-LROP" );

        //2. create waypoint
        //menu asks input waypoint atributes
        System.out.println("Create waypoint " );
        String createWaypoint = scanner.nextLine();
        List<Waypoint> waypoints = FilesUtils.getWaypoints ();
        while (createWaypoint.equalsIgnoreCase("Y")){
            System.out.println ( "Enter waypoint name:");
            String waypointName = scanner.nextLine();

            //create waypoint object
            Waypoint waypoint = new Waypoint (waypointName);
            FilesUtils.writeWypoint ( waypoint,routes);
            waypoint.add(waypoint);

        }

        //3. calculate route distance
        //menu asks the route
        //= load all the files from, route folder into memory
        //calculate the distance between each consecutive points ex: LRCL-TASOD-SOPAV(2 distante aici)

        //4. menu asks delete route folder TASOD-SOPAV - delete it
        System.out.println ( "Delete route" );
        }
    }

