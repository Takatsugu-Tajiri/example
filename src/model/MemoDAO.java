package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemoDAO {
	static final String URL = "jdbc:mysql://localhost/memo?useSSL=false";
	static final String USER = "java";
	static final String PASS = "Pass";

	public ArrayList<Memo> findAll() {
		ArrayList<Memo> mlist = new ArrayList<>();

		try (Connection con = DriverManager.getConnection(URL, USER, PASS);) {

			String sql = "SELECT*FROM memo";
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int mid = rs.getInt("mid");
				String title = rs.getString("title");
				String body = rs.getString("body");

				Memo m= new Memo(mid,title,body);
				mlist.add(m);
			}

			stmt.close();

		} catch (SQLException e) {
			System.out.println("findAllエラー" + e.getMessage());
		}
		return mlist;
	}

}
