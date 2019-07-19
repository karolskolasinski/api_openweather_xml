package com.java.gda25.openweather.model;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@ToString
@XmlRootElement(name = "city")
public class City {
    private String id;
    private String name;
    private Coord coord;
    private String country;
    private Sun sun;

    @XmlAttribute(name = "id")
    public String getId() {
        return id;
    }

    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "coord")
    public Coord getCoord() {
        return coord;
    }

    @XmlElement(name = "country")
    public String getCountry() {
        return country;
    }

    @XmlElement(name = "sun")
    public Sun getSun() {
        return sun;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSun(Sun sun) {
        this.sun = sun;
    }
}
