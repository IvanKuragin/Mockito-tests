package ru.netology.geo;

import ru.netology.entity.Location;

public class GeoServiceImplMock implements GeoService{

    private Location value = new Location (null, null, null, 0);
    @Override
    public Location byIp(String ip) {
        return value;
    }

    public Location byCoordinates(double latitude, double longitude) {
        return null;
    }

    public void setGeoValue (Location value) {
        this.value = value;
    }
}
