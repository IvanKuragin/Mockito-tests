package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

public class LocalizationServiceImplTest {

    @Test
    @DisplayName("Сообщение")
    void localeTest () {
        LocalizationServiceImplMock localizationService = new LocalizationServiceImplMock();
        localizationService.setCountryValue("Добро пожаловать");

        String expected = "Добро пожаловать";
        Assertions.assertEquals(expected, localizationService.locale(Country.RUSSIA));
    }
}
