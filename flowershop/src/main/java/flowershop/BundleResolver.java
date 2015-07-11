package flowershop;
import java.util.ArrayList;
import java.util.List;

/**
 * Based on a recursive algorithm finds the minimum number of bundles needed
 * to satisfy customer's order
 * @author aram
 *
 */
public class BundleResolver {
	private boolean solved;
	private int numberOfItems;
	
	public int getNumberOfItems() {
		return numberOfItems;
	}

	private List<Integer> itemsInEachBundle;
	private List<Integer> numberOfEachBundle;
	
	/**
	 * Called by controller
	 * @param numberOfItems the number of single items requested by customer
	 * @param bundle object contaning the information of the items in each bundle
	 */
	public void howManyBundles(int numberOfItems, Bundle bundle){
		solved = false;
		this.numberOfItems = numberOfItems;
		itemsInEachBundle = bundle.getItemsInEachBundle();
		
		numberOfEachBundle = new ArrayList<Integer>();
		numberOfEachBundle.clear();
		for(int i = 0 ; i < itemsInEachBundle.size(); i++)
			numberOfEachBundle.add(i, 0);					
	
		determineNumberOfBundles(numberOfItems, itemsInEachBundle.size() - 1);
	}
	/**
	 * 
	 * @param numberOfItems 
	 * @param index current position in bundle info list
	 */
	private void determineNumberOfBundles(int numberOfItems, int index){
		int itemsInBundle = Integer.parseInt(itemsInEachBundle.get(index).toString());
		int max = numberOfItems / itemsInBundle;
		if(index == 0){ 
			if((numberOfItems % itemsInBundle) == 0){
				numberOfEachBundle.set(index, max);
				solved = true;
			}
			return;
		}
		for(int i = max; (i >= 0) && !solved; i--){
			int remainingItems = numberOfItems - (i * itemsInBundle);
			numberOfEachBundle.set(index, i);
			determineNumberOfBundles(remainingItems, index - 1);
		}
		return;
	}
	public boolean isSolved() {
		return solved;
	}
	
	public List<Integer> getNumberOfEachBundle() {
		return numberOfEachBundle;
	}
}
	

