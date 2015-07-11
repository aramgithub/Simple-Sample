package flowershop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * the main class of the product
 * @author aram
 *
 */
public class FlowerShop {
	public static void main(String[] args){
		try {
			OrderController orderController = new OrderController();
			System.out.println("Please place your order> ");
			BufferedReader input;
			input = new BufferedReader(new InputStreamReader(System.in));     	        
	   		String order;
			order = input.readLine();
			
			orderController.processOrder(order, System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
