package springbook.user.service;

import springbook.user.domain.User;

public class TestUserService extends UserServiceImpl {
	private String id;
	
	TestUserService(String id){
		this.id = id;
	}
	
	@Override
	protected void upgradeLevel(User user) {
		// TODO Auto-generated method stub
		if(user.getId().equals(this.id)) throw new TestUserServiceException();
		super.upgradeLevel(user);
	}

	static class TestUserServiceException extends RuntimeException{
		
	}
}
