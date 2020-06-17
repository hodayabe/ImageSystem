import java.util.Random;
import java.util.Scanner;

public class InitializationSensor {
	
	Scanner s=new Scanner(System.in);
	Random rn = new Random();
	
	Sensor [][] sensors=new Sensor[25][40];
	int counter=0;
	
	double minTemperature=-5.0;
	double maxTemperature=18.3;
	double SDTemperature=7.0;

	double minAmountOfRain=0;
	double maxAmountOfRain=3.5;
	double SDAmountOfRain=2;

	double minWindSpeed=0;
	double maxWindSpeed=4.6;
	double SDWindSpeed=2;

	double minWindDirection=60;
	double maxWindDirection=340;
	double SDWindDirection=19;

	double minNearGroundTemperature=5.5;
	double maxNearGroundTemperature=24.1;
	double SDNearGroundTemperature=6;

	double minRelativeHumidity=80.5;
	double maxRelativeHumidity=100;
	double SDRelativeHumidity=10.8;

	double minTopGustSpeed=0.1;
	double maxTopGustSpeed=10;
	double SDTopGustSpeed=2;

	/*if boolean*/	double minAtmosphericPressure=0;
	double maxAtmosphericPressure=140.3;
	double SDAtmosphericPressure=32;

	double minUpperWindDirection=80;
	double maxUpperWindDirection=340;
	double SDUpperWindDirection=19.5;

	/*if boolean*/	double minGlobalRadiation=0;
	double maxGlobalRadiation=140.5;
	double SDGlobalRadiation=33;
	
