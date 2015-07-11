package flowershop;

/**
 * A factory to return the suitable object of each specified type of flower
 * @author aram
 *
 */
public class BundleFactory {
	
	public Bundle getBundle(String flowerCode){
		if (flowerCode.equalsIgnoreCase("T58")){
			return new T58();
		}else if (flowerCode.equalsIgnoreCase("L09")){
			return new L09();
		}else if (flowerCode.equalsIgnoreCase("R12")){
			return new R12();
		}else
			return null;		
	}
}
