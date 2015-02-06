package springbook.user.service;

import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import springbook.user.dao.UserDao;
import springbook.user.domain.Level;
import springbook.user.domain.User;
 

public class UserServiceImpl implements UserService{
	public static final int MIN_LOGCOUNT_FOR_SILVER = 50;
	public static final int MIN_RECOMMENT_FOR_GOLD = 30;
	
	UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}	
/*	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
	}
	*/
	
/*	private PlatformTransactionManager transactionManager;	
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}*/

	private MailSender mailSender;
 
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

/*	public void upgradeLevels(){		
//		PlatformTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);		
		TransactionStatus status =  this.transactionManager.getTransaction(new DefaultTransactionDefinition());
		
		try{
			List<User> users = userDao.getAll();		
			for(User user: users){
				if (this.canUpgradeLevel(user)){
					this.upgradeLevel(user);
				}				
			}
			this.upgradeLevelsInternal();			
			this.transactionManager.commit(status);			
		}catch(RuntimeException e){
			this.transactionManager.rollback(status);
		}		
	 Boolean chklevel = null;
	    for(User user : users){
			if (user.getLevel()==Level.BASIC && user.getLogin() >= 50){
				chklevel = true;
				user.setLevel(Level.SILVER);
			}
			else if(user.getLevel() == Level.SILVER && user.getRecommend() >= 30){
				chklevel = true;
				user.setLevel(Level.GOLD);					
			}
			else if(user.getLevel() == Level.GOLD ) {chklevel = false;}
			else{chklevel = false;}
			
			if (chklevel) userDao.update(user);
		}
	}
	*/
/*	private void upgradeLevelsInternal(){
		
		List<User> users = userDao.getAll();
		
		for(User user: users){
			if (this.canUpgradeLevel(user)){
				this.upgradeLevel(user);
			}				
		}
	}*/
	public void upgradeLevels(){
		
		List<User> users = userDao.getAll();
		
		for(User user: users){
			if (this.canUpgradeLevel(user)){
				this.upgradeLevel(user);
			}				
		}
	}
	
	private boolean canUpgradeLevel(User user){
		Level currentLevel = user.getLevel();
		switch(currentLevel){
			case BASIC: return(user.getLogin() >= MIN_LOGCOUNT_FOR_SILVER);
			case SILVER: return(user.getRecommend() >= MIN_RECOMMENT_FOR_GOLD);
			case GOLD: return false;
			default: throw new IllegalArgumentException("Uknown Level:"+currentLevel);
		}		
	}
	
	protected void upgradeLevel(User user){
//		if (user.getLevel() == Level.BASIC) user.setLevel(Level.SILVER);
//		else if (user.getLevel() == Level.SILVER) user.setLevel(Level.GOLD);
		user.upgradeLevel();
		userDao.update(user);
//		this.sendUpgradeEMail(user);
		this.sendUpEmail(user);
		
	}
	
	private void sendUpgradeEMail(User user){
		
		Properties props = new Properties();
	    props.put("mail.smtp.host", "disc.co.kr");
	    props.put("mail.from", "pyh0801@disc.co.kr");
	    Session session = Session.getInstance(props, null);

	    try {
	        MimeMessage msg = new MimeMessage(session);
	        msg.setFrom();
	        msg.setRecipients(Message.RecipientType.TO,"twinspark81@gmail.com");
	        msg.setSubject("JavaMail hello world example");
	        msg.setSentDate(new Date());
	        msg.setText("Hello, world!\n");
	        Transport.send(msg);
	    } catch (MessagingException mex) {
	        System.out.println("send failed, exception: " + mex);
	    }
		
	}
	
	private void sendUpEmail(User user){
		//JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		//mailSender.setHost("disc.co.kr");
		
		SimpleMailMessage mailMessage = new SimpleMailMessage();
//		mailMessage.setTo("twinspark81@gmail.com");
		mailMessage.setTo(user.getEmail());
		
		mailMessage.setFrom("pyh0801@disc.co.kr");
		mailMessage.setSubject("aaa");
		mailMessage.setText("사용자님의 등급이" + user.getLevel().name());
		
		mailSender.send(mailMessage);
	}
	
	public void add(User user){
		if (user.getLevel()==null)  user.setLevel(Level.BASIC);
		userDao.add(user);
	}

}