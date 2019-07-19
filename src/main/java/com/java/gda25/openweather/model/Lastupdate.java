package com.java.gda25.openweather.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@XmlRootElement(name = "weather")
public class Lastupdate {

    @XmlAttribute(name = "value")
    private String value;
}
