/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controlller.Manager;

/**
 * @author Windows 10 Version 2
 */
public class DangNhap extends JFrame {
	private JButton btnDangNhap;
	private JButton btnĐangKy;
	private JCheckBox chkbNhoMatKhau;
	private JLabel jLabel1;
	private JPanel jPanel1;
	private JRadioButton jRadioButton1;
	private JLabel lblPassword;
	private JLabel lblRegisterTitle;
	private JLabel lblUserName;
	private JPanel pnlCopyright;
	private JPanel pnlRegisterInfo;
	private JPasswordField txtPassword;
	private JTextField txtUserName;
	private String tendangnhap = "", matkhau = "";
	private  String quyen ;
	private String ten = "", user = "";

	public DangNhap() {
		initComponents();
		this.setLocation(300, 200);
		setLocationRelativeTo(null);
		setResizable(false);

		File file = new File("luumk.txt");

		FileReader fileReader;
		try {
			fileReader = new FileReader(file);
			BufferedReader bw = new BufferedReader(fileReader);
			try {
				tendangnhap = bw.readLine();
				matkhau = bw.readLine();
				bw.close();
			} catch (IOException ex) {
				System.out.println("lỗi input file");
				ex.printStackTrace();
			}

		} catch (FileNotFoundException ex) {
			System.out.println("không tìm thấy file lưu mật khẩu\n");
			ex.printStackTrace();
		}

		txtUserName.setText(tendangnhap);
		txtPassword.setText(matkhau);
		if (!"".equals(tendangnhap)) {
			chkbNhoMatKhau.setSelected(rootPaneCheckingEnabled);
			System.out.println("đã lưu mật khẩu\n");
		} else
			System.out.println("đã bỏ checkbox lưu mật khẩu\n");
	}

