package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserListDeleteCompleteDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	public int delete() throws SQLException {
		int result = 0;
		String sql = "delete from login_user_transaction where admin_flg !='1'";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			result = ps.executeUpdate();
		} finally {
			con.close();
		}
		return result;
	}

}
