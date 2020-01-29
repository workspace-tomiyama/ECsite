package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class ItemListDeleteCompleteDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	public int delete() throws SQLException {
		String sql = "delete from item_info_transaction";

		int result = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			result = ps.executeUpdate();
		} finally {
			con.close();
		}

		return result;
	}

}
