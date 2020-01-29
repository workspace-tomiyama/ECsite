package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserCreateConfirmDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public boolean existUser(String loginUserId) throws SQLException {
		boolean result = false;

		String sql = "SELECT COUNT(*) AS COUNT FROM login_user_transaction WHERE login_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				if (rs.getInt("count") > 0) {
					result = true;
				}
			}
		} finally {
			con.close();
		}
		return result;
	}

}
