package com.java.gda25.openweather.model;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@ToString
@XmlRootElement(name = "coord")
public class Coord {
    private String lon;
    private String lat;

    @XmlAttribute(name = "lon")
    public String getLon() {
        return lon;
    }

    @XmlAttribute(name = "lat")
    public String getLat() {
        return lat;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
}
