package simple.sample.payslip;

public class PaySlip {
	
	PaySlipData  paySlipData = new PaySlipData();
	
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
		
		//fullname = details[0] + " " + details[1];
		paySlipData.setFullname(details[0] + " " + details[1]);
		
		//payPeriod = details[4];
		paySlipData.setPayPeriod(details[4]);
		
		if (details[2].matches("[0-9]+")){
			//salary = Integer.parseInt(details[2]);
			paySlipData.setSalary( Integer.parseInt(details[2]));
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
			//superRate = Integer.parseInt(superStr);
			paySlipData.setSuperRate(Integer.parseInt(superStr));
		}
		
		//if (superRate > 50){
		if (paySlipData.getSuperRate() > 50){
			return false;
		}
		return true;
	}
	
	public int calculateGrossIncome(int annualSalary){
		return (int)(annualSalary / 12 + 0.5);
	}
	
	public int calculateTax(int annualSalary){
		if (annualSalary <= 18200){
			return 0;
		}
		else if (annualSalary <= 37000){
			return (int)(((annualSalary - 18200) * 0.19) / 12 + 0.5 );
		}else if (annualSalary <= 80000){
			return (int)((((annualSalary - 37000) * 0.325) + 3572) / 12 + 0.5);
		}else if (annualSalary <= 180000){
			return (int)((((annualSalary - 80000) * 0.37) + 17547) / 12 + 0.5);
		}
		return (int)((((annualSalary - 180000) * 0.45) + 54547) / 12 + 0.5);
	}
	
	public String issuePaySlip(String input) {
		if (validateEmployeeDetails(input) == false) {
			return "Invalid input";
		}
		//int grossIncome = calculateGrossIncome(salary);
		int grossIncome = calculateGrossIncome(paySlipData.getSalary());
		
		//int tax = calculateTax(salary);
		int tax = calculateTax(paySlipData.getSalary());
		
		int netIncome = grossIncome - tax;
		
		//int superValue = (int) ((grossIncome * superRate / 100) + 0.5);
		int superValue = (int) ((grossIncome * paySlipData.getSuperRate() / 100) + 0.5);
		
		/*String paySlip = fullname + ","
						 + payPeriod + ","
						 + grossIncome + ","
						 + tax + ","
						 + netIncome + ","
						 + superValue;*/
		String paySlip = paySlipData.getFullname() + ","
					+ paySlipData.getPayPeriod() + ","
					+ grossIncome + ","
					+ tax + ","
					+ netIncome + ","
					+ superValue;
		return paySlip;				 
						
	
	}
}

