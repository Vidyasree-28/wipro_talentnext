package oops;

public class TestEmployee {
public static void main(String[] args) {
	Employee emp=new Employee("John",50000.0,2005,"ABC234");
	System.out.println("Employee Details:");
	System.out.println("Name:"+emp.getName());
	System.out.println("AnnualSalary:"+emp.getAnnualSalary());
	System.out.println("startYear:"+emp.getstartYear());
	System.out.println("nationalInsuranceNumber:"+emp.nationalInsuranceNumber);
	
}
}
