package src.main.model.calendar.raceWeekend.race;

public class race {
    //TODO: actual race distance, name, country.
    private String name;
    private RaceDistance distance;
    private int laps;


    //getters
    public int getLaps() {
        return laps;
    }

    public String getName() {
        return name;
    }

    public RaceDistance getDistance() {
        return distance;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setDistance(RaceDistance distance) {
        this.distance = distance;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }
}
