package springbook.user.learningtest.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class JUnitTester {
    
	ApplicationContext testContext;
	@Before
	public void setUp() throws Exception {
	
	}

	@Test
	public void test() {
		fail("Not yet implemented");
 
	}

}
