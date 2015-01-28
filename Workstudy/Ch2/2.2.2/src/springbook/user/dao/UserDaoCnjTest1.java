package springbook.user.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.sql.SQLException;

import javax.tools.JavaFileManager.Location;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springbook.user.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class UserDaoCnjTest1 {
	private UserDao dao;
	private User user;
	
	@Autowired
	ApplicationContext context;
	
	@Before
	public void setUp(){
		//ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		System.out.println(this);
		System.out.println(this.context);
		this.dao = context.getBean("userDao", UserDao.class);
		
		this.user = new User("A001","남는자","1111");
		
	}
	
	@Test
	public void testGetSetter() throws SQLException{
/*		user.setId("A001");
		user.setName("남는자");
		user.setPassword("1111");*/
		
		dao.deleateAll(this.user.getId());
		
		assertThat(dao.getCount(this.user.getId()), is(0));
		dao.add(this.user);
		
		User newUser = dao.get(this.user.getId());
		
		assertThat(newUser.getName(), is(this.user.getName()));
		assertThat(newUser.getId(), is(this.user.getId()));
//		assertThat(newUser.getPassword(), is(user.getPassword()));
		//ass
	}
	
	@Test(expected=EmptyResultDataAccessException.class)
	public void testGetCnt() throws SQLException{
		
		dao.deleateAll(this.user.getId());
		assertThat(dao.getCount(this.user.getId()), is(0));
		
		dao.get("unknown_id");
		
	}
}
