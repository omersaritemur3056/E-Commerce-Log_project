package logProjectToE_Commerce.Business.Abstracts;

import logProjectToE_Commerce.Entities.Concretes.User;

public interface UserService {
	void signUp(User user);
	void sign›n(User user);
	void sign›nWithGoogleAccount(User user);
}
