package springbook.user.learningtest.junit;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import static org.junit.matchers.JUnitMatchers.hasItem;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="jUnit.xml")
public class JunitTest {
	
	@Autowired
	ApplicationContext context;
	
	static Set<JunitTest> testObject =  new HashSet<JunitTest>();
	static ApplicationContext contextObject = null;
	
	@Test
	public void test1(){
		System.out.println("testObject===> "+testObject);
		System.out.println("contextObject===> "+contextObject);
		assertThat(testObject,not(hasItem(this)));
		testObject.add(this);
		
		System.out.println("testObject===> "+testObject);
		System.out.println("contextObject===> "+contextObject);
		
		assertThat(contextObject == null|| contextObject == this.context, is(true));
		contextObject = this.context;
		
		System.out.println("testObject===> "+testObject);
		System.out.println("contextObject===> "+contextObject);		
	}
	
	
	@Test
	public void test2(){
		
	}

}
