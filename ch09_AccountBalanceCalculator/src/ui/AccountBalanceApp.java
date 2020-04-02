package ui;
import java.text.NumberFormat;

//import business.Account;
//import business.CheckingAccount;
//import business.SavingsAccount;
import business.*; //wildcard import for the business package
import util.ReferenceConsolClass;

public class AccountBalanceApp {
	
	private static NumberFormat cf = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		// Welcome msg + initialization
		// create SavingsAccount and checkingAccount with 1000 balances each.
		System.out.println("Welcome to the Account Balance Calculator!");
		SavingsAccount sa = new SavingsAccount(1000, .01);
		CheckingAccount ca = new CheckingAccount(1000, 1);

		// display initial balances
		System.out.println("Starting Balances");
		summarizeAccountBalances(ca,sa);
		System.out.println();
		System.out.println("Enter transactions for the month");
		System.out.println();
		String choice = "y";
		// - start loop
		while (choice.equalsIgnoreCase("y")) {
			// get user input - loop through monthly transactions
			// transaction = withdraw/deposit from checking/savings
			// transType: String
			// acctType: String
			// amount: double
			String transType = ReferenceConsolClass.getString("Withdraw or Deposit? (w/d): ", "w", "d");
			String acctType = ReferenceConsolClass.getString("Checking or Savings? (c/s): ", "c", "s");
			// logic
			// apply transaction to appropriate account
			Account a;
			if(acctType.equals("c")) {
				a=ca;
			}
			else {
				a=sa;
			}
			
			if(transType.equals("w")) {
				// prompt for amount once we know the account they intend to transact
				double amount = ReferenceConsolClass.getDouble("Amount? ", 0, a.getBalance()+1);
				a.withdraw(amount);
			}
			else {
				double amount = ReferenceConsolClass.getDouble("Amount? ", 0, Double.POSITIVE_INFINITY);
				a.deposit(amount);
			}
			// - end loop (user enters 'n' to continue)
			choice = ReferenceConsolClass.getString("Continue? (y/n): ",true);
		}

		// calculate monthly payments and fees
		sa.applyPayment();
		ca.subtractMonthlyFee();
		
		
		// apply payments and fees to balances

		// summarize payments and fees
		System.out.println("Monthly Payments and Fees:");
		System.out.println("Checking Fee:                "+cf.format(ca.getMonthlyFee()));
		System.out.println("Savings Interest Payment:    "+cf.format(sa.getMonthlyInterestPayment()));
		// summarize final balances
		System.out.println("Final Balances:");
		summarizeAccountBalances(ca, sa);
		// bye

	}

	private static void summarizeAccountBalances(CheckingAccount ca, SavingsAccount sa) {
		System.out.println("Checking: " + cf.format(ca.getBalance()));
		System.out.println("Savings: " + cf.format(sa.getBalance()));
	}

}
