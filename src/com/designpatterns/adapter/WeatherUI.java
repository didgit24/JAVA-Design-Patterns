package com.designpatterns.adapter;

public class WeatherUI {

    public void showTemperature(int zipcode) {
        WeatherAdapter weatherAdapter = new WeatherAdapter();
        System.out.println(weatherAdapter.findTemperature(zipcode));
    }

    public static void main(String[] args) {
        WeatherUI ui = new WeatherUI();
        ui.showTemperature(700045);
    }
}
