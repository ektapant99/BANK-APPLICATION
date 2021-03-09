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
		System.out.println("Enter LOAN Amount. ");
		loan_amount = sc.nextInt();
		if (loan_amount >= 1000000000) {
			System.out.println("Failed: We are unable to loan out such large amount :(");
			System.exit(0);
			}

	}

	@Override
	public void time() {
		System.out.println("Enter LOAN duration in years");
		loan_time = sc.nextInt();
		if (loan_time >= 21) {
			System.out.println("Failed: time duration should be less than or equals to 20 years");
			System.exit(0);
			}
	}
	@Override
	public void check() {
		System.out.println("Enter your country: \n 1.INDIA \n 2.OTHERS");
		country = sc.nextInt();
		if (country == 1) {
			System.out.println("Enter your personal details");
		} else {
			System.out.println("Failed: sorry, we do not serve your country");
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
		if (age >= 101) {
			System.out.println("Failed: age should be less than or equal to 100 years");
			System.exit(0);
			}


		System.out.println("Enter your gender: \n 1.MALE \n 2.FEMALE");
		gender = sc.nextInt();
		if (gender >= 3) {
			System.out.println("Failed: enter valid details");
			System.exit(0);
			}

		System.out.println("Enter your address: ");
		sc.next();
		address = sc.nextLine();
	}

	@Override
	public void education_details() {
		System.out.println("Enter your education: \n 1.GRADUATE \n 2.UNDER-GRADUATE \n 3.POST-GRADUATE");
		education = sc.nextInt();
		if (education >= 4) {
			System.out.println("Failed: enter valid details");
			System.exit(0);
			}
	
	}
	public void eligibility() {
		if (gender == 1) {
			if(education == 1 && age >= 60) {
				System.out.println("80% loan approved");
			}
			else if(education == 2 && age >=35) {
				System.out.println("60% loan approved");
			}
			else if(education == 3 ) {
				System.out.println("90% loan appproved");
			}
		}
		else if(gender ==2) {
			if(education == 1 && age >= 5) {
				System.out.println("80% loan approved");
			}
			else if(education == 2 && age >=30) {
				System.out.println("60% loan approved");
			}
			else if(education == 3 ) {
				System.out.println("90% loan approved");
			}
		}
		System.out.println("press 1 to continue and 2 to exit");
		int a = sc.nextInt();
		if(a == 2) {
			System.exit(0);
		}
		 
	}

}
