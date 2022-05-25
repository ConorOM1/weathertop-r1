package controllers;

import java.util.List;

import models.Station;

import play.Logger;
import play.mvc.Controller;


public class Dashboard extends Controller {
    public static void index() {
        Logger.info("Rendering Dashboard");


        List<Station> stations = Station.findAll();


        render("dashboard.html", stations);
    }

    public static void addStation(String name) {
        Station station = new Station(name);
        Logger.info("Adding a new station called " + name);
        station.save();
        redirect("/dashboard");
    }

    public static void deleteStation(long id) {
        Logger.info("Deleting a station" + id);

        Station station = Station.findById(id);
        station.stations.remove(station);
        station.save();
        station.delete();
        redirect("/dashboard");
    }

}