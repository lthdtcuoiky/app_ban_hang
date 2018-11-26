package model.bo;

<<<<<<< HEAD
import model.dao.LoginDAO;

public class LoginBO {
	private LoginDAO loginDAO;

	public boolean checkLogin(String username, String password) {
		loginDAO = new LoginDAO();
		return loginDAO.checkLogin(username,password);
=======
public class LoginBO {
	public void checkLogin() {
		
>>>>>>> bbd302b8e0cd23a7ae1e86310326fdcd0654a2c3
	}
}
