package controllers;


import models.Station;
import models.Reading;
import play.Logger;
import play.mvc.Controller;
import utils.Conversion;

public class StationCtrl extends Controller {
    public static void index(Long id) {
        Station station = Station.findById(id);
        Logger.info("Station id = " + id);
        if (station.readings.size() > 0) {
            Reading lastReading = station.readings.get(station.readings.size() - 1);
            station.tempC = lastReading.temperature;
            station.tempF = Conversion.tempF(lastReading.temperature);
            station.pressure = lastReading.pressure;
            station.windCompass = Conversion.getWindDirection(station.readings);
            station.windChill = Conversion.getWindChill(station.readings);
            station.beaufortConversion = Conversion.getBeaufortConversion(station.readings);
            station.weatherCodes = Conversion.getWeatherCodes(station.readings);
        }
        render("station.html", station);
    }

    public static void deleteReading(Long id, Long readingid) {
        Station station = Station.findById(id);
        Reading reading = Reading.findById(readingid);
        Logger.info("Removing " + reading.code);
        station.readings.remove(reading);
        station.save();
        reading.delete();

        render("station.html", station);
    }

    public static void addReading(Long id, int code, double temperature, double windSpeed, float pressure, float windDirection) {
        Station station = Station.findById(id);
        Reading newReading = new Reading(code, temperature, windSpeed, pressure, windDirection);
        station.readings.add(newReading);
        station.save();
        redirect("/stations/" + id);
    }
}
