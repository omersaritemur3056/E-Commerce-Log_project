package logProjectToE_Commerce.Business.Abstracts;

import logProjectToE_Commerce.Entities.Concretes.User;

public interface MailVerificationService {
	void sendEmail(User user);
	boolean verifySendedEmail(User user);
}
