﻿package view.admin;

public class displayvalueModel {
    public  Object displayMember;
    public  Object displayvalue;
 public displayvalueModel() {
   
    }
    public displayvalueModel(Object displayMember, Object displayvalue) {
        this.displayMember = displayMember;
        this.displayvalue = displayvalue;
    }
    @Override
    public String toString(){
        String displayMember = null;
        try {
          displayMember = this.displayMember.toString();
        }catch (Exception e){
            System.out.println("lỗi click");
            e.printStackTrace();
        }
        return displayMember;
    }

}
