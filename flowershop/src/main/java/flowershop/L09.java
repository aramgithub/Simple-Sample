package flowershop;
import java.util.ArrayList;
/**
 * Lilies Class
 * @author aram
 *
 */

public class L09 extends Bundle {

	@Override
	public void initialise() {
		// TODO Auto-generated method stub
		{
			flowerName = "Lilies";
			itemsInEachBundle = new ArrayList<Integer>();
			itemsInEachBundle.clear();
			itemsInEachBundle.add(0, 3);
			itemsInEachBundle.add(1, 6);
			itemsInEachBundle.add(2, 9);
			
			priceOfEachBundle = new ArrayList<Double>();
			priceOfEachBundle.clear();
			priceOfEachBundle.add(0, 9.95);
			priceOfEachBundle.add(1, 16.95);
			priceOfEachBundle.add(2, 24.95);
						
		}
	}

}
