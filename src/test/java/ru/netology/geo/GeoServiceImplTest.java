package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class GeoServiceImplTest {

    private final Location expected = new Location ("Moscow", Country.RUSSIA, "Lenina", 15);


    @Test
    @DisplayName("Локализация по IP")
    void byIPTest () {
        GeoServiceImplMock geoService = new GeoServiceImplMock();
        geoService.setGeoValue(expected);

        String ip = "172.0.10.1";
        Assertions.assertEquals(expected, geoService.byIp(ip));
    }
}
