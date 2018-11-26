package model.dao;

<<<<<<< HEAD
import java.sql.ResultSet;
import java.sql.SQLException;

import controlller.Manager;

public class LoginDAO {

	public boolean checkLogin(String username, String password) {
		String sql = "SELECT * FROM quanlysanpham.users WHERE TenDangNhap = '" + username + "' AND PassWord ='"
				+ password + "'";
		System.out.println(sql);
		ResultSet rs = Manager.connection.excuteQuerySelect(sql);

		try {
			if (rs.next()) {
				return true;
			}
		} catch (SQLException ex) {
			System.out.println("lỗi đăng nhập");
		}
		return false;
	}
	
=======
public class LoginDAO {

>>>>>>> bbd302b8e0cd23a7ae1e86310326fdcd0654a2c3
}
