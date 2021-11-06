package logProjectToE_Commerce.Business.Concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import logProjectToE_Commerce.Business.Abstracts.MailVerificationService;
import logProjectToE_Commerce.Business.Abstracts.UserValidatorService;
import logProjectToE_Commerce.Entities.Concretes.User;

public class UserValidatorManager implements UserValidatorService  {
	
	List<String> emails = new ArrayList<String>();
	
	private MailVerificationService mailVerificationService;

	public UserValidatorManager(MailVerificationService mailVerificationService) {
		super();
		this.mailVerificationService = mailVerificationService;
	}

	@Override
	public boolean firstNameValid(User user) {
		if(user.getFirstName().isEmpty()) {
			System.out.println("Firstname cannot be empty");
			return false;
		}else if(user.getFirstName().length()<2) {
			System.out.println("Firstname index must be higher than 1");
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean lastNameValid(User user) {
		if(user.getLastName().isEmpty()) {
			System.out.println("Lastname cannot be empty");
			return false;
		}else if(user.getLastName().length()<2) {
			System.out.println("Lastname index must be higher than 1");
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean passwordValid(User user) {
		if(user.getPassword().isEmpty()) {
			System.out.println("Password cannot be empty");
			return false;
		}else if(user.getPassword().length()<6) {
			System.out.println("Password index must be higher than 6");
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean emailValid(User user) {
		String regex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2,})?$";
		Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE );
		
		if(user.getEmail().isEmpty()) {
			System.out.println("E-mail cannot be empty");
			
		}else if(pattern.matcher(user.getEmail()).find()==false) {
			System.out.println("E-mail format is wrong");
			return false;
		  } 
		
		return true;
	}
	
	@Override
	public boolean uniqueEmailValid(User user) {
		if(emails.contains(user.getEmail())) {
			System.out.println("This e-mail used");
			return false;
		}else {
			emails.add(user.getEmail());
			return true;
		}
	}


	@Override
	public boolean validation(User user) {
		if(firstNameValid(user) && lastNameValid(user) && passwordValid(user) && emailValid(user) && uniqueEmailValid(user)) {
			
			System.out.println("Validation successful");
			return true;
		}else {
			System.out.println("Validation failed");
			return false;
		}
	}

	
}
