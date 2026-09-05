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
	
	system.out.println("Enter 1st person week 1 grocery bill amount: ")
	need input for 4 people
	ask for input 4 times, 1 per person	
	week1Total = input1 + input2 + input3 + input4
		
	2nd week, 3rd week, 4th week - same process
	
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
	
	rounding format for 2 decimal places, ending in new line:
		System.out.printf("%.2f\n", amount to round);

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
		
		System.out.println("Please enter coupon amount as decimal greater than 0.00 and less than or equal to 1.00 (example: .10 as 10%): ");
		
		couponAmount = scnr.nextDouble();
		
		//check couponAmount is in correct range or change value to 0.10
		if(couponAmount > 1 || couponAmount <= 0) {
			couponAmount = 0.1;
		}
		
		//Get input for 1st week bills (4 people)
		System.out.println("Week 1: Enter person #1 total grocery bill amount: $");
		week1Total = scnr.nextDouble();
		System.out.println("Week 1: Enter person #2 total grocery bill amount: $");
		week1Total = week1Total + scnr.nextDouble();
		System.out.println("Week 1: Enter person #3 total grocery bill amount: $");
		week1Total = week1Total + scnr.nextDouble();
		System.out.println("Week 1: Enter person #4 total grocery bill amount: $");
		week1Total = week1Total + scnr.nextDouble();

		//Get input for 2nd week bills (4 people)
		System.out.println("Week 2: Enter person #1 total grocery bill amount: $");
		week2Total = scnr.nextDouble();
		System.out.println("Week 2: Enter person #2 total grocery bill amount: $");
		week2Total = week2Total + scnr.nextDouble();
		System.out.println("Week 2: Enter person #3 total grocery bill amount: $");
		week2Total = week2Total + scnr.nextDouble();
		System.out.println("Week 2: Enter person #4 total grocery bill amount: $");
		week2Total = week2Total + scnr.nextDouble();

		//Get input for 3rd week bills (4 people)
		System.out.println("Week 3: Enter person #1 total grocery bill amount: $");
		week3Total = scnr.nextDouble();
		System.out.println("Week 3: Enter person #2 total grocery bill amount: $");
		week3Total = week3Total + scnr.nextDouble();
		System.out.println("Week 3: Enter person #3 total grocery bill amount: $");
		week3Total = week3Total + scnr.nextDouble();
		System.out.println("Week 3: Enter person #4 total grocery bill amount: $");
		week3Total = week3Total + scnr.nextDouble();

		//Get input for 4th week bills (4 people)
		System.out.println("Week 4: Enter person #1 total grocery bill amount: $");
		week4Total = scnr.nextDouble();
		System.out.println("Week 4: Enter person #2 total grocery bill amount: $");
		week4Total = week4Total + scnr.nextDouble();
		System.out.println("Week 4: Enter person #3 total grocery bill amount: $");
		week4Total = week4Total + scnr.nextDouble();
		System.out.println("Week 4: Enter person #4 total grocery bill amount: $");
		week4Total = week4Total + scnr.nextDouble();

		//Calculate monthly total and weekly average
		double monthlyTotal; //Total of week1+2+3+4
		double weeklyAverage; //average totalMontly / 4
		
		monthlyTotal = week1Total + week2Total + week3Total + week4Total;
		weeklyAverage = monthlyTotal / 4;
		
		//Monthly and weekly amount without coupon
		System.out.print("Monthy total of grocery bills without coupon: $");
		System.out.printf("%.2f\n", monthlyTotal);
		System.out.print("Weekly average of grocery bills without coupon: $");
		System.out.printf("%.2f\n", weeklyAverage);
		
		//Monthly and weekly amount WITH coupon
		System.out.print("Monthly total of grocery bills with coupon: $");
		System.out.printf("%.2f\n",(monthlyTotal * (1-couponAmount)));
		System.out.print("Weekly average of grocery bills with coupon: $");
		System.out.printf("%.2f\n", (weeklyAverage * (1-couponAmount)));
		
	}
	
}