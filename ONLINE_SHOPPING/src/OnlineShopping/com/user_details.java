package OnlineShopping.com;

public interface user_details {

	abstract void personal_details() throws InvalidPhoneException;
	abstract void eligibility();
	abstract void extra() throws InvalidGenderException;
	abstract String pwd() throws InvalidPasswordException;
	abstract String email() throws InvalidEmailException;


}
