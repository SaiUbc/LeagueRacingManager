package src.main.model.drivers;

import src.main.model.Team;

public interface Driver {

    //EFFECTS: returns the drivers name future implementation could include discord_id
    String getDriverName();

    //EFFECTS: returns the drivers racing number
    int getDriverNumber();

    //EFFECTS: returns the drivers Team
    Team getDriverTeam();

    //EFFECTS: returns the driver's Full time status
    boolean getDriverFullTimeStatus();


    //setters
    void setDriverName(String driverName);

    void setDriverNumber(int driverNumber);

    void setDriverTeam(Team driverTeam);

    void setDriverFullTimeStatus(boolean status);

}
