/*
 * Devun Schneider
 * Project2/src/ChangeMachine.java
 * Project #2: Change Maker
 * A program that accepts the price for an item, amount of payment, and computes the change required
to repay a customer. 
 */
//imports java classes
import java.util.Scanner;
import java.text.DecimalFormat;

public class ChangeMachine {
	//Creates decimal format for change and pricing
	public static DecimalFormat df = new DecimalFormat("#,##0.00");

	public static void main(String[] args) {
		//create doubles to hold gross cost, net cost, tax, max cost, payment amount, and change
		double cost=-1;
		final double tax=.05;
		double payment=0;
		double change=0;
		double tCost=-1;
		final double max=500;
		Scanner scan=new Scanner(System.in);
		
		//change integers
		int hundreds=0;
		int fifty=0;
		int twenty=0;
		int tens=0;
		int five=0;
		int one=0;
		int quarter=0;
		int dime=0;
		int nickel=0;
		int penny=0;
		
		//sets double cost to input gross cost, asks until fills requirements
		while(cost<0 || cost>max) {
			System.out.print("Cost of transaction (enter 0 or negative to exit; max is $500.00): ");
			cost=scan.nextDouble();
			//sets tCost to net cost
			tCost=cost+(cost*tax);
			
			//if cost(entered number) is negative, quits the program
			if(cost<0) {
				System.exit(1);
			}
		}
		System.out.println("Amount due (with 5.00% tax): "+df.format(tCost));
		
		System.out.print("Please enter payment amount: ");
		//sets payment to entered amount
		payment=scan.nextDouble();
		//if payment (entered amount) is negative, quits the program
		if(payment<0) {
			System.exit(1);
		}
		
		
		//if the total cost is not a positive number, ends program
		if(tCost<=0) {
			System.out.println("Transaction canceled.");
		}
		//if payment is equal to the net cost, ends program
		else if(tCost==payment) {
			System.out.println("Exact Change! Amazing!");
		}
		//if the payment is less than the cost, asks for more payement
		else if(tCost>payment) {
			//could continue and ask for more input 
			System.out.println("Balance Due: " + (tCost-payment));
			
			//finds new cost
			tCost=tCost-payment;
			
			System.out.print("Please enter payment amount: ");
			//sets pay to payment amount
			payment=scan.nextDouble();
			if(payment<0) {
				System.exit(1);
			}
			
			//if the total cost is not a positive number, ends program
			if(tCost<=0) {
				System.out.println("Transaction canceled.");
			}
			//exact price payment
			else if(tCost==payment) {
				System.out.println("Exact Change! Amazing!");
			}
			else {
				//Calculates Change if there is any
				if(payment>tCost) {
					change=payment-tCost;
					System.out.println("Change back: $"+df.format(change));
				}
				//start calculating change
				if(change>=100) {
					hundreds=(int)(change/100.0);
					change=change%100;
				}
				//calculates amount of fifties in change
				if(change>=50) {
					fifty=(int)(change/50.0);
					change=change%50;
				}
				//calculates amount of twenties in change
				if(change>=20) {
					twenty=(int)(change/20.0);
					change=change%20;
				}
				//calculates amount of tens in change
				if(change>=10) {
					tens=(int)(change/10.0);
					change=change%10;
				}
				//calculates amount of fives in change
				if(change>=5) {
					five=(int)(change/5.0);
					change=change%5;
				}
				//calculates amount of singles in change
				if(change>=1) {
					one=(int)(change/1.0);
					change=change%1.0;
				}
				//calculates amount of quarters in change
				if(change>=.25) {
					quarter=(int)(change/.25);
					change=change%.25;
				}
				//calculates amount of dimes in change
				if(change>=.1) {
					dime=(int)(change/0.1);
					change=change%.1;
				}
				//calculates amount of nickels in change
				if(change>=.05) {
					nickel=(int)(change/.05);
					change=change%.05;
				}
				//calculates amount of pennies in change
				if(change>=.01) {
					penny=(int)(change/.01);
					change=change%.01;
				}
				
			}
		}
		else {
			//Calculates Change if there is any
			if(payment>tCost) {
				change=payment-tCost;
				System.out.println("Change back: $"+df.format(change));
			}
			//start calculating change
			if(change>=100) {
				hundreds=(int)(change/100.0);
				change=change%100;
			}
			//calculates amount of fifties in change
			if(change>=50) {
				fifty=(int)(change/50.0);
				change=change%50;
			}
			//calculates amount of twenties in change
			if(change>=20) {
				twenty=(int)(change/20.0);
				change=change%20;
			}
			//calculates amount of tens in change
			if(change>=10) {
				tens=(int)(change/10.0);
				change=change%10;
			}
			//calculates amount of fives in change
			if(change>=5) {
				five=(int)(change/5.0);
				change=change%5;
			}
			//calculates amount of singles in change
			if(change>=1) {
				one=(int)(change/1.0);
				change=change%1.0;
			}
			//calculates amount of quarters in change
			if(change>=.25) {
				quarter=(int)(change/.25);
				change=change%.25;
			}
			//calculates amount of dimes in change
			if(change>=.1) {
				dime=(int)(change/0.1);
				change=change%.1;
			}
			//calculates amount of nickels in change
			if(change>=.05) {
				nickel=(int)(change/.05);
				change=change%.05;
			}
			//calculates amount of pennies in change
			if(change>=.01) {
				penny=(int)(change/.01);
				change=change%.01;
			}
		}
		System.out.println("$100: "+hundreds+ " $50: "+fifty+" $20: "+twenty+" $10: "+tens+" $5: "+five+" $1: "+one+ " $0.25: "+quarter+ " $0.10: "+dime+" $0.05: "+nickel+" $0.01: "+penny);
		
	}
	
}
