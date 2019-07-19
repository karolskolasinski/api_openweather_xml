package com.java.gda25.api_openweather_xml.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "visibility")
public class Visibility {

    @XmlAttribute(name = "value")
    private String value;

}
