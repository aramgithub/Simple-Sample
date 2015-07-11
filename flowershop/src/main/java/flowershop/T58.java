package flowershop;
import java.util.ArrayList;

/**
 * Tulips Class
 * @author aram
 *
 */

public class T58 extends Bundle {

	@Override
	public void initialise() {
		// TODO Auto-generated method stub
		{
			flowerName = "Tulips";
			itemsInEachBundle = new ArrayList<Integer>();
			itemsInEachBundle.clear();
			itemsInEachBundle.add(0, 3);
			itemsInEachBundle.add(1, 5);
			itemsInEachBundle.add(2, 9);
			
			priceOfEachBundle = new ArrayList<Double>();
			priceOfEachBundle.clear();
			priceOfEachBundle.add(0, 5.95);
			priceOfEachBundle.add(1, 9.95);
			priceOfEachBundle.add(2, 16.99);
						
		}
	}

}
