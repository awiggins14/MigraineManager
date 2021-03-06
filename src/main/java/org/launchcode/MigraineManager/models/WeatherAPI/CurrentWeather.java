package org.launchcode.MigraineManager.models.WeatherAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWeather {

    private Location location;

    private Current current;

    public CurrentWeather() {}

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Location: " + this.location.toString() + "\nCurrent: " + this.current.toString();
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}
