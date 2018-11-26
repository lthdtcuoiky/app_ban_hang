package quanlysp.controlller;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import quanlysp.util.config.ConnectDB;

import quanlysp.view.admin.ViewDangNhap;
import quanlysp.view.admin.ViewTrangChu;


public class Manager {
  public static ViewTrangChu homePage =new ViewTrangChu();
     public static ConnectDB connection = new  ConnectDB ();

    public static void main(String[] args) {
        ViewDangNhap frmDN= new   ViewDangNhap();

        frmDN.show();

    }

    
}
