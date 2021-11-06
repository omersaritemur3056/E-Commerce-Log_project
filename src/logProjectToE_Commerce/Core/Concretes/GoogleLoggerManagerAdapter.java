package logProjectToE_Commerce.Core.Concretes;

import logProjectToE_Commerce.Core.Abstracts.LoggerService;
import logProjectToE_Commerce.Entities.Concretes.User;
import logProjectToE_Commerce.JLoggingWithGoogleAccount.GoogleLoggerManager;

public class GoogleLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToService(User user) {
		GoogleLoggerManager googleLoggerManager = new GoogleLoggerManager();
		googleLoggerManager.googleLogger("Sign in with Google account");
	}

}
