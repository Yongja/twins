package springbook.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteAllStatement1111 implements StatementStrategy {


	public PreparedStatement makePreparedStatement(Connection conn)
			throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = conn.prepareStatement("delete from users");
		
		return ps;
	}

}
