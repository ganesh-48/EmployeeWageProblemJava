package EmployeeWageBuilder;

public class UC3AddPartTimeEmployeeWage {
	public static void main(String[] args) {
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HRS = 20;
		int salary , empHrs;
		double empCheck = Math.floor(Math.random() * 10 ) % 3;
		if(empCheck == IS_PART_TIME ) {
			 empHrs = 8;
		}
		else if(empCheck == IS_FULL_TIME ){
			 empHrs = 4;
		}
		else {
			 empHrs = 0;
		}
		salary=(empHrs * EMP_RATE_PER_HRS);
		System.out.println("salary:"+salary);
	}
}
