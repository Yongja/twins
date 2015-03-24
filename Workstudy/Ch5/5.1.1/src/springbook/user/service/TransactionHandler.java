package springbook.user.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class TransactionHandler implements InvocationHandler {
	private Object target;
	private PlatformTransactionManager transactionManager;
	private String pattern;
	
	
	/**
	 * @param target the target to set
	 */
	public void setTarget(Object target) {
		this.target = target;
	}


	/**
	 * @param transactionManager the transactionManager to set
	 */
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}


	/**
	 * @param pattern the pattern to set
	 */
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		if (method.getName().startsWith(pattern)){
			return invokeTransaction(method, args);
		}else{
			return method.invoke(proxy, args);
		}
	}
	
	public Object invokeTransaction(Method method, Object[] args) throws Throwable{
		TransactionStatus status = this.transactionManager
				.getTransaction(new DefaultTransactionDefinition());
		try {
			Object ret = method.invoke(target, args);
			this.transactionManager.commit(status);
			return ret;
//		} catch (RuntimeException e) {
		} catch (InvocationTargetException e){
			this.transactionManager.rollback(status);
			throw e.getTargetException();
		}
		
	}

}
