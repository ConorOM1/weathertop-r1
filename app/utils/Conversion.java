package utils;

import models.Reading;

import java.util.List;

import static java.lang.Math.pow;


public class Conversion {
    public static String getBeaufortConversion(List<Reading> readings) {

        String beaufortConversion = null;
        if (readings.size() > 0) {
            for (Reading reading : readings) {
                if (reading.windSpeed < 1) {
                    beaufortConversion = "0";
                    System.out.println("Beaufort Conversion: " + beaufortConversion);
                } else if ((reading.windSpeed >= 1) && (reading.windSpeed < 5)) {
                    beaufortConversion = "1";
                    System.out.println("Beaufort Conversion: " + beaufortConversion);
                } else if ((reading.windSpeed >= 6) && (reading.windSpeed < 11)) {
                    beaufortConversion = "3";
                    System.out.println("Beaufort Conversion: " + beaufortConversion);
                } else if ((reading.windSpeed >= 12) && (reading.windSpeed < 19)) {
                    beaufortConversion = "4";
                    System.out.println("Beaufort Conversion: " + beaufortConversion);
                } else if ((reading.windSpeed >= 20) && (reading.windSpeed < 28)) {
                    beaufortConversion = "5";
                    System.out.println("Beaufort Conversion: " + beaufortConversion);
                } else if ((reading.windSpeed >= 29) && (reading.windSpeed < 38)) {
                    beaufortConversion = "6";
                    System.out.println("Beaufort Conversion: " + beaufortConversion);
                } else if ((reading.windSpeed >= 39) && (reading.windSpeed < 49)) {
                    beaufortConversion = "7";
                    System.out.println("Beaufort Conversion: " + beaufortConversion);
                } else if ((reading.windSpeed >= 50) && (reading.windSpeed < 61)) {
                    beaufortConversion = "8";
                    System.out.println("Beaufort Conversion: " + beaufortConversion);
                } else if ((reading.windSpeed >= 62) && (reading.windSpeed < 74)) {
                    beaufortConversion = "9";
                    System.out.println("Beaufort Conversion: " + beaufortConversion);
                } else if ((reading.windSpeed >= 75) && (reading.windSpeed < 88)) {
                    beaufortConversion = "10";
                    System.out.println("Beaufort Conversion: " + beaufortConversion);
                } else if ((reading.windSpeed >= 89) && (reading.windSpeed < 102)) {
                    beaufortConversion = "11";
                    System.out.println("Beaufort Conversion: " + beaufortConversion);
                } else if ((reading.windSpeed >= 103) && (reading.windSpeed < 117)) {
                    beaufortConversion = "12";
                    System.out.println("Beaufort Conversion: " + beaufortConversion);
                } else {
                    System.out.println("Invalid Beaufort reading");
                }
            }
        }
        return beaufortConversion;
    }

    public static String getWeatherCodes(List<Reading> readings) {
        String weatherCodes = null;
        if (readings.size() > 0) {
            for (Reading reading : readings) {
                if (reading.code == 100) {
                    weatherCodes = "Clear";
                    System.out.println("Weather Code: " + weatherCodes);
                } else if (reading.code == 200) {
                    weatherCodes = "Partial Clouds";
                    System.out.println("Weather Code: " + weatherCodes);
                } else if (reading.code == 300) {
                    weatherCodes = "Cloudy";
                    System.out.println("Weather Code: " + weatherCodes);
                } else if (reading.code == 400) {
                    weatherCodes = "Light Showers";
                    System.out.println("Weather Code: " + weatherCodes);
                } else if (reading.code == 500) {
                    weatherCodes = "Heavy Showers";
                    System.out.println("Weather Code: " + weatherCodes);
                } else if (reading.code == 600) {
                    weatherCodes = "Rain";
                    System.out.println("Weather Code: " + weatherCodes);
                } else if (reading.code == 700) {
                    weatherCodes = "Snow";
                    System.out.println("Weather Code: " + weatherCodes);
                } else if (reading.code == 800) {
                    weatherCodes = "Thunder";
                    System.out.println("Weather Code: " + weatherCodes);
                } else {
                    System.out.println("Invalid Weather Code");
                }
            }
        }
        return weatherCodes;
    }

    public static double tempF(double tempC) {
        double tempF;
        tempF = (tempC * 1.8) + 32;
        return tempF;
    }

    public static String getWindDirection(List<Reading> readings) {
        String windCompass = null;
        if (readings.size() > 0) {
            for (Reading reading : readings) {
                if ((reading.windDirection > 0) && (reading.windDirection <= 11.25)) {
                    windCompass = "North";
                    System.out.println("Wind Direction: " + windCompass);
                } else if ((reading.windDirection >= 11.26) && (reading.windDirection <= 33.75)) {
                    windCompass = "North North East";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 33.76) && (reading.windDirection <= 56.25)) {
                    windCompass = "North East";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 56.26) && (reading.windDirection <= 78.75)) {
                    windCompass = "East North East";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 78.76) && (reading.windDirection <= 101.25)) {
                    windCompass = "East";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 101.26) && (reading.windDirection <= 123.75)) {
                    windCompass = "East South East";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 123.76) && (reading.windDirection <= 146.25)) {
                    windCompass = "South East";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 146.26) && (reading.windDirection <= 168.75)) {
                    windCompass = "South South East";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 168.76) && (reading.windDirection <= 191.25)) {
                    windCompass = "South";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 191.26) && (reading.windDirection <= 213.75)) {
                    windCompass = "South South West";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 213.76) && (reading.windDirection <= 236.25)) {
                    windCompass = "South West";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 236.26) && (reading.windDirection <= 258.75)) {
                    windCompass = "West South West";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 258.76) && (reading.windDirection <= 281.25)) {
                    windCompass = "West";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 281.26) && (reading.windDirection <= 303.75)) {
                    windCompass = "West North West";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 303.76) && (reading.windDirection <= 326.25)) {
                    windCompass = "North West";
                    System.out.println("Weather Code: " + windCompass);
                } else if ((reading.windDirection >= 326.26) && (reading.windDirection <= 348.75)) {
                    windCompass = "North North West";
                    System.out.println("Weather Code: " + windCompass);
                } else {
                    System.out.println("Invalid windDirection");
                }
            }
        }
        return windCompass;
    }

    public static double getWindChill(List<Reading> readings) {
        double windChill = 0;
        if (readings.size() > 0) {
            Reading reading = readings.get(readings.size() - 1);
            windChill = 13.12 + 0.6215 * reading.temperature - 11.37 * pow(reading.windSpeed, 0.16) + 0.3965 * reading.temperature * (pow(reading.windSpeed, 0.16));
            windChill = Math.round(windChill * 100) / 100;
            System.out.println("WindChill: " + windChill);
        }
        return windChill;
    }
}




