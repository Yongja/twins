package springbook.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;

import springbook.user.domain.User;

public class UserDao {
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void add(User user) throws SQLException {
		Connection c = this.dataSource.getConnection();

		PreparedStatement ps = c.prepareStatement(
			"insert into users(id, name, password) values(?,?,?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());

		ps.executeUpdate();

		ps.close();
		c.close();
	}

	public User get(String id) throws SQLException {
		Connection c = this.dataSource.getConnection();
		PreparedStatement ps = c
				.prepareStatement("select * from users where id = ?");
		ps.setString(1, id);

		ResultSet rs = ps.executeQuery();
		User user = null;
		if(rs.next()){
			//rs.next();
			user = new User();
			user.setId(rs.getString("id"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
		}
		rs.close();
		ps.close();
		c.close();

		if(user==null) throw new EmptyResultDataAccessException(1);
		return user;
		
		
	}

	public void deleateAll(String id) throws SQLException {
		Connection conn = this.dataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("delete from users where id = ?");
		ps.setString(1, id);
		ps.executeUpdate();
		
		ps.close();
		conn.close();
		
	}
	
	public int getCount(String id) throws SQLException{
		Connection conn = this.dataSource.getConnection();
		int i = 0;
		String txSql = "select count(*) from users where id = ?";
		PreparedStatement ps = conn.prepareStatement(txSql);
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		i = rs.getInt(1);
		rs.close();
		ps.close();
		conn.close();
		
		return i;
	}
	

}
