/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginFrame;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KrzYoFreaK
 */
public class LectureDetails {
    private String uname;
    
    MyDBConnector mdc = new MyDBConnector();
    Connection con = getConnection();
    Statement stmt;

    private Connection getConnection() {
       Connection myConn = mdc.getMyConnection();
        return myConn;
    }
    LectureDetails(){
          uname=LoginTest.uid;
    }
    
    public String setName(){
        String myStatement="Select * from staff where emp_id=\""+uname+"\"";
        String fname="",lname="";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myStatement);
            while(rs.next()){
                    fname=rs.getString("f_name");
                    lname=rs.getString("l_name");
                }
            return fname+" "+lname;
        } catch (SQLException ex) {
            Logger.getLogger(TechOfficerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public String setEmail(){
        
        String sql="SELECT * FROM staff WHERE emp_id=\""+uname+"\"";
        String mail="";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                mail=rs.getString("email");
            }
            return mail;
        } catch (SQLException ex) {
            Logger.getLogger(TechOfficerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
      }
    public String setAddress(){
        
        String sql="SELECT * FROM staff WHERE emp_id=\""+uname+"\"";
        String add="";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                add=rs.getString("address");
            }
            return add;
        } catch (SQLException ex) {
            Logger.getLogger(TechOfficerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
      }  
        public String setContact(){
        
        String sql="SELECT * FROM staff WHERE emp_id=\""+uname+"\"";
        String cont="";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                cont=rs.getString("mobile_no");
            }
            return cont;
        } catch (SQLException ex) {
            Logger.getLogger(TechOfficerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
      }

        public String setDept(){
        
        String sql="SELECT * FROM staff WHERE emp_id=\""+uname+"\"";
        String dept="";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                dept=rs.getString("dep_id");
            }
            return dept;
        } catch (SQLException ex) {
            Logger.getLogger(TechOfficerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
      }

        public String setDept1(){
        
        String sql="SELECT * FROM course_module WHERE lec_incharge=\""+uname+"\"";
        String dept="";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                dept=rs.getString("c_name");
            }
            return dept;
        } catch (SQLException ex) {
            Logger.getLogger(TechOfficerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
      }        
        
    
    
}
