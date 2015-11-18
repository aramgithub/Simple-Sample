package simple.sample.payslip;

public class PaySlip {
	
	private String fullname;
	private int salary;
	private int superRate;
	private String paymentStartDate;
	public boolean validateEmployeeDetails(String input){
		String[] details = input.split(",");
		if (details.length != 5)
			return false;
		boolean nonEmpty = true;
		for (int i = 0 ; (i < 5) && nonEmpty ; i ++) {
			if (details[i].isEmpty()){
				nonEmpty = false;
			}
		}
		if (nonEmpty == false){
			return nonEmpty;		
		}
		fullname = details[0] + " " + details[1];
		paymentStartDate = details[4];
		if (details[2].matches("[0-9]+")){
			salary = Integer.parseInt(details[2]);
		}
		else{
			return false;
		}
		int len = details[3].length();
		if ( len < 2){
			return false;
		}
		String superStr = details[3].substring(0, len - 1);
		if ((details[3].charAt(len - 1) == '%') && (superStr.matches("[0-9]+"))) {
			superRate = Integer.parseInt(superStr);
		}
		if ((superRate >=0 ) && (superRate <= 50)){
			return true;
		}
		return false;
	}
}
