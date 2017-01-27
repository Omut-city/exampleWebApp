package com.omut.exampleWebApp.dao;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringWriter;

@XmlRootElement
public class Airplane {
    //@XmlAttribute
    private int id;
    //@XmlAttribute
    private String type;
    //@XmlAttribute
    private String manufacturer;
    //@XmlAttribute
    private int number_engines;
    //@XmlAttribute
    private int range_distance;
    //@XmlAttribute
    private int cruise_speed;
    //@XmlAttribute
    private int passenger_capacity;

    public Airplane() {
    }

    public Airplane(
            int id,
            String type,
            String manufacturer,
            int number_engines,
            int range_distance,
            int cruise_speed,
            int passenger_capacity) {
        this.id = id;
        this.type = type;
        this.manufacturer = manufacturer;
        this.number_engines = number_engines;
        this.range_distance = range_distance;
        this.cruise_speed = cruise_speed;
        this.passenger_capacity = passenger_capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumber_engines() {
        return number_engines;
    }

    public void setNumber_engines(int number_engines) {
        this.number_engines = number_engines;
    }

    public int getRange_distance() {
        return range_distance;
    }

    public void setRange_distance(int range_distance) {
        this.range_distance = range_distance;
    }

    public int getCruise_speed() {
        return cruise_speed;
    }

    public void setCruise_speed(int cruise_speed) {
        this.cruise_speed = cruise_speed;
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    public void setPassenger_capacity(int passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }

    public String toXML () {
        StringWriter writer = new StringWriter();
        try {
            JAXBContext context = JAXBContext.newInstance(Airplane.class);
            Marshaller m =  context.createMarshaller();
            m.marshal(this, writer);
            System.out.println(writer.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return writer.toString();
    }
}
