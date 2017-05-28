package com.bestcountries.model;

import java.util.List;

/**
 * Created by jorgeotero on 5/27/17.
 */

public class Country {
    private int position;
    private String name;
    private int population;
    private String capital;
    private List<String> languages;
    private String flag;

    public Country(int position, String name, int population, String capital, List<String> languages, String flag) {
        this.position = position;
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.languages = languages;
        this.flag = flag;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}