	public InitializationSensor()
	{
		System.out.println("Enter temperature threshold indices:(C°)");
		System.out.println("Whold you like to use the default values?");
		System.out.println("(Press V(=yes) or X(=no))");
		char ch = s.next().charAt(0);
		if(ch=='X' || ch=='x')
		{
			System.out.print("minimum: ");
			minTemperature=s.nextInt();
			System.out.print("maxsimum: ");
			maxTemperature=s.nextInt();
			System.out.print("SD: ");
			SDTemperature=s.nextInt();
			System.out.println();
		}
		else
		{
			System.out.println("The defult values saved in the system");
			System.out.println();
		}



		System.out.println("Enter amount of rain threshold indices:(mm)");
		System.out.println("Whold you like to use the default values?");
		System.out.println("(Press V(=yes) or X(=no))");
		ch = s.next().charAt(0);
		if(ch=='X' || ch=='x')
		{
			System.out.print("minimum: ");
			minAmountOfRain=s.nextInt();
			System.out.print("maxsimum: ");
			maxAmountOfRain=s.nextInt();
			System.out.print("SD: ");
			SDAmountOfRain=s.nextInt();
			System.out.println();
		}
		else
		{
			System.out.println("The defult values saved in the system");
			System.out.println();
		}

		System.out.println("Enter wind-speed threshold indices:(m/s)");
		System.out.println("Whold you like to use the default values?");
		System.out.println("(Press V(=yes) or X(=no))");
		ch = s.next().charAt(0);
		if(ch=='X' || ch=='x')
		{
		
		System.out.print("minimum: ");
		minWindSpeed=s.nextInt();
		System.out.print("maxsimum: ");
		maxWindSpeed=s.nextInt();
		System.out.print("SD: ");
		SDWindSpeed=s.nextInt();
		System.out.println();
	   }
		else
		{
			System.out.println("The defult values saved in the system");
			System.out.println();
		}

		System.out.println("Enter wind direction threshold indices:(deg)");
		System.out.println("Whold you like to use the default values?");
		System.out.println("(Press V(=yes) or X(=no))");
		ch = s.next().charAt(0);
		if(ch=='X' || ch=='x')
		{
		System.out.print("minimum: ");
		minWindDirection=s.nextInt();
		System.out.print("maxsimum: ");
		maxWindDirection=s.nextInt();
		System.out.print("SD: ");
		SDWindDirection=s.nextInt();
		System.out.println();
		}
		else
		{
			System.out.println("The defult values saved in the system");
			System.out.println();
		}

		System.out.println("Enter near-ground temperature threshold indices:(C°)");
		System.out.println("Whold you like to use the default values?");
		System.out.println("(Press V(=yes) or X(=no))");
		ch = s.next().charAt(0);
		if(ch=='X' || ch=='x')
		{
		System.out.print("minimum: ");
		minNearGroundTemperature=s.nextInt();
		System.out.print("maxsimum: ");
		maxNearGroundTemperature=s.nextInt();
		System.out.print("SD: ");
		SDNearGroundTemperature=s.nextInt();
		System.out.println();
		}
		else
		{
			System.out.println("The defult values saved in the system");
			System.out.println();
		}

		System.out.println("Enter relative humidity threshold indices:(%)");
		System.out.println("Whold you like to use the default values?");
		System.out.println("(Press V(=yes) or X(=no))");
		ch = s.next().charAt(0);
		if(ch=='X' || ch=='x')
		{
		System.out.print("minimum: ");
		minRelativeHumidity=s.nextInt();
		System.out.print("maxsimum: ");
		maxRelativeHumidity=s.nextInt();
		System.out.print("SD: ");
		SDRelativeHumidity=s.nextInt();
		System.out.println();
		}
		else
		{
			System.out.println("The defult values saved in the system");
			System.out.println();
		}

		System.out.println("Enter top-gust-speed threshold indices:(m/s)");
		System.out.println("Whold you like to use the default values?");
		System.out.println("(Press V(=yes) or X(=no))");
		ch = s.next().charAt(0);
		if(ch=='X' || ch=='x')
		{
		System.out.print("minimum: ");
		minTopGustSpeed=s.nextInt();
		System.out.print("maxsimum: ");
		maxTopGustSpeed=s.nextInt();
		System.out.print("SD: ");
		SDTopGustSpeed=s.nextInt();
		System.out.println();
		}
		else
		{
			System.out.println("The defult values saved in the system");
			System.out.println();
		}

		System.out.println("Enter atmospheric Pressure threshold indices:(hPa)");
		System.out.println("Whold you like to use the default values?");
		System.out.println("(Press V(=yes) or X(=no))");
		ch = s.next().charAt(0);
		if(ch=='X' || ch=='x')
		{
		System.out.print("minimum: ");
		minAtmosphericPressure=s.nextInt();
		System.out.print("maxsimum: ");
		maxAtmosphericPressure=s.nextInt();
		System.out.print("SD: ");
		SDAtmosphericPressure=s.nextInt();
		System.out.println();
		}
		else
		{
			System.out.println("The defult values saved in the system");
			System.out.println();
		}

		System.out.println("Enter upper wind direction threshold indices:(deg)");
		System.out.println("Whold you like to use the default values?");
		System.out.println("(Press V(=yes) or X(=no))");
		ch = s.next().charAt(0);
		if(ch=='X' || ch=='x')
		{
		System.out.print("minimum: ");
		minUpperWindDirection=s.nextInt();
		System.out.print("maxsimum: ");
		maxUpperWindDirection=s.nextInt();
		System.out.print("SD: ");
		SDUpperWindDirection=s.nextInt();
		System.out.println();
		}
		else
		{
			System.out.println("The defult values saved in the system");
			System.out.println();
		}

		System.out.println("Enter global radiation threshold indices:(W/m^2)");
		System.out.println("Whold you like to use the default values?");
		System.out.println("(Press V(=yes) or X(=no))");
		ch = s.next().charAt(0);
		if(ch=='X' || ch=='x')
		{
		System.out.print("minimum: ");
		minGlobalRadiation=s.nextInt();
		System.out.print("maxsimum: ");
		maxGlobalRadiation=s.nextInt();
		System.out.print("SD: ");
		SDGlobalRadiation=s.nextInt();
		System.out.println();
		}
		else
		{
			System.out.println("The defult values saved in the system");
			System.out.println();
		}
     
		for(int i=0;i<sensors.length;i++)
		{
			for(int j=0;j<sensors[i].length;j++)
			{	
			double rand_temperature =minTemperature + (maxTemperature-minTemperature) *rn.nextDouble() ;
			double rand_amountOfRain = minAmountOfRain + (maxAmountOfRain-minAmountOfRain) *rn.nextDouble();
			double rand_windSpeed = minWindSpeed + (maxWindSpeed-minWindSpeed) *rn.nextDouble();
			double rand_windDirection= minWindDirection + (maxWindDirection-minWindDirection)*rn.nextDouble();
			double rand_nearGroundTemperature = minNearGroundTemperature+ (maxNearGroundTemperature-minNearGroundTemperature) *rn.nextDouble();
			double rand_relativeHumidity = minRelativeHumidity+(maxRelativeHumidity-minRelativeHumidity) *rn.nextDouble();
			double rand_topGustSpeed = minRelativeHumidity+(maxTopGustSpeed-minTopGustSpeed) *rn.nextDouble();
			double rand_atmosphericPressure = minAtmosphericPressure +(maxAtmosphericPressure-minAtmosphericPressure) *rn.nextDouble();
			double rand_upperWindDirection = minUpperWindDirection+(maxUpperWindDirection-minUpperWindDirection) *rn.nextDouble();
			double rand_globalRadiation = minGlobalRadiation +(maxGlobalRadiation-minGlobalRadiation) *rn.nextDouble();
   
			sensors[i][j] =new Sensor(rand_temperature,rand_amountOfRain,rand_windSpeed,rand_windDirection,rand_nearGroundTemperature,
					rand_relativeHumidity,rand_topGustSpeed,rand_atmosphericPressure,rand_upperWindDirection,rand_globalRadiation,i,j,counter);
			counter++;
			}
		}
	}
	public Sensor[][] getMatrix()
	{
		return sensors;
	}
	public String ToString()
	{
		String res= this.minTemperature + "," + this.maxTemperature + "," + this.minAmountOfRain + ","
				  +this.maxAmountOfRain + "," + this.minWindSpeed + "," + this.maxWindSpeed + ","
				  + this.minWindDirection + "," + this.maxWindDirection + "," + this.minNearGroundTemperature
				  + "," + this.maxNearGroundTemperature + "," + this.minRelativeHumidity + "," + this.maxRelativeHumidity
				  +","+ this.minTopGustSpeed + "," + this.maxTopGustSpeed + ","+ this.minAtmosphericPressure +","
				  + this.maxAtmosphericPressure + ","+this.minUpperWindDirection + "," + this.maxUpperWindDirection
				  +","+this.minGlobalRadiation +","+this.maxGlobalRadiation;
		return res;
	}
	

}
