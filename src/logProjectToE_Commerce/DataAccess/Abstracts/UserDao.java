package logProjectToE_Commerce.DataAccess.Abstracts;

import logProjectToE_Commerce.Entities.Concretes.User;
import java.util.List;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User>getAll();
	boolean isInEmail(String mail);
	boolean isInPassword(String password);
}
