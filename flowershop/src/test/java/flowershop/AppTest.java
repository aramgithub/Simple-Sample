package flowershop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import org.junit.Test;

import flowershop.OrderController;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void test1() {
		String order = "10 R12,13 T58,15 L09";
		OrderController orderController = new OrderController();
		OutputStream outputStream = new ByteArrayOutputStream();
			
		orderController.processOrder(order, outputStream);
		
		String actual = outputStream.toString();
		String tulipsExpected = "Tulips : 13\n-------------\n1 x 3 $5.95\n2 x 5 $9.95\n0 x 9 $16.99\n-------------\nTotal: $25.85\n\n";
		String liliesExpected = "Lilies : 15\n-------------\n0 x 3 $9.95\n1 x 6 $16.95\n1 x 9 $24.95\n-------------\nTotal: $41.90\n\n";
		String rosesExpected = "Roses : 10\n-------------\n0 x 5 $6.99\n1 x 10 $12.99\n-------------\nTotal: $12.99\n\n";
		assertTrue(actual.contains(tulipsExpected));
		assertTrue(actual.contains(liliesExpected));
		assertTrue(actual.contains(rosesExpected));
	}
	@Test
	public void test2() {
		String order = "13 R12";
		OrderController orderController = new OrderController();
		OutputStream outputStream = new ByteArrayOutputStream();
			
		orderController.processOrder(order, outputStream);
		
		String actual = outputStream.toString();
		assertEquals("Unfortunately your order of [Roses] cannot be provided in bundles!\n\n", actual);	
	}
	
}