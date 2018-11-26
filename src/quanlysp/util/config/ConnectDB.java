<<<<<<< HEAD
package util.config;
=======
package quanlysp.util.config;
>>>>>>> bbd302b8e0cd23a7ae1e86310326fdcd0654a2c3

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
<<<<<<< HEAD
	private static String url = "jdbc:mysql://localhost:3306/quanlysanpham?seUnicode=true&characterEncoding=utf-8";
=======
	private static String url = "jdbc:mysql://localhost:3306/quanlysanpham";
>>>>>>> bbd302b8e0cd23a7ae1e86310326fdcd0654a2c3
	private static String user = "root";
	private static String password = "";
	private static Connection connect = null;
	private static PreparedStatement ps;

	static {
		try {
			initConnection();
		} catch (ClassNotFoundException e) {
			System.out.println("lỗi khởi tạo Driver MySQL");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("lỗi khởi tạo kết nối MySQL");
			e.printStackTrace();
		}
	}

	private static void initConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		connect = DriverManager.getConnection(url, user, password);
		System.out.println("Kết nối thành công");
	}

	public static Connection getConnection() {
		return connect;
	}

	// Thực thi câu lệnh SELECT
	public ResultSet excuteQuerySelect(String sql) {
		try {
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
<<<<<<< HEAD
			System.out.println("truy vấn select thành công");
			return rs;
		} catch (SQLException e) {
			System.out.println("Truy vấn select thất bại");
=======
			System.out.println("truy vấn thành công");
			return rs;
		} catch (SQLException e) {
			System.out.println("Truy vấn thất bại");
>>>>>>> bbd302b8e0cd23a7ae1e86310326fdcd0654a2c3
			e.printStackTrace();

		}

		return null;
	}

	// Thực thi INSERT, DELETE, UPDATE
	public void excuteQueryUpdate(String sql) {

		try {
			Statement stmt = connect.createStatement();
			stmt.executeUpdate(sql);
<<<<<<< HEAD
			System.out.println("truy vấn thành công");
=======
>>>>>>> bbd302b8e0cd23a7ae1e86310326fdcd0654a2c3
		} catch (SQLException e) {
			System.out.println("Truy vấn thất bại");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ConnectDB();
	}
}
