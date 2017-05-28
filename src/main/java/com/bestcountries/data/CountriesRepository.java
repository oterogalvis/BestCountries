package com.bestcountries.data;

import com.bestcountries.model.Country;
import com.bestcountries.model.NoCountryFoundException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jorgeotero on 5/27/17.
 */

@Component
public class CountriesRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country(1, "Switzerland", 8300000, "Bern", Arrays.asList("German", "French", "Italian", "Rumantsch"), "ch.png"),
            new Country(2, "Canada", 35900000, "Ottawa", Arrays.asList("English", "French"), "ca.png"),
            new Country(3, "United Kingdom", 65100000, "London", Arrays.asList("English"), "gb.png"),
            new Country(4, "Germany", 81400000, "Berlin", Arrays.asList("German"), "de.png"),
            new Country(5, "Japan", 127000000, "Tokyo", Arrays.asList("Japanese"), "jp.png"));

    public List<Country> getCountriesByPosition() {
        ALL_COUNTRIES.sort(Comparator.comparing(Country::getPosition));
        return ALL_COUNTRIES;
    }

    public List<Country> getCountriesByName() {
        ALL_COUNTRIES.sort(Comparator.comparing(Country::getName));
        return ALL_COUNTRIES;
    }

    public List<Country> getCountriesByPopulation() {
        ALL_COUNTRIES.sort(Comparator.comparing(Country::getPopulation));
        Collections.reverse(ALL_COUNTRIES);
        return ALL_COUNTRIES;
    }

    public Country getCountryByPosition(int position) throws NoCountryFoundException {
        return ALL_COUNTRIES.stream().filter(country -> country.getPosition() == position).findFirst().orElseThrow(NoCountryFoundException::new);
    }
}
