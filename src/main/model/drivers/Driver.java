package src.main.model.drivers;

import src.main.model.Team;

public interface Driver {

    //getters
    String getDriverName();

    int getDriverNumber();

    Team getDriverTeam();

    boolean getDriverFullTimeStatus();

    //setters
    void setDriverName(String driverName);

    void setDriverNumber(int driverNumber);

    void setDriverTeam(Team driverTeam);

    void setDriverFullTimeStatus(boolean status);
}
