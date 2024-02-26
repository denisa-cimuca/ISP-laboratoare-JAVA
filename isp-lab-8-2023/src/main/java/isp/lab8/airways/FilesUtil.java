package isp.lab8.airways;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilesUtils{
    public static void writeWypoint(Waypoint waypoint, File routeDir) throws IDException {
        ObjectMapper objectMapper = new ObjectMapper ( );
        objectMapper.writeValue ( new FileWriter( new File ( routeDir , waypoint.getName ( ) + "json" ) ) , waypoint );
    }
    public static List<Waypoint> getWaypoints(File routeDir) throws IDException{
        List<Waypoint> waypoints = new ArrayList<> ();
        ObjectMapper objectMapper = new ObjectMapper (  );
        File[] waypointFiles = routeDir.listFiles();

        for (File up : waypointFiles) {
            Waypoint waypoint = objectMapper.readValue ( up Waypoint.class );
            waypoints.add( waypoint );
        }
        return waypoints;
        }

    }

