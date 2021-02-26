package banking_app;

public class education_loan extends ask {
	
	double roi = 8;
	void call() {
		
		amount();
		time();
		check();
		personal_details();
		education_details();
		
		
	}
	void emi(){            
		roi = roi/(12*100);
		loan_time = loan_time*12;
		double emi= (loan_amount * roi * Math.pow(1+roi ,loan_time )) / (Math.pow(1+roi , loan_time) -1);
		System.out.println(" EMI is= "+emi);
	}

}
