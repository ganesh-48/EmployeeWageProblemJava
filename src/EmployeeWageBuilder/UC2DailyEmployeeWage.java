package EmployeeWageBuilder;

public class UC2DailyEmployeeWage {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int salary;
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == IS_FULL_TIME ) {
			int empRatePerHrs= 20;
			int empHrs = 8;
			salary=(empHrs * empRatePerHrs);
			System.out.println("salary:"+salary);
			}
		else {
			salary=0;
			System.out.println("salary:"+salary);
		}
	}	
}
