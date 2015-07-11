package flowershop;
import java.util.List;

/**
 * Abstract class to keep the necessary information about each flower 
 * @author aram
 *
 */

public abstract class Bundle {
	protected String flowerName;
	protected List<Double> priceOfEachBundle;
	protected List<Integer> itemsInEachBundle;
	
	public List<Double> getPriceOfEachBundle() {
		return priceOfEachBundle;
	}

	public List<Integer> getItemsInEachBundle() {
		return itemsInEachBundle;
	}
/**
 * must be called after instantiating the class
 */
	public abstract void initialise();
	
	public String getFlowerName(){
		return flowerName;
	}	
}
