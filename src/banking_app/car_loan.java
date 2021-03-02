package banking_app;

public class car_loan extends ask {

	double roi = 10;
	double emi, interest, principal;
	void call() {
		
		amount();
		time();
		check();
		personal_details();
		education_details();
		eligibility();
	}
	
	void emi(){            
		double r = roi/(12*100);
		double time = loan_time*12;
		emi= (loan_amount * r * Math.pow(1+r ,time )) / (Math.pow(1+r , time) -1);
		System.out.print(" EMI is= "+emi+ "\n\n");
	}

	public void table() {
		System.out.println("---- EMI CALCULATOR ----");
		System.out.println("MONTH\t\t|\t\tEMI\t\t\t|\t\t\tINTEREST\t\t\t|\t\t\tPRINCIPAL\t\t\t|\t\t\tBALANCE ");
		for(int i=1; i<=loan_time*12; i++) {
			interest = (roi * loan_amount)/ 1200;
			principal = emi - interest;
			loan_amount = loan_amount - principal;
			if(loan_amount < 0) {
				loan_amount =0;
			}
			System.out.println(i +"\t\t|\t\t"+ emi + "\t\t|\t\t" + interest + "\t\t|\t\t" + principal + "\t\t|\t\t" + loan_amount);
			
		}
	}
}
