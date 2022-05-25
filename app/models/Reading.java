package models;
import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Reading extends Model
{

  public int code;
  public double temperature;
  public double windSpeed;
  public float pressure;
  public float windDirection;



  
  public Reading(int code,double temperature,double windSpeed, float pressure,float windDirection)
  {
    this.code = code;
    this.temperature = temperature;
    this.windSpeed = windSpeed;
    this.pressure = pressure;
    this.windDirection = windDirection;

  }


}
