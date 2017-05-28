package com.bestcountries.controller;

import com.bestcountries.data.CountriesRepository;
import com.bestcountries.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jorgeotero on 5/27/17.
 */

@Controller
public class CountriesController {
    @Autowired
    CountriesRepository countriesRepository;

    @RequestMapping("/")
    public String getCountriesByPosition(ModelMap modelMap) {
        List<Country> countriesByPosition = countriesRepository.getCountriesByPosition();
        modelMap.put("countries", countriesByPosition);
        return "index";
    }

    @RequestMapping("/by-name")
    public String getCountriesByName(ModelMap modelMap) {
        List<Country> countriesByName = countriesRepository.getCountriesByName();
        modelMap.put("countries", countriesByName);
        return "index";
    }

    @RequestMapping("/by-population")
    public String getCountriesByPopulation(ModelMap modelMap) {
        List<Country> countriesByPopulation = countriesRepository.getCountriesByPopulation();
        modelMap.put("countries", countriesByPopulation);
        return "index";
    }

    @RequestMapping("/detail/{position}")
    public String getCountryDetails(@PathVariable int position, ModelMap modelMap) {
        Country countryByPosition = countriesRepository.getCountryByPosition(position);
        modelMap.put("country", countryByPosition);
        return "detail";
    }
}
