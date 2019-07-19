package com.java.gda25.openweather.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "weather")
public class Weather {

    @XmlAttribute(name = "number")
    private String number;

    @XmlAttribute(name = "value")
    private String value;

    @XmlAttribute(name = "icon")
    private String icon;
}
