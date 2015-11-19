package simple.sample.payslip;

public class PaySlipData {
	
	private String fullname;
	private int salary;
	private int superRate;
	private String payPeriod;
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSuperRate() {
		return superRate;
	}
	public void setSuperRate(int superRate) {
		this.superRate = superRate;
	}
	public String getPayPeriod() {
		return payPeriod;
	}
	public void setPayPeriod(String payPeriod) {
		this.payPeriod = payPeriod;
	}

}
