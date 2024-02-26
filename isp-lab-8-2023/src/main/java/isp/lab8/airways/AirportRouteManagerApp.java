package isp.lab8.airways;

import java.awt.*;

public interface AirportRouteManagerApp {
    Label title = new Label("Airport Route Managerment Application");
    Label choiceLabel = new Label("Please select an option:");
    Button createRouteBtn = new Button("Create a new route:");
    Button addWaypointBtn = new Button("Create waypoint:");
    Button calculateDistanceBtn = new Button("Calculate distance between:");
    Button loadRouteBtn = new Button("Load a route:");
    Button deleteRouteBtn = new Button("Delete a route:");
    Button exitBtn = new Button("Exit");

}
