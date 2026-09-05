/**

Option #2: Calculate Grocery Bill
Create a program that can be used to calculate the average weekly and
	monthly grocery bill for a family of four:

	Prompt the user for the coupon amount as a decimal (example, .10).
	Ensure the value is set to 10% if the value exceeds 100% or is
		less than or equal to zero.
	Prompt the user for weeks 1-4 grocery bills.
	Calculate the monthly and weekly average for groceries.
	Display monthly total and weekly average without the coupon.
	Display monthly total and weekly average with the coupon.
	Compile and submit your pseudocode, source code, and screenshots
		of the application executing the application, the results and
		GIT repository in a single document.


**/

/*
Pseudo Code Outline

import scanner

main {
	system.out.println("Please enter coupon amount: ")
	couponAmount = nextDouble
	if couponAmount >= 100% or if couponAmount <= 0%, set couponAmount to 10% by default
	
	system.out.println("Enter week 1 grocery bill amount: ")
	week1Total = input

	system.out.println("Enter week 2 grocery bill amount: ")
	week2Total = input
	
	system.out.println("Enter week 3 grocery bill amount: ")
	week3Total = input
	
	system.out.println("Enter week 4 grocery bill amount: ")
	week4Total = input
	
	totalMonthly = week1Total + week2Total + week3Total + week4Total
	
	weeklyAverage = (week1Total + week2Total + week3Total + week4Total)/4
	
	system.out.println("Monthly total without coupon: " + totalMonthly)
	system.out.println("Weekly average without coupon: " + weeklyAverage)
	
	system.out.println("Monthly total with coupon: " + (totalMonthly*couponAmont))
	system.out.println("Weekly average with coupon: " + (weeklyAverage*couponAmont))
	
	//Use below as check. Comment out once verified
		System.out.println("----- This is a check -----");
		System.out.println("couponAmount = " + couponAmount);
		System.out.println("week1Total = " + week1Total);
		System.out.println("week2Total = " + week2Total);
		System.out.println("week3Total = " + week3Total);
		System.out.println("week4Total = " + week4Total);

*/

import java.util.Scanner;

public class module3_option2_grocerybill {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double couponAmount; //coupon percentage entered by user
		
		double week1Total; //week 1 total grocery bill amount
		double week2Total; //week 2 total grocery bill amount
		double week3Total; //week 3 total grocery bill amount
		double week4Total; //week 4 total grocery bill amount
		
		System.out.println("Please enter coupon amount as decimal (example: .10 as 10%): ");
		
		couponAmount = scnr.nextDouble();
		
		System.out.println("Entery week 1 total grocery bill amount: ");
		week1Total = scnr.nextDouble();
		
		System.out.println("Entery week 2 total grocery bill amount: ");
		week2Total = scnr.nextDouble();
		
		System.out.println("Entery week 3 total grocery bill amount: ");
		week3Total = scnr.nextDouble();
		
		System.out.println("Entery week 4 total grocery bill amount: ");
		week4Total = scnr.nextDouble();
		
		double monthlyTotal; //Total of week1+2+3+4
		double weeklyAverage; //average totalMontly / 4
		
		monthlyTotal = week1Total + week2Total + week3Total + week4Total;
		weeklyAverage = monthlyTotal / 4;
		
		//Monthly and weekly amount without coupon
		System.out.println("Monthy total of grocery bills without coupon: " + monthlyTotal);
		System.out.println("Weekly average of grocery bills without coupon: " + weeklyAverage);
		
		//Monthly and weekly amount WITH coupon
		System.out.println("Monthly total of grocery bills with coupon: " + (monthlyTotal * couponAmount));
		System.out.println("Weekly average of grocery bills with coupon: " + (weeklyAverage * couponAmount));
		
	}
	
}