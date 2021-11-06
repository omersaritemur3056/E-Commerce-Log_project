package logProjectToE_Commerce.Business.Concretes;

import logProjectToE_Commerce.Business.Abstracts.MailVerificationService;
import logProjectToE_Commerce.Business.Abstracts.UserValidatorService;
import logProjectToE_Commerce.Entities.Concretes.User;

public class MailVerificationManager implements MailVerificationService {
	
	private UserValidatorService userValidatorService;


	public MailVerificationManager(UserValidatorService userValidatorService) {
		
		this.userValidatorService = userValidatorService;
	}

	@Override
	public void sendEmail(User user) {
		if(userValidatorService.validation(user)) {
			System.out.println("Sended verifing email");
		}
		
	}

	@Override
	public boolean verifySendedEmail(User user) {
		System.out.println("Email activation completed");
		return true;
	}

}
