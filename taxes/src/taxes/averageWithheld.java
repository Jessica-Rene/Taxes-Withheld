package taxes;
import java.util.Scanner;
/*
	START
	
	Initialize variable numIncome to store the first number
	Initialize variable taxRate to calculate the tax rate
	
	Prompt the user to enter the first number
	Read numIncome from the user
	
	IF numIncome < 500 THEN
	Calculate taxRate as numIncome * .10
	Display the result: "Taxes withheld is taxRate"
	
	ELSE IF numIncome >= 500 & numIncome < 1500 THEN
	Calculate taxRate as numIncome *.15
	Display the result: "Taxes withheld: is taxRate"
	
	ELSE IF numIncome >= 1500 & numIncome < 2500 THEN
	Calculate taxRate as numIncome *.20
	Display the result: "Taxes withheld: is taxRate"
	
	ELSE IF numIncome >= 2500 THEN
	Calculate taxRate as numIncome *.30
	Display the Result: "Taxes withheld: is taxRate"
	
	ELSE (if none of the above are true) THEN
	Display: "Invalid amount"
	
	END
		
 */
public class averageWithheld {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		// variables for taking user input (numIncome) and calculates the tax rate (taxRate)
		double numIncome;
		double taxRate;
		
		// gets user input income
		System.out.println("Enter your weekly income: ");
		// saves the user input in numIncome
		numIncome = scnr.nextDouble();	
		
		// if else statements to see which condition the user income is true then calculates the tax rate & prints out taxes withheld
		if ( (numIncome > 0) && (numIncome < 500) ) {				// if income is between 0 & 499
			taxRate = numIncome * .10;
			System.out.printf("Taxes withheld: $%.2f", taxRate);
		}			
		else if ( (numIncome >= 500) && (numIncome < 1500) ) {		// if income is between 500 & 1499
			taxRate = numIncome * .15;
			System.out.printf("Taxes withheld: $%.2f", taxRate);
		}
		else if ( (numIncome) >= 1500 && (numIncome < 2500) ) {		// if income is between 1500 & 2499
			taxRate = numIncome * .20;	
			System.out.printf("Taxes withheld: $%.2f", taxRate);
		}
		else if (numIncome >= 2500) {								// if income is greater than 2500
			taxRate = numIncome * .30;
			System.out.printf("Taxes withheld: $%.2f", taxRate);
		}
		else {
			System.out.println("Invalid number.");					// if all of the conditions are false, then outputs Invalid number
		}
		scnr.close();
	
	}
		
}
