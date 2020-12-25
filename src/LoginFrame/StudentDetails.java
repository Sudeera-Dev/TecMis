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
import javax.swing.JOptionPane;

/**
 *
 * @author KrzYoFreaK
 */
public class StudentDetails {
    private String uname;
    
    private String fname,lname,address,contact;
    
    MyDBConnector mdc = new MyDBConnector();
    Connection con = mdc.getMyConnection();
    Statement stmt;

    StudentDetails(String fname, String lname, String address, String contact){
         this.fname = fname;
         this.lname = lname;
         this.address=address;
         this.contact=contact;
         uname=LoginTest.uid;
        
    
    }
    
    
    
    StudentDetails(){
           uname=LoginTest.uid;
     }   
    
    
    public String setName(){
        String myStatement="Select * from student where stu_id=\""+uname+"\"";
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
    public String setMail(){
        
        String sql="SELECT * FROM student WHERE stu_id=\""+uname+"\"";
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
    public String setAdd(){
        
        String sql="SELECT * FROM student WHERE stu_id=\""+uname+"\"";
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
    
        public String setCont(){
        
            String sql="SELECT * FROM student WHERE stu_id=\""+uname+"\"";
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
        
            String sql="SELECT * FROM student WHERE stu_id=\""+uname+"\"";
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
        
        
    public String updateData(){
        
        String sql = "UPDATE student SET f_name=\""+fname+"\",l_name=\""+lname+"\",address=\""+address+"\",mobile_no=\""+contact+"\" WHERE stu_id=\""+uname+"\"";
        try {
            stmt = con.createStatement();
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Updated SuccsesFully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(TechOfficerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        return null;
    
    
    } 
}
