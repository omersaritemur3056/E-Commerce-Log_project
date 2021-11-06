package logProjectToE_Commerce;

import logProjectToE_Commerce.Business.Abstracts.UserService;
import logProjectToE_Commerce.Business.Concretes.MailVerificationManager;
import logProjectToE_Commerce.Business.Concretes.UserManager;
import logProjectToE_Commerce.Business.Concretes.UserValidatorManager;
import logProjectToE_Commerce.Core.Concretes.GoogleLoggerManagerAdapter;
import logProjectToE_Commerce.DataAccess.Concretes.HibernateUserDao;
import logProjectToE_Commerce.Entities.Concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Ömer");
		user1.setLastName("Sarýtemur");
		user1.setPassword("12444389");
		user1.setEmail("omersaritemur3056@gmail.com");
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Faruk");
		user2.setLastName("Sarýtemur");
		user2.setEmail("faruk2616@gmail.com");
		user2.setPassword("98ffff21");
		
		
		UserService service = new UserManager(new UserValidatorManager(null), new MailVerificationManager(null), new HibernateUserDao(), new GoogleLoggerManagerAdapter());
		
		service.signUp(user1);
		
		service.signÝn(user1);
	}
	

}
