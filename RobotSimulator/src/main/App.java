package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;


/**
 * 
 * @author Aram Zaerpour <aram.zaerpour@gmail.com>
 * @version 1.0
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to robot simulator application:" );
        System.out.println( "<Type EXIT to quit>\n" );
        controlLoop(System.in, System.out);
        System.out.println("Application terminated.");
    }
    /**
     * 
     * @param inputStream to make the method testable
     * in running mode it is system.in
     * @param outputStream to make the method testable
     * in running mode it is system.out
     */
    public static void controlLoop(InputStream inputStream, OutputStream outputStream){
    	
    	boolean exitReceived = false;
        String userInput;
        BufferedReader input;
        Table table = new Table(5, 5);
        RobotController robotController = new RobotController(table);
       	
        try {
            input = new BufferedReader(new InputStreamReader(inputStream));     	        
       		
            while (exitReceived == false){
        	    outputStream.write(new String("> ").getBytes());
	            userInput = input.readLine().toUpperCase();
				
	            if (userInput.equals("EXIT")){
	                exitReceived = true;                 
	            }
	            else {	            	
	            	outputStream.write(
	            					robotController
	            					.execute(userInput)
	            					.getBytes());
	            }
       		}
       		input.close();
       		
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    	
    }    
}