	private void initComponents() {

		jRadioButton1 = new javax.swing.JRadioButton();
		jPanel1 = new javax.swing.JPanel();
		pnlRegisterInfo = new javax.swing.JPanel();
		lblRegisterTitle = new javax.swing.JLabel();
		lblUserName = new javax.swing.JLabel();
		txtUserName = new javax.swing.JTextField();
		lblPassword = new javax.swing.JLabel();
		txtPassword = new javax.swing.JPasswordField();
		chkbNhoMatKhau = new javax.swing.JCheckBox();
		btnĐangKy = new javax.swing.JButton();
		btnDangNhap = new javax.swing.JButton();
		pnlCopyright = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();

		jRadioButton1.setText("jRadioButton1");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Đăng Nhập Đăng Ký");
		setResizable(false);

		pnlRegisterInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

		lblRegisterTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblRegisterTitle.setForeground(new java.awt.Color(51, 102, 255));
		lblRegisterTitle.setText("QUẢN LÝ CỬA HÀNG");

		lblUserName.setText("Tên đăng nhập");

		lblPassword.setText("Mật khẩu");

		chkbNhoMatKhau.setForeground(new java.awt.Color(102, 153, 255));
		chkbNhoMatKhau.setText("nhớ Mật Khẩu");
		chkbNhoMatKhau.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				chkbNhoMatKhauActionPerformed(evt);
			}
		});

		btnĐangKy.setForeground(new java.awt.Color(255, 153, 51));
		btnĐangKy.setText("Đăng ký");
		btnĐangKy.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent evt) {
				btnĐangKyMouseMoved(evt);
			}
		});
		btnĐangKy.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnĐangKyMouseExited(evt);
			}

			public void mousePressed(java.awt.event.MouseEvent evt) {
				btnĐangKyMousePressed(evt);
			}

			public void mouseReleased(java.awt.event.MouseEvent evt) {
				btnĐangKyMouseReleased(evt);
			}
		});
		btnĐangKy.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnĐangKyActionPerformed(evt);
			}
		});

		btnDangNhap.setForeground(new java.awt.Color(255, 153, 51));
		btnDangNhap.setText("Đăng Nhập");
		btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDangNhapActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout pnlRegisterInfoLayout = new javax.swing.GroupLayout(pnlRegisterInfo);
		pnlRegisterInfo.setLayout(pnlRegisterInfoLayout);
		pnlRegisterInfoLayout.setHorizontalGroup(pnlRegisterInfoLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlRegisterInfoLayout.createSequentialGroup().addGap(29, 29, 29)
						.addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING))
						.addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pnlRegisterInfoLayout.createSequentialGroup().addGap(29, 29, 29)
										.addGroup(pnlRegisterInfoLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtUserName).addComponent(txtPassword)
												.addGroup(pnlRegisterInfoLayout.createSequentialGroup()
														.addComponent(chkbNhoMatKhau,
																javax.swing.GroupLayout.PREFERRED_SIZE, 154,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE))
												.addGroup(pnlRegisterInfoLayout.createSequentialGroup()
														.addComponent(btnĐangKy, javax.swing.GroupLayout.PREFERRED_SIZE,
																94, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(btnDangNhap,
																javax.swing.GroupLayout.PREFERRED_SIZE, 98,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(33, 33, 33))
								.addGroup(pnlRegisterInfoLayout.createSequentialGroup().addGap(14, 14, 14)
										.addComponent(lblRegisterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 159,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		pnlRegisterInfoLayout.setVerticalGroup(pnlRegisterInfoLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlRegisterInfoLayout.createSequentialGroup().addGap(6, 6, 6).addComponent(lblRegisterTitle)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUserName))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPassword))
						.addGap(18, 18, 18).addComponent(chkbNhoMatKhau)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnĐangKy).addComponent(btnDangNhap))
						.addGap(31, 31, 31)));

		pnlCopyright.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));

		jLabel1.setText("liên Hệ admin để được cấp quyền truy cập cao hơn");

		javax.swing.GroupLayout pnlCopyrightLayout = new javax.swing.GroupLayout(pnlCopyright);
		pnlCopyright.setLayout(pnlCopyrightLayout);
		pnlCopyrightLayout
				.setHorizontalGroup(pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(pnlCopyrightLayout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
								.addContainerGap(24, Short.MAX_VALUE)));
		pnlCopyrightLayout
				.setVerticalGroup(pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(pnlCopyrightLayout.createSequentialGroup().addContainerGap()
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(pnlRegisterInfo, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pnlCopyright, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(52, 52, 52)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
								.addComponent(pnlRegisterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 177,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(pnlCopyright, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void btnĐangKyActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnĐangKyActionPerformed

		ViewDangKy signUpView = new ViewDangKy();
		signUpView.show();
		this.dispose();
	}// GEN-LAST:event_btnĐangKyActionPerformed

	private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDangNhapActionPerformed

		String strUsername = txtUserName.getText().trim();
		String strPassword = String.valueOf(txtPassword.getPassword()).trim();

		String luumk = "", luutdn = "";
		if (chkbNhoMatKhau.isSelected()) {
			luutdn = strUsername;
			luumk = strPassword;
			System.out.println("lưu mật khẩu");
		} else {
			luutdn = "";
			luumk = "";
			System.out.println("không lưu mật khẩu");
		}
		try {
			File file = new File("luumk.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(luutdn + "\n" + luumk);
			bw.close();
			if (chkbNhoMatKhau.isSelected())
				System.out.println("lưu phiên đăng nhập thành công");
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (KiemTra(strUsername, strPassword) == true) {
			ViewDangKy viewDangKy = new ViewDangKy();
			Manager.homePage.show();
			this.dispose();
		} else {
			ThongBao("Bạn nhập sai tài khoản hoặc mật khẩu", "Lỗi đăng nhập", 2);
		}
	}// GEN-LAST:event_btnDangNhapActionPerformed

	private boolean KiemTra(String username, String password) {
		boolean result = false;
		String sql = "SELECT * FROM app_ban_hang.tai_khoan WHERE username = '" + username + "' AND password ='"
				+ password + "'";
		System.out.println(sql);
		ResultSet rs = Manager.connection.excuteQuerySelect(sql);

		try {
			if (rs.next()) {
				result = true;
			}
		} catch (SQLException ex) {
			System.out.println("lỗi đăng nhập");
		}

		return result;
	}

	private void chkbNhoMatKhauActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_chkbNhoMatKhauActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_chkbNhoMatKhauActionPerformed

	private void btnĐangKyMouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnĐangKyMouseReleased

	}// GEN-LAST:event_btnĐangKyMouseReleased

	private void btnĐangKyMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnĐangKyMousePressed

	}// GEN-LAST:event_btnĐangKyMousePressed

	private void btnĐangKyMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnĐangKyMouseExited

	}// GEN-LAST:event_btnĐangKyMouseExited

	private void btnĐangKyMouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnĐangKyMouseMoved

	}// GEN-LAST:event_btnĐangKyMouseMoved

	private boolean KiemTraChuaChuVaSo(String chuoiCanKiemTra) {
		boolean ketQua = false;
		Pattern p = Pattern.compile(".*[a-zA-Z].*");
		Matcher m = p.matcher(chuoiCanKiemTra);
		if (!(chuoiCanKiemTra == chuoiCanKiemTra.toLowerCase())) {
			ketQua = m.find();
		}
		return ketQua;
	}

	public static void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
		JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao, tieuDeThongBao, icon);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DangNhap().setVisible(true);
			}
		});
	}
}
