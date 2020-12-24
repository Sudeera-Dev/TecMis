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
public class AdminDetails {
    private String uid,dep,role,pass,pass1;
    MyDBConnector mdc = new MyDBConnector();
    Connection con = getConnection();
    Statement stmt;
    
    AdminDetails(String uid,String dep,String role,String pass,String pass1){
        this.uid = uid;
        this.dep = dep;
        this.role = role;
        this.pass = pass;
        this.pass1 = pass1;
    }
    AdminDetails(String uid,String role){
        this.uid = uid;
        this.role = role;
    }
    private Connection getConnection() {
        Connection myConn = mdc.getMyConnection();
        return myConn;
    }
    
    public String validateTextCreate(){
 
       if("".equals(uid)){
           return "ID is empty";
       }else if("".equals(pass)){
           return "Password is empty";
       }else if(!pass1.equals(pass)){
           return "Password doesn't match";
       }else {
           return insertData(uid,dep,role,pass);
       }     
    }

    private String insertData(String uid,String dep,String role,String pass){
        int row=0;
        String myStatement;
        
        if("STUDENT".equals(role)){
            
            myStatement="Select * from student where stu_id=\""+uid+"\"";
            try {
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(myStatement);
            
                while(rs.next()){
                    row += 1;
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(row==1){
                return "ID already Exist";
            }else{
            myStatement="INSERT INTO student (stu_id,password,dep_id,is_delete) values (\""+uid+"\",\""+pass+"\",\""+dep+"\",0)";
                try {
                    stmt = con.createStatement();
                int check = stmt.executeUpdate(myStatement);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
         
            return "user Successfully Created";
            }
        }else{
            myStatement="Select * from staff where emp_id=\""+uid+"\"";
            try {
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(myStatement);
            
                while(rs.next()){
                    row += 1;
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(row==1){
                return "ID already Exist";
            }else{
            myStatement="INSERT INTO staff (emp_id,password,dep_id,job_role,is_delete) values (\""+uid+"\",\""+pass+"\",\""+dep+"\",\""+role+"\",0)";
                try {
                    stmt = con.createStatement();
                int check = stmt.executeUpdate(myStatement);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
         
            return "user Successfully Created";
            }
        }
        
    }
    
    public String validateText(){
        
        if (" ".equals(uid)){
            return "ID is empty";
        }else{
            return deleteUser();
        }
        
    }
    
    private String deleteUser(){
        
        int row=0;
        String myStatement;
        
        if("STUDENT".equals(role)){
            
            myStatement="Select * from student where stu_id=\""+uid+"\"";
            try {
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(myStatement);
            
                while(rs.next()){
                    row += 1;
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(row!=1){
                return "ID not found";
            }else{
            myStatement="update student set is_delete=1 where stu_id=\""+uid+"\"";
                try {
                    stmt = con.createStatement();
                int check = stmt.executeUpdate(myStatement);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
         
            return "user Deleted";
            }
        }else{
            myStatement="Select * from staff where emp_id=\""+uid+"\"";
            try {
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(myStatement);
            
                while(rs.next()){
                    row += 1;
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(row !=1){
                return "ID not found";
            }else{
            myStatement="update staff set is_delete=1 where emp_id=\""+uid+"\"";
                try {
                    stmt = con.createStatement();
                int check = stmt.executeUpdate(myStatement);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
         
            return "user Deleted";
            }
        }
        
    }
    
}
