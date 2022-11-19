package src.main.model.drivers;

public class FullTimeDriver implements Driver {
    public String name;
    public int driverNumber;
    public boolean FTDriverStatus;
    public String team;

    //Constructor to initialize the driver parameters
    public FullTimeDriver(String name, int driverNumber, boolean FTDriverStatus, String team) {
        this.name = name;
        this.driverNumber = driverNumber;
        this.FTDriverStatus = FTDriverStatus;
        this.team = team;
    }


    //setters
    public void setDriverName(String name) {
        this.name = name;
    }

    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
    }

    public void setDriverStatus(boolean FTDriverStatus) {
        this.FTDriverStatus = FTDriverStatus;
    }

    public void setDriverTeam(String team) {
        this.team = team;
    }

}
