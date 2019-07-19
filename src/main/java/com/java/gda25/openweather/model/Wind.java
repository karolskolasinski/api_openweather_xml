package com.java.gda25.openweather.model;


import lombok.ToString;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@ToString
@XmlRootElement(name = "wind")
public class Wind {
    private Speed speed;
    private Direction direction;

    @XmlElement(name = "speed")
    public Speed getSpeed() {
        return speed;
    }

    @XmlElement(name = "direction")
    public Direction getDirection() {
        return direction;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
