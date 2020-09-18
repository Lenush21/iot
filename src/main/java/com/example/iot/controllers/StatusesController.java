package com.example.iot.controllers;

import java.util.Date;

public class StatusesController {
   
    private Date date;
    private int temperatureC;
    private int temperatureF;
    private String summary;


    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTemperatureC() {
        return this.temperatureC;
    }

    public void setTemperatureC(int temperatureC) {
        this.temperatureC = temperatureC;
    }

    public int getTemperatureF() {
        return this.temperatureF;
    }

    public void setTemperatureF(int temperatureF) {
        this.temperatureF = temperatureF;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


    @Override
    public String toString() {
        return "{" +
            " date='" + getDate() + "'" +
            ", temperatureC='" + getTemperatureC() + "'" +
            ", temperatureF='" + getTemperatureF() + "'" +
            ", summary='" + getSummary() + "'" +
            "}";
    }


}