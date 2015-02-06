package springbook.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import springbook.user.domain.User;

public class AddStatement1111 implements StatementStrategy {
	User user = null;
	
	public	AddStatement1111(User user){
		this.user = user;
	}
	
	public PreparedStatement makePreparedStatement(Connection conn)
			throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement ps = conn.prepareStatement("insert into users(id, name, password) values(?,?,?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
			
		return ps;
	}

}