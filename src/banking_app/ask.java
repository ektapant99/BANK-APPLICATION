package banking_app;
import java.util.Scanner;
class ask implements loan_details {
	
	Scanner sc = new Scanner(System.in);
	//declaring variables
	int age, gender, education, country;
	double loan_time, loan_amount;
	String name, address;
	
	@Override
	public void amount() {
		System.out.println("Enter LOAN amount");
		loan_amount = sc.nextInt();
	}

	@Override
	public void time() {
		System.out.println("Enter LOAN duration in years");
		loan_time = sc.nextInt();
	}
	@Override
	public void check() {
		System.out.println("Enter your country: \n 1.INDIA \n 2.OTHERS");
		country = sc.nextInt();
		if (country == 1) {
			System.out.println("Enter your personal details");
		} else {
			System.out.println("sorry, we do not serve your country");
			System.exit(0);
		}
	}

	@Override
	public void personal_details() {

		System.out.println("Enter your name: ");
		sc.next();
		name = sc.nextLine();

		System.out.println("Enter your age: ");
		age = sc.nextInt();

		System.out.println("Enter your gender: \n 1.MALE \n 2.FEMALE");
		gender = sc.nextInt();

		System.out.println("Enter your address: ");
		sc.next();
		address = sc.nextLine();
	}

	@Override
	public void education_details() {
		System.out.println("Enter your education: \n 1.GRADUATE \n 2.UNDER-GRADUATE \n 3.POST-GRADUATE");
		education = sc.nextInt();
	}

}
