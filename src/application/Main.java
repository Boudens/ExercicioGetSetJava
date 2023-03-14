package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String tempName;
		int tempNumber;
		Double tempAmount;
		char option;

		System.out.print("Enter the account holders name: ");
		tempName = sc.next();

		System.out.print("Enter the account holders number: ");
		tempNumber = sc.nextInt();

		Account account = new Account(tempName, tempNumber);

		System.out.print("Is there a initial deposit(y/n) ?");
		option = sc.next().charAt(0);

		if (option == 'y' || option == 'Y') {
			System.out.print("Enter the initial deposit: ");
			tempAmount = sc.nextDouble();
			account.InitialDeposit(tempAmount);
		}
		
		account.toString();
		
		System.out.print("Enter the deposit amount: ");
		tempAmount = sc.nextDouble();
		account.Deposit(tempAmount);
		
		System.out.print("Enter the withdraw amount: ");
		tempAmount = sc.nextDouble();
		account.Withdraw(tempAmount);

		sc.close();
	}
}
