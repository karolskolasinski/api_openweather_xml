package com.java.gda25.api_openweather_xml.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "weather")
public class Lastupdate {

    @XmlAttribute(name = "value")
    private String value;
}
