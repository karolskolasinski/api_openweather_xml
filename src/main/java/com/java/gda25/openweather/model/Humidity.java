package com.java.gda25.openweather.model;


import lombok.ToString;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@ToString
@XmlRootElement(name = "humidity")
public class Humidity {
    private String value;
    private String unit;

    @XmlAttribute(name = "value")
    public String getValue() {
        return value;
    }

    @XmlAttribute(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
