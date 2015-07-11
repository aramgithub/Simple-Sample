package flowershop;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Controls the process of determining the minimum number of necessary bundles
 * @author aram
 *
 */
public class OrderController {
	/**
	 * 
	 * @param order the complete string requested by a customer
	 * @param outputStream the output is written in this parameter
	 */
	public void processOrder(String order, OutputStream outputStream){
		Map <Bundle,BundleResolver> bundleMap = new HashMap<Bundle, BundleResolver>();
		int numberOfItems = 0;
		Bundle bundle = null;
		String[] eachFlowerOrder = order.split(",");
		for (String thisOrder : eachFlowerOrder){
			BundleFactory bundleFactory = new BundleFactory();
			String[] orderDetails = thisOrder.split(" ");
			if (orderDetails.length == 2){
				bundle = bundleFactory.getBundle(thisOrder.split(" ")[1]);
				if (bundle == null)
					continue;
				try{
				numberOfItems = 
					Integer.parseInt(thisOrder.split(" ")[0]);
				}catch(NumberFormatException e){
	            	e.printStackTrace();
					continue;
				}
			}
			else{
				continue;
			}
		  	bundle.initialise();
			
		  	BundleResolver bundleResolver = new BundleResolver();
			bundleResolver.howManyBundles(numberOfItems, bundle);
			
			bundleMap.put(bundle, bundleResolver);
		}
		Invoice invoice = new Invoice();
		invoice.print(bundleMap, outputStream);

	}
}
