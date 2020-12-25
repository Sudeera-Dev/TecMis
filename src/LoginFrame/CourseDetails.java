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
public class CourseDetails {
    private String cid,credit,cName,cLec,cDep;
    MyDBConnector mdc = new MyDBConnector();
    Connection con = getConnection();
    Statement stmt;
    
    CourseDetails(String cid,String credit,String cName,String cLec,String cDep){
        this.cid=cid;
        this.credit=credit;
        this.cName=cName;
        this.cLec=cLec;
        this.cDep=cDep;
    }
    
    CourseDetails(String cid){
        this.cid=cid;
    }
    
    private Connection getConnection() {
        Connection myConn = mdc.getMyConnection();
        return myConn;
    }
    
    public String validateCourseCreate(){
        
        if("".equals(cid)){
            return "Course id is Empty";
        }else if("".equals(cName)){
             return "Course Name is Empty";
        }else if("".equals(cLec)){
            return "Lecture Incharge is Empty";
        }else{
            return insertCourse();
        }
    }
    
    private String insertCourse(){
        int row=0;
        String myStatement;
        
        myStatement="Select * from course_module where c_id=\""+cid+"\"";
        
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
        }
        myStatement="Select * from staff where emp_id=\""+cLec+"\"";
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
            return "No Lecturer found";
        } else {
            myStatement="insert into course_module values (\""+cid+"\",\""+cName+"\","+credit+",\""+cLec+"\",\""+cDep+"\",0)";
            try {
                    stmt = con.createStatement();
                int check = stmt.executeUpdate(myStatement);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
         
            return "Course Successfully Created";
        }
        
    }
 
    public String validateCourse(){
        int row=0;
        String myStatement;
        if("".equals(cid)){
            return "Course ID is empty";
        }else{
            myStatement="Select * from course_module where c_id=\""+cid+"\"";
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
            return "No Course found";
        }else{
            myStatement="update course_module set is_delete=1 where c_id=\""+cid+"\"";
            try {
                    stmt = con.createStatement();
                int check = stmt.executeUpdate(myStatement);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
            return "Course Deletd";
        }
            
        }
        
    }
    
}
