package com.example.aslan_m3_hw_4.Continents;

import java.io.Serializable;

public class Continent implements Serializable {

    private String name;
    private String numberOfCountries;
    private int ImageMap;

    public Continent(String name, String numberOfCountries, int imageMap) {
        this.name = name;
        this.numberOfCountries = numberOfCountries;
        ImageMap = imageMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfCountries() {
        return numberOfCountries;
    }

    public void setNumberOfCountries(String numberOfCountries) {
        this.numberOfCountries = numberOfCountries;
    }

    public int getImageMap() {
        return ImageMap;
    }

    public void setImageMap(int imageMap) {
        ImageMap = imageMap;
    }
}
