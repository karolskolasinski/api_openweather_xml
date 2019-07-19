package com.java.gda25.api_openweather_xml.model;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@ToString
@XmlRootElement(name = "clouds")
public class Clouds {
    private Double value;
    private String name;

    @XmlAttribute(name = "value")
    public Double getValue() {
        return value;
    }

    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }
}
