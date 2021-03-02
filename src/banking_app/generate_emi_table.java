package banking_app;

import java.util.Scanner;

public class generate_emi_table {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO iBANK :)");
		System.out.println("Press number to select LOAN type: \n 1.HOME LOAN at 5% rate of interest\n 2.EDUCATION LOAN at 8% rate of interest\n 3.CAR LOAN at 10% rate of interest");
		int loan_type = sc.nextInt();

		switch (loan_type) {
		case 1:
			home_loan h1 = new home_loan();

			h1.call();
			h1.emi();
			h1.table();
			break;
		case 2:
			education_loan e1 = new education_loan();
			e1.call();
			e1.emi();
			e1.table();
			break;
		case 3:
			car_loan c1 = new car_loan();
			c1.call();
			c1.emi();
			c1.table();
			break;
		default:
			System.out.println("enter valid number please");
			break;
		}
	}
}
