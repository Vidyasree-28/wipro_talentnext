package oops;

public class Employee extends Person {
	private double annualSalary;
	private int startYear;
	String nationalInsuranceNumber;
	
	public Employee(String name,double annualSalary,int stratYear,String nationalInsuranceNumber) {
		
		super(name);
		this.annualSalary=annualSalary;
		this.startYear=startYear;
		this.nationalInsuranceNumber=nationalInsuranceNumber;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary1(double annualSalary) {
		this.annualSalary=annualSalary;
	}
	public double getstartYear() {
		return startYear;
	}
	public void setstartYear(int startYear) {
		this.startYear=startYear;
	}
	public  String getnationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}
	public void setnationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber=nationalInsuranceNumber;
	}

}
