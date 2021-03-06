package springbook.learningtest.templete;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	Calculator calculator;
	int sum = 0;
	
	String filePathName = null;
	
	@Before
	public void setUp(){
		this.calculator = new Calculator();
		filePathName = getClass().getResource("numbers.txt").getPath();
	}
	
	@Test
	public void test() throws IOException {
		sum = calculator.calcSum(filePathName);
		assertThat(sum , is(21));
	//	fail("Not yet implemented");
	}
	
	@Test 
	public void multiplyOfNumbers() throws IOException {
		assertThat(calculator.calcMultiply(this.filePathName) , is(720));
	}
	
	@Test 
	
	public void concatenateTest() throws IOException {
		
		assertThat(calculator.concatenate(this.filePathName), is("123456"));
	}

}
