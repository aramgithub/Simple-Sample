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
	public void testCalculateTax12000(){
		assertEquals(0, paySlip.calculateTax(12000));
	}
	
	@Test
	public void testCalculateTax30000(){
		assertEquals(187, paySlip.calculateTax(30000));
	}
	
	@Test
	public void testCalculateTax60050(){
		assertEquals(922, paySlip.calculateTax(60050));
	}
	@Test
	public void testCalculateTax120000(){
		assertEquals(2696, paySlip.calculateTax(120000));
	}
	@Test
	public void testCalculateTax200000(){
		assertEquals(5296, paySlip.calculateTax(200000));
	}
}


