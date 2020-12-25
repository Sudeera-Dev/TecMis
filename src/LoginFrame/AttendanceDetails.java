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
class AttendanceDetails {
    private String dep,cid,sid,date,type,stat;
    MyDBConnector mdc = new MyDBConnector();
    Connection con = getConnection();
    Statement stmt;
    
    AttendanceDetails(String dep,String cid,String sid,String date,String type,String stat){
        this.dep=dep;
        this.cid=cid;
        this.sid=sid;
        this.date=date;
        this.type=type;
        this.stat=stat;
    }
    
    AttendanceDetails(String dep,String cid,String sid,String type){
        this.dep=dep;
        this.cid=cid;
        this.sid=sid;
        this.type=type;
    }
    
    AttendanceDetails(String dep,String cid,String type){
        this.dep=dep;
        this.cid=cid;
        this.type=type;
    }
    
    private Connection getConnection() {
        Connection myConn = mdc.getMyConnection();
        return myConn;
    }
    
    public String addAttendance(){
        int row=0;
        String myStatement;
        
        myStatement="Select * from student where stu_id=\""+sid+"\"";
        
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
            return "student id does not Exist";
        }
        
        String course=dep+cid;
        
        myStatement="Select * from course_module where dep_id=\""+course+"\"";
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
        } else {
            myStatement="insert into "+dep.toLowerCase()+"_"+cid+"_attendance (stu_id,date,session_type,attendance_status) values (\""+sid+"\",\""+date+"\",\""+type+"\","+stat+")";
            
            try {
                    stmt = con.createStatement();
                int check = stmt.executeUpdate(myStatement);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
         
            return "Record added";
        }
        
    }
    
    public float summeryAttendanceIndividual(){
        int all=0,came=0;
        float summery;
        String myStatement;
        myStatement="select * from "+dep.toLowerCase()+"_"+cid+"_attendance where stu_id=\""+sid+"\" and session_type=\""+type+"\" and is_delete=0";
        
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myStatement);
            
            while(rs.next()){
                all += 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        myStatement="select * from "+dep.toLowerCase()+"_"+cid+"_attendance where stu_id=\""+sid+"\" and session_type=\""+type+"\" and attendance_status=1 and is_delete=0";
        
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myStatement);
            
            while(rs.next()){
                came += 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        summery=(came*100)/all;
        
        return summery;
            
    }
    
    public float summeryAttendanceCource(){
        int all=0,came=0;
        float summery;
        String myStatement;
        myStatement="select * from "+dep.toLowerCase()+"_"+cid+"_attendance where session_type=\""+type+"\" and is_delete=0";
        
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myStatement);
            
            while(rs.next()){
                all += 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        myStatement="select * from "+dep.toLowerCase()+"_"+cid+"_attendance where stu_id=\""+sid+"\" and session_type=\""+type+"\" and attendance_status=1 and is_delete=0";
        
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myStatement);
            
            while(rs.next()){
                came += 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        summery=(came*100)/all;
        
        return summery;
            
    }
    
}
