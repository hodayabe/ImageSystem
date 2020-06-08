import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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

 InitializationSensor is=new InitializationSensor();
 is.getMatrix();
  
 String hostName = args[0];
 int portNumber = Integer.parseInt(args[1]);
 
 
 
 

/*public class GreetServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
 
    public void start(int port) {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String greeting = in.readLine();
            if ("hello server".equals(greeting)) {
                out.println("hello client");
            }
            else {
                out.println("unrecognised greeting");
            }
    }
 
    public void stop() {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
    public static void main(String[] args) {
        GreetServer server=new GreetServer();
        server.start(6666);
    }
}
*/


 
    String msg;  
 try {
     Socket echoSocket = new Socket(hostName, portNumber);
     PrintWriter out =
         new PrintWriter(echoSocket.getOutputStream(), true);
     BufferedReader in =
         new BufferedReader(
             new InputStreamReader(echoSocket.getInputStream()));
     /*BufferedReader stdIn =
         new BufferedReader(
             new InputStreamReader(System.in))*/
     
     //out.println(msg);
     String resp = in.readLine();
     
 }
 catch(Exception e)
 {
	 System.out.println("Error---Socket Faild");
 }
 


 
	}

}
