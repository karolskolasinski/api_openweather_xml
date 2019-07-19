package com.java.gda25.api_openweather_xml.model;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@ToString
@XmlRootElement(name = "pressure")
public class Direction {
    private String value;
    private String code;
    private String name;

    @XmlAttribute(name = "value")
    public String getValue() {
        return value;
    }

    @XmlAttribute(name = "code")
    public String getCode() {
        return code;
    }

    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }
}
