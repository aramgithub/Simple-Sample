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
	@Test
	public void testIsSalaryValid(){
		assertFalse(paySlip.validateEmployeeDetails("David,Rudd,-60050,9%,01 March – 31 March"));
	}
	
	@Test
	public void testIsSuperRateValid(){
		assertFalse(paySlip.validateEmployeeDetails("David,Rudd,60050,9,01 March – 31 March"));
	}
	@Test
	public void testIsSuperRateInRange(){
		assertFalse(paySlip.validateEmployeeDetails("David,Rudd,60050,65%,01 March – 31 March"));
	}
	
	@Test
	public void testGrossIncome(){
		assertEquals(5004, paySlip.grossIncome(60050));
	}
	
	@Test
	public void testCalculateTax(){
		assertEquals(5004, paySlip.calculateTax(60050));
	}
}
