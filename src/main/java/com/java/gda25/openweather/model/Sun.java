package com.java.gda25.openweather.model;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@ToString
@XmlRootElement(name = "sun")
public class Sun {
    private String rise;
    private String set;

    @XmlAttribute(name = "rise")
    public String getRise() {
        return rise;
    }

    @XmlAttribute(name = "set")
    public String getSet() {
        return set;
    }

    public void setRise(String rise) {
        this.rise = rise;
    }

    public void setSet(String set) {
        this.set = set;
    }
}
