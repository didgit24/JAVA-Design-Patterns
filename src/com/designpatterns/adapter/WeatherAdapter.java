package com.designpatterns.adapter;

/*
* WeatherAdapter helps to adapt WeatherUI and WeatherFinderImpl
* find(String city) and showTemperature(int zipcode)
* Finds city from zipcode and gets the temperature
* */
public class WeatherAdapter {

    public int findTemperature(int zipcode) {
        String city = null;
        if(zipcode == 700045)
            city = "Kolkata";

        WeatherFinder weatherFinder = new WeatherFinderImpl();
        int temperature = weatherFinder.find(city);

        return temperature;
    }
}
