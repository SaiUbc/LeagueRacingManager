package src.main.model.drivers;

import src.main.model.Team;

//Brainstorm ideas about the roles a reserveDriver might have

public class ReserveDriver implements Driver {
    public String driverName;
    public int driverNumber;
    public boolean FTDriverStatus;
    public Team driverTeam;

    public ReserveDriver(String driverName, int driverNumber, boolean FTDriverStatus, Team driverTeam) {
        this.driverName = driverName;
        this.driverNumber = driverNumber;
        this.FTDriverStatus = false;
        this.driverTeam = driverTeam;
    }

    @Override
    public String getDriverName() {
        return driverName;
    }

    @Override
    public int getDriverNumber() {
        return driverNumber;
    }

    @Override
    public Team getDriverTeam() {
        return driverTeam;
    }

    @Override
    public boolean getDriverFullTimeStatus() {
        return FTDriverStatus;
    }

    @Override
    public void setDriverName(String driverName) {
        this.driverName = driverName;
        
    }

    @Override
    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
        
    }

    @Override
    public void setDriverTeam(Team driverTeam) {
        this.driverTeam = driverTeam;
        
    }

    @Override
    public void setDriverFullTimeStatus(boolean status) {
        FTDriverStatus = status;
    }
}