package flowershop;
import java.util.ArrayList;
/**
 * Roses Class
 * @author aram
 *
 */

public class R12 extends Bundle {

	@Override
	public void initialise() {
		// TODO Auto-generated method stub
		{
			flowerName = "Roses";
			itemsInEachBundle = new ArrayList<Integer>();
			itemsInEachBundle.clear();
			itemsInEachBundle.add(0, 5);
			itemsInEachBundle.add(1, 10);
			
			priceOfEachBundle = new ArrayList<Double>();
			priceOfEachBundle.clear();
			priceOfEachBundle.add(0, 6.99);
			priceOfEachBundle.add(1, 12.99);
						
		}
	}

}
