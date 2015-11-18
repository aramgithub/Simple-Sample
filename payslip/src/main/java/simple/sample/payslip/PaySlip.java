package simple.sample.payslip;

public class PaySlip {
	public boolean validateEmployeeDetails(String input){
		String[] details = input.split(",");
		return (details.length == 5);
	}
}
