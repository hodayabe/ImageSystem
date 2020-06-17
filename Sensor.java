import java.lang.invoke.ConstantCallSite;
import java.lang.reflect.Constructor;
 /*This class describes a sensor 
  * attached to each tree in the field 
  * and models its different values */


public class Sensor {
    private double temperature; //טמפרטורה
    private double AmountOfRain; //כמות משקעים
    private double windSpeed; //מהירות הרוח
    private double WindDirection;//כיוון הרוח
    private double NearGroundTemperature;//טמפרטורה סמוכה לארץ
    private double RelativeHumidity;//לחות יחסית
    private double TopGustSpeed;//מהירות משב עליון
    private double AtmosphericPressure;//לחץ אטמוספרי
    private double UpperWindDirection;//כיוון משב עליון
    private double GlobalRadiation;//קרינה גלובלית
    private int indexI; //אינקדס שורה
    private int indexJ; //אינדקס עמודה
    private int number; //מספר סנסור
    
    /*empty constructor*/
    public Sensor()
    {
    	this.temperature=0;
    	this.AmountOfRain=0;
    	this.windSpeed=0;
    	this.WindDirection=0;
    	this.NearGroundTemperature=0;
    	this.RelativeHumidity=0;
    	this.TopGustSpeed=0;
    	this.AtmosphericPressure=0;
    	this.UpperWindDirection=0;
    	this.GlobalRadiation=0;
		this.indexI=0;
		this.indexJ=0;
    }
    
    /*constructor*/
    public Sensor(double temperature,double AmountOfRain,double windSpeed,double WindDirection,double NearGroundTemperature,
    		double RelativeHumidity,double TopGustSpeed,double AtmosphericPressure,double UpperWindDirection,double GlobalRadiation
    		,int indexI,int indexJ,int number)
    {
    	this.temperature=temperature;
    	this.AmountOfRain=AmountOfRain;
    	this.windSpeed=windSpeed;
    	this.WindDirection=WindDirection;
    	this.NearGroundTemperature=NearGroundTemperature;
    	this.RelativeHumidity=RelativeHumidity;
    	this.TopGustSpeed=TopGustSpeed;
    	this.AtmosphericPressure=AtmosphericPressure;
    	this.UpperWindDirection=UpperWindDirection;
    	this.GlobalRadiation=GlobalRadiation;
    	this.indexI=indexI;
    	this.indexJ=indexJ;
    	this.number=number;
    }
    
    /*Getters and Setters*/
	public double getTemperature() 
	{
		return temperature;
	}
	public void setTemperature(int temperature)
	{
		this.temperature = temperature;
	}
	public double getAmountOfRain() 
	{
		return AmountOfRain;
	}
	public void setAmountOfRain(int amountOfRain) 
	{
		AmountOfRain = amountOfRain;
	}
	public double getWindSpeed() 
	{
		return windSpeed;
	}
	public void setWindSpeed(int windSpeed) 
	{
		this.windSpeed = windSpeed;
	}
	public double getWindDirection()
	{
		return WindDirection;
	}
	public void setWindDirection(int windDirection)
	{
		WindDirection = windDirection;
	}
	public double getNearGroundTemperature()
	{
		return NearGroundTemperature;
	}
	public void setNearGroundTemperature(int nearGroundTemperature) 
	{
		NearGroundTemperature = nearGroundTemperature;
	}
	public double getRelativeHumidity()
	{
		return RelativeHumidity;
	}
	public void setRelativeHumidity(int relativeHumidity) 
	{
		RelativeHumidity = relativeHumidity;
	}
	public double getTopGustSpeed()
	{
		return TopGustSpeed;
	}
	public void setTopGustSpeed(int topGustSpeed)
	{
		TopGustSpeed = topGustSpeed;
	}
	public double getAtmosphericPressure()
	{
		return AtmosphericPressure;
	}
	public void setAtmosphericPressure(int atmosphericPressure)
	{
		AtmosphericPressure = atmosphericPressure;
	}
	public double getUpperWindDirection()
	{
		return UpperWindDirection;
	}
	public void setUpperWindDirection(int upperWindDirection)
	{
		UpperWindDirection = upperWindDirection;
	}
	public double getGlobalRadiation() 
	{
		return GlobalRadiation;
	}
	public void setGlobalRadiation(int globalRadiation)
	{
		GlobalRadiation = globalRadiation;
	}

	public int getIndexI() {
		return indexI;
	}

	public void setIndexI(int indexI) {
		this.indexI = indexI;
	}

	public int getIndexJ() {
		return indexJ;
	}

	public void setIndexJ(int indexJ) {
		this.indexJ = indexJ;
	}
	
    public String ToString()
    {
    	String res=this.temperature + "," + this.AmountOfRain + "," + this.windSpeed + "," + this.WindDirection
    			   + "," + this.NearGroundTemperature + "," + this.RelativeHumidity + "," + this.TopGustSpeed
    			   + "," + this.AtmosphericPressure + "," + this.UpperWindDirection + "," + this.GlobalRadiation
    			   + "," + this.indexI + "," + this.indexJ + "," + this.number;
    	return res;
    }
	
}
