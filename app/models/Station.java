package models;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Station extends Model {
    public String name;

    @OneToMany(cascade = CascadeType.ALL)
    public List<Reading> readings = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    public List<Station> stations = new ArrayList<>();

    public String beaufortConversion;
    public String weatherCodes;
    public double tempC;
    public double tempF;
    public double pressure;
    public double windChill;
    public String windCompass;


    public Station(String name) {

        this.name = name;
    }


}