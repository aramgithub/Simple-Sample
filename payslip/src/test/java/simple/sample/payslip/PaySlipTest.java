package simple.sample.payslip;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaySlipTest {
	PaySlip paySlip = new PaySlip();
	
	@Test
	public void testIsEmptyInputValid(){
		assertFalse(paySlip.validateEmployeeDetails(""));
	}
	@Test
	public void testIsCommaSeparatedValid(){
		assertTrue(paySlip.validateEmployeeDetails("David,Rudd,60050,9%,01 March – 31 March"));
	}
	@Test
	public void testDoAllPartsHaveValue(){
		assertFalse(paySlip.validateEmployeeDetails(",Rudd,60050,,01 March – 31 March"));
	}
}
