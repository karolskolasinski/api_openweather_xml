package com.java.gda25.api_openweather_xml.model;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@ToString
@XmlRootElement(name = "temperature")
public class Temperature {
    private String id;
    private String min;
    private String max;
    private String unit;

    @XmlAttribute(name = "value")
    public String getId() {
        return id;
    }

    @XmlAttribute(name = "min")
    public String getMin() {
        return min;
    }

    @XmlAttribute(name = "max")
    public String getMax() {
        return max;
    }

    @XmlAttribute(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
