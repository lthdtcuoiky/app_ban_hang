<<<<<<< HEAD
package controlller;

import model.bo.LoginBO;
import view.admin.ViewDangNhap;

public class LoginController {
	private LoginBO loginBO;
	private ViewDangNhap loginView;
	
	public LoginController() {
		super();
		this.loginBO = new LoginBO();
=======
package quanlysp.controlller;

import model.bo.LoginBO;
import model.dao.LoginDAO;
import quanlysp.view.admin.ViewDangNhap;


public class LoginController {
	// Duy mặt lòn
	private LoginDAO loginDAO;
	private LoginBO loginBO;
	private ViewDangNhap loginView;
	public LoginDAO getLoginDAO() {
		return loginDAO;
	}
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
>>>>>>> bbd302b8e0cd23a7ae1e86310326fdcd0654a2c3
	}
	public LoginBO getLoginBO() {
		return loginBO;
	}
	public void setLoginBO(LoginBO loginBO) {
		this.loginBO = loginBO;
	}
<<<<<<< HEAD
	public boolean checkLogin(String username, String password) {
		return loginBO.checkLogin(username, password);
=======
	public void checkLogin() {
		
>>>>>>> bbd302b8e0cd23a7ae1e86310326fdcd0654a2c3
	}
}
