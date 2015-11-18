package simple.sample.payslip;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaySlipTest {
	PaySlip paySlip = new PaySlip();
	
	@Test
	public void testIsInputValid(){
		assertFalse(paySlip.isInputValid(""));
	}
}
