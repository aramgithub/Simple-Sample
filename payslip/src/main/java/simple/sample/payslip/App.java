package simple.sample.payslip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{
    public static void main( String[] args )
    {
        try{
	    	System.out.println( "Pay Slip Generator" );
	        System.out.println( "Enter the input info >");
	        BufferedReader input;
			input = new BufferedReader(new InputStreamReader(System.in));     	        
	   		String inputData = input.readLine();
	   		PaySlip paySlip = new PaySlip();
	   		System.out.println(paySlip.issuePaySlip(inputData));
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
