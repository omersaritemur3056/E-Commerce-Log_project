package logProjectToE_Commerce.Business.Concretes;

import java.util.ArrayList;
import java.util.List;

import logProjectToE_Commerce.Business.Abstracts.MailVerificationService;
import logProjectToE_Commerce.Business.Abstracts.UserService;
import logProjectToE_Commerce.Business.Abstracts.UserValidatorService;
import logProjectToE_Commerce.Core.Abstracts.LoggerService;
import logProjectToE_Commerce.DataAccess.Abstracts.UserDao;
import logProjectToE_Commerce.Entities.Concretes.User;

public class UserManager implements UserService {
	
	List<User> Users = new ArrayList<User>();
	
	private UserValidatorService userValidatorService;
	private MailVerificationService mailVerificationService;
	private UserDao userDao;
	private LoggerService loggerService;
	
	

	public UserManager(UserValidatorService userValidatorService, MailVerificationService mailVerificationService,
			UserDao userDao, LoggerService loggerService) {
		super();
		this.userValidatorService = userValidatorService;
		this.mailVerificationService = mailVerificationService;
		this.userDao = userDao;
		this.loggerService = loggerService;
	}

	@Override
	public void signUp(User user) {
		if(userValidatorService.validation(user) == true && mailVerificationService.verifySendedEmail(user) == true) {
			System.out.println("Sign Up completed");
			userDao.add(user);
		}else {
			System.out.println("Sign Up failed");
		}
		
	}

	@Override
	public void sign›n(User user) {
		if(userDao.isInEmail(user.getEmail()) && userDao.isInPassword(user.getPassword())) {
			System.out.println("Sign in completed " + user.getFirstName());
		}
		
	}

	@Override
	public void sign›nWithGoogleAccount(User user) {
		this.loggerService.logToService(user);
		
	}

}
