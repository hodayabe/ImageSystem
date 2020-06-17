import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
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
 Sensor [][] sen = new Sensor[25][40];
 InitializationSensor is=new InitializationSensor();
 sen=is.getMatrix();
  
 String hostName = args[0];
 int portNumber = Integer.parseInt(args[1]);
 
 

	    try{
	        ServerSocket clientSocket = new ServerSocket(portNumber);
	        Socket socket = clientSocket.accept();
	        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
	        printWriter.write("Hello user!\n");
	        printWriter.write(is.ToString());
	        printWriter.flush();
	        printWriter.close();
	        socket.close();
	        clientSocket.close();
	    }catch(IOException e){}
	


//
//	     System.out.println("Server waiting for client 1");
//	     Socket client1 = accept();
	     PrintWriter writer = new PrintWriter(client1.getOutputStream(), true);
	     writer.write("Hello user 1");

	     System.out.println("Server waiting for client 2");
	     Socket client2 = accept();
	     PrintWriter writer2 = new PrintWriter(client2.getOutputStream(), true);
	     writer2.write("Hello user 2");

	     System.out.println("Clients connected");


}
