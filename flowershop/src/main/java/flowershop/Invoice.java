package flowershop;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.Map;

/**
 * Showes the output to the user
 * @author aram
 *
 */
public class Invoice {
	/**
	 * is used to show one type of flower
	 * @param bundle
	 * @param bundleResolver
	 * @param outputStream
	 */
	void print(Bundle bundle, BundleResolver bundleResolver, OutputStream outputStream){
		double price = 0;
		try{
		  	if (bundleResolver.isSolved() == true){
		  		outputStream.write((bundle.getFlowerName()+ " : " + bundleResolver.getNumberOfItems() + "\n").getBytes());
		  		outputStream.write("-------------\n".getBytes());
				for(int i = 0 ; i < bundle.getItemsInEachBundle().size() ; i++){
					outputStream.write((bundleResolver.getNumberOfEachBundle().get(i).toString() + " x " 
									 + bundle.getItemsInEachBundle().get(i).toString() + " $"
									 + bundle.priceOfEachBundle.get(i).toString() + "\n").getBytes());
					price += 
					Integer.parseInt(bundleResolver.getNumberOfEachBundle().get(i).toString())
					*
					Double.parseDouble(bundle.getPriceOfEachBundle().get(i).toString());
				}
				DecimalFormat df = new DecimalFormat("#.00");		
				outputStream.write(("-------------\nTotal: $" 
						+ df.format(price)+"\n\n").getBytes());
		  	}
			else
				outputStream.write(("Unfortunately your order of [" + bundle.getFlowerName() + "] cannot be provided in bundles!\n\n").getBytes());
	
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	/**
	 * showes the whole invoice according to the customer's order
	 * @param bundleMap
	 * @param outputStream
	 */
	public void print(Map<Bundle, BundleResolver> bundleMap, OutputStream outputStream){
		for(Bundle bundle : bundleMap.keySet()) {
			print(bundle, bundleMap.get(bundle), outputStream);
		}	    
	}
}
