package springbook.user.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
///
import static springbook.user.service.UserServiceImpl.MIN_LOGCOUNT_FOR_SILVER;
import static springbook.user.service.UserServiceImpl.MIN_RECOMMENT_FOR_GOLD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;

import springbook.user.dao.UserDao;
import springbook.user.domain.Level;
import springbook.user.domain.User;
import springbook.user.service.TestUserService.TestUserServiceException;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/test-applicationContext.xml")
public class UserServiceTest {
	@Autowired
	UserService userService;
	@Autowired
	UserDao userDao;
	/*@Autowired
	DataSource dataSource;*/
	@Autowired
	PlatformTransactionManager transactionManager;
	
	@Autowired
	MailSender mailSender;
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	List<User> users;
	
	@Before
	public void setUp() throws Exception {
		
		users = Arrays.asList(
//				new User("bumjin", "박범진", "p1",Level.BASIC, 49, 0),
//				new User("joytouch", "강명성", "p2", Level.BASIC, 50 , 0),
//				new User( "erwins", "신승한","p3", Level.SILVER, 60, 29),
//				new User("madnitel", "이상호", "p4", Level.SILVER, 60, 30),
//				new User( "green", "오민규","p5", Level.GOLD, 100, 100));
		new User("bumjin", "박범진", "p1",Level.BASIC, MIN_LOGCOUNT_FOR_SILVER-1, 0,"twinspark81@gmail.com"),
		new User("joytouch", "강명성", "p2", Level.BASIC, MIN_LOGCOUNT_FOR_SILVER , 0,"twinspark81@gmail.com"),
		new User( "erwins", "신승한","p3", Level.SILVER, 60, MIN_RECOMMENT_FOR_GOLD-1,"twinspark81@gmail.com"),
		new User("madnitel", "이상호", "p4", Level.SILVER, 60, MIN_RECOMMENT_FOR_GOLD,"twinspark81@gmail.com"),
		new User( "green", "오민규","p5", Level.GOLD, 100, Integer.MAX_VALUE,"twinspark81@gmail.com"));
						
		
		
	}

	@Test
//	@DirtiesContext
	public void upgradeLevels() {
		userDao.deleteAll();
		
		for (User user:users) userDao.add(user);
		MockMailSender mailMailSender =  new MockMailSender();
		userServiceImpl.setMailSender(mailMailSender);
		
		userService.upgradeLevels();
		
//		checkLevel(users.get(0), Level.BASIC);
//		checkLevel(users.get(1), Level.SILVER);
//		checkLevel(users.get(2), Level.SILVER);
//		checkLevel(users.get(3), Level.GOLD);
//		checkLevel(users.get(4), Level.GOLD);
		checkLevelUpgraded(users.get(0), false);
		checkLevelUpgraded(users.get(1), true);
		checkLevelUpgraded(users.get(2), false);
		checkLevelUpgraded(users.get(3), true);
		checkLevelUpgraded(users.get(4), false);
		
		//assertThat(this.userService, is(notNullValue()));
		List<String> request = mailMailSender.getRequests();
		assertThat(request.size(), is(2));
		assertThat(request.get(0), is(users.get(1).getEmail()));
		assertThat(request.get(1), is(users.get(3).getEmail()));
	}

	
	public void checkLevel(User user, Level expectedLevel){
		User userUpdate = userDao.get(user.getId());
		assertThat(userUpdate.getLevel(), is(expectedLevel));
		
	}
	
	public void checkLevelUpgraded(User user, boolean upgraded){
		User userUpgrade = userDao.get(user.getId());
		if(upgraded){
			assertThat(userUpgrade.getLevel(), is(user.getLevel().nextLevel()));
			
		}else{
			assertThat(userUpgrade.getLevel(), is(user.getLevel()));
		}
		
	}
	@Test
	public void add(){
		
		userDao.deleteAll();
		
		User userWithLevel =  users.get(4);
		User userWithoutLevel = users.get(2);
		userWithoutLevel.setLevel(null);
		
		userService.add(userWithLevel);
		userService.add(userWithoutLevel);
		
		User user1 = userDao.get(userWithLevel.getId());
		User user2 = userDao.get(userWithoutLevel.getId());
		
		assertThat(user1.getLevel(), is(userWithLevel.getLevel()));
		
		assertThat(user2.getLevel(),is(userWithoutLevel.getLevel()));
		
	}
	
	@Test
	public void upgradeAllOrNothing(){
		
		UserServiceImpl testUserService = new TestUserService(users.get(3).getId());
		testUserService.setUserDao(this.userDao);
		testUserService.setMailSender(mailSender);
		
		//testUserService.setTransactionManager(transactionManager);
		UserServiceTX txUserService  = new UserServiceTX();
		txUserService.setTransactionManager(transactionManager);
		txUserService.setUserService(txUserService);
		
		userDao.deleteAll();
		
		for (User user : users) userDao.add(user);
		try{
			testUserService.upgradeLevels();
			fail("TestUserServiceException expected");
		}catch(TestUserServiceException e){
			throw e;
		}
		
		checkLevelUpgraded(users.get(1), false);
		testUserService.setMailSender(mailSender);
	}
	
	static class MockMailSender implements MailSender{
		
		private List<String> requests = new ArrayList<String>();
		
		/**
		 * @return the requests
		 */
		public List<String> getRequests() {
			return requests;
		}

		@Override
		public void send(SimpleMailMessage arg0) throws MailException {
			// TODO Auto-generated method stub
			requests.add(arg0.getTo()[0]);
		}

		@Override
		public void send(SimpleMailMessage[] arg0) throws MailException {
			// TODO Auto-generated method stub
			
		}
		
	}

}