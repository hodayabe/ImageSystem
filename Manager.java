import java.io.Console;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/*threads num=num of sensors
 * github
 * thread i,j
 * connect with group 2
 * how to deliver the data-tell that its sensor object VETITMODEDU NEKUDA.
 * simulate like real field,send random sensors, not by order
 * 
 * next level=next week:
 * thread to any sesnor
 * every sensor send his details
 * random sensors send
 * */

public class Manager {
	/*SD=Standard Deviation*/
	public static void main(String[] args) 
	{

//		/*Simulation - IOT*/
//		/*Simulating sensor by plotting random values 
//		 between the minimum and maximum values*/
//       
//		Sensor [][] sensors=new Sensor[25][40]; 
//		for(int i=0;i<sensors.length;i++)
//		{
//			for(int j=0;j<sensors[i].length;j++)
//			{	
//			double rand_temperature =minTemperature + (maxTemperature-minTemperature) *rn.nextDouble() ;
//			double rand_amountOfRain = minAmountOfRain + (maxAmountOfRain-minAmountOfRain) *rn.nextDouble();
//			double rand_windSpeed = minWindSpeed + (maxWindSpeed-minWindSpeed) *rn.nextDouble();
//			double rand_windDirection= minWindDirection + (maxWindDirection-minWindDirection)*rn.nextDouble();
//			double rand_nearGroundTemperature = minNearGroundTemperature+ (maxNearGroundTemperature-minNearGroundTemperature) *rn.nextDouble();
//			double rand_relativeHumidity = minRelativeHumidity+(maxRelativeHumidity-minRelativeHumidity) *rn.nextDouble();
//			double rand_topGustSpeed = minRelativeHumidity+(maxTopGustSpeed-minTopGustSpeed) *rn.nextDouble();
//			double rand_atmosphericPressure = minAtmosphericPressure +(maxAtmosphericPressure-minAtmosphericPressure) *rn.nextDouble();
//			double rand_upperWindDirection = minUpperWindDirection+(maxUpperWindDirection-minUpperWindDirection) *rn.nextDouble();
//			double rand_globalRadiation = minGlobalRadiation +(maxGlobalRadiation-minGlobalRadiation) *rn.nextDouble();
//   
//			sensors[i][j] =new Sensor(rand_temperature,rand_amountOfRain,rand_windSpeed,rand_windDirection,rand_nearGroundTemperature,
//					rand_relativeHumidity,rand_topGustSpeed,rand_atmosphericPressure,rand_upperWindDirection,rand_globalRadiation);
//			}
//		}
 InitializationSensor is=new InitializationSensor();
 is.getMatrix();
	}

}
