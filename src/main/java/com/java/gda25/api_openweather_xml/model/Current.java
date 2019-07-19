package com.java.gda25.api_openweather_xml.model;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "current")
public class Current {
//    @XmlElement(name = "city")
    private City city;
//    @XmlElement(name = "temperature")
    private Temperature temperature;
//    @XmlElement(name = "humidity")
    private Humidity humidity;
//    @XmlElement(name = "pressure")
    private Pressure pressure;
//    @XmlElement(name = "wind")
    private Wind wind;
//    @XmlElement(name = "clouds")
    private Clouds clouds;
//    @XmlElement(name = "visibility")
    private Visibility visibility;
//    @XmlElement(name = "precipitation")
    private Precipitation precipitation;
//    @XmlElement(name = "weather")
    private Weather weather;
//    @XmlElement(name = "lastupdate")
    private Lastupdate lastupdate;
    private Sun sun;

    @XmlElement(name = "city")
    public City getCity() {
        return city;
    }

    @XmlElement(name = "temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @XmlElement(name = "humidity")
    public Humidity getHumidity() {
        return humidity;
    }

    @XmlElement(name = "pressure")
    public Pressure getPressure() {
        return pressure;
    }

    @XmlElement(name = "wind")
    public Wind getWind() {
        return wind;
    }

    @XmlElement(name = "clouds")
    public Clouds getClouds() {
        return clouds;
    }

    @XmlElement(name = "sun")
    public Sun getSun() {
        return sun;
    }

    @XmlElement(name = "visibility")
    public Visibility getVisibility() {
        return visibility;
    }

    @XmlElement(name = "precipitation")
    public Precipitation getPrecipitation() {
        return precipitation;
    }

    @XmlElement(name = "weather")
    public Weather getWeather() {
        return weather;
    }

    @XmlElement(name = "lastupdate")
    public Lastupdate getLastupdate() {
        return lastupdate;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public void setLastupdate(Lastupdate lastupdate) {
        this.lastupdate = lastupdate;
    }

    public void setSun(Sun sun) {
        this.sun = sun;
    }
}
