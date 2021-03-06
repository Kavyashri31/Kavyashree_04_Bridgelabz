package com.bridgelabz.employeewage;

public class EmpWageUC6 {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 30;
	public static final int MAX_HRS_IN_MONTH = 100;

	public EmpWageUC6() {
	}

	public static void main(String[] args) {

		int totalEmpWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {

			int empHrs = 0, empWage = 0;
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}

			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpHrs += empHrs;

			totalEmpWage += empWage;
			System.out.println("Emp Wage:" + empWage);
		}
		System.out.println("Total Emp Hrs:" + totalEmpHrs);
		System.out.println("Total Working days:" + totalWorkingDays);
		System.out.println("Total Emp Wage:" + totalEmpWage);
	}
}
