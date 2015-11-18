package simple.sample.payslip;

public class PaySlip {
	public boolean validateEmployeeDetails(String input){
		String[] details = input.split(",");
		if (details.length != 5)
			return false;
		boolean nonEmpty = true;
		for (int i = 0 ; (i < 5) && (nonEmpty == true) ; i ++) {
			if (details[i].length() == 0){
				nonEmpty = false;
			}
		}
		return nonEmpty;			
	}
}
