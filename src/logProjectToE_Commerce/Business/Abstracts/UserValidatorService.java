package logProjectToE_Commerce.Business.Abstracts;

import logProjectToE_Commerce.Entities.Concretes.User;

public interface UserValidatorService {

	boolean firstNameValid(User user);
	boolean lastNameValid(User user);
	boolean passwordValid(User user);
	boolean emailValid(User user);
	boolean uniqueEmailValid(User user);
	boolean validation(User user);
}
