package springbook.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import springbook.user.domain.User;

public class UserTemplateDao {
	
	
/*	
	public void setJdbcContext(JdbcContext jdbcContext) {
		this.jdbcContext = jdbcContext;
	}
*/
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.dataSource = dataSource;
	}
	
	public void add(final User user) throws SQLException {

//		jdbcTemplate.update(new PreparedStatementCreator() {
//			
//			@Override
//			public PreparedStatement createPreparedStatement(Connection conn)
//					throws SQLException {
//				// TODO Auto-generated method stub
//				
//				PreparedStatement ps = conn.prepareStatement("insert into users(id, name, password) values(?,?,?)");
//				ps.setString(1, user.getId());
//				ps.setString(2, user.getName());
//				ps.setString(3, user.getPassword());
//				
//				return ps;
//			}
//		}); 
		
		jdbcTemplate.update("insert into users(id, name, password) values(?,?,?)",user.getId(),user.getName(),user.getPassword());
		
//		jdbcContext.workWithStatementStrategy(new StatementStrategy() {				
//			@Override
//			public PreparedStatement makePreparedStatement(Connection conn)
//					throws SQLException {
//				// TODO Auto-generated method stub
//				
//				PreparedStatement ps = conn.prepareStatement("insert into users(id, name, password) values(?,?,?)");
//				ps.setString(1, user.getId());
//				ps.setString(2, user.getName());
//				ps.setString(3, user.getPassword());
//					
//				return ps;
//				}
//			}
//				
//		);
	}

	public User get(String id) throws SQLException {

		
		/*Connection c = this.dataSource.getConnection();
		PreparedStatement ps = c
				.prepareStatement("select id, name, password from users where id = ?");
		ps.setString(1, id);

		ResultSet rs = ps.executeQuery();
		User user = null;
		if(rs.next()){
			 
			user = new User();
			user.setId(rs.getString("id"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
		}
		rs.close();
		ps.close();
		c.close();*/

		return jdbcTemplate.queryForObject("select id, name, password from users where id = ?",new Object[] {id},
				new RowMapper<User>(){
					public User mapRow(ResultSet rs,int rowNum) throws SQLException {
						User user = new User();
						user.setId(rs.getString("id"));
						user.setName(rs.getString("name"));
						user.setPassword(rs.getString("password"));
						return user;
					}
			
				}
		);
		
		
//		if(user==null) throw new EmptyResultDataAccessException(1);
//		return user;
		
		
	}

	public void deleteAll() throws SQLException {
			
		jdbcTemplate.update("delete from users");			

	}	
	
	public int getCount() throws SQLException{
		// 변화지 않는 부분 ---a
//		Connection conn = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		
//		int i = 0;
//		
//		try{
//			conn = this.dataSource.getConnection();
//		// 변화지 않는 부분 -----'a
//		
//	    // 변화는 부분 ----------b
//			String txSql = "select count(*) from users ";
//			ps = conn.prepareStatement(txSql);
//			//ps.setString(1, id);
//			// 변경이 안되는 부분
//			rs = ps.executeQuery();
//			rs.next();
//			i = rs.getInt(1);
//		// 변화는 부분 
//			
//		}catch(SQLException e){
//			
//			throw e;
//			
//		}finally{
//			if(rs!=null){try{rs.close(); }catch(SQLException e){		}			}
//			if(ps!=null){try{	ps.close();	}catch(SQLException e){		}}
//			if(conn != null){try{	conn.close();	}catch(SQLException e){		}	}
//		}		
//		return i;
		
/*		return jdbcTemplate.query(new PreparedStatementCreator() {
			
				@Override
				public PreparedStatement createPreparedStatement(Connection arg0)
						throws SQLException {
					// TODO Auto-generated method stub
					PreparedStatement ps = arg0.prepareStatement("select count(*) from users");
					//ResultSet rs = ps.executeQuery();
					//rs.next();
					
					return ps;
				}
				
			}				
				
			, new ResultSetExtractor<Integer>() {
				public Integer extractData(ResultSet rs) throws SQLException,DataAccessException{
						rs.next();
						return rs.getInt(1);
				}
			} 
			
		);*/
		
		return jdbcTemplate.queryForInt("select count(*) from users");
	}
	
}
