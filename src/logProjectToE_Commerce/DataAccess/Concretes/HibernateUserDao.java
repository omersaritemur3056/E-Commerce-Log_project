package logProjectToE_Commerce.DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import logProjectToE_Commerce.DataAccess.Abstracts.UserDao;
import logProjectToE_Commerce.Entities.Concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> Users = new ArrayList<User>();

	@Override
	public void add(User user) {
		Users.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " added to database.");
		
	}

	@Override
	public void delete(User user) {
		Users.remove(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " removed to database.");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " updated to database.");
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isInEmail(String mail) {
		for(User x : Users) {
			if(x.getEmail() == mail) {
				return true;
			}
		}
		return false;
		
	}

	@Override
	public boolean isInPassword(String password) {
		for(User x : Users) {
			if(x.getPassword() == password) {
				return true;
			}
		}
		return false;
	}
	

}
