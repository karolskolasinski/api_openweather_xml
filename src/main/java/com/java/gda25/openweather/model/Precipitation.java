package com.java.gda25.openweather.model;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@ToString
@XmlRootElement(name = "visibility")
public class Precipitation {
    private String mode;

    @XmlAttribute(name = "mode")
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
