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
public class MedicalDetails {
    private String dep,cid,sid,date,type,stat;
    MyDBConnector mdc = new MyDBConnector();
    Connection con = getConnection();
    Statement stmt;
    
    MedicalDetails(String dep,String cid,String sid,String type){
        this.dep=dep;
        this.cid=cid;
        this.sid=sid;
        this.type=type;
    }
    
    MedicalDetails(String dep,String cid,String type){
        this.dep=dep;
        this.cid=cid;
        this.type=type;
    }
    
    private Connection getConnection() {
        Connection myConn = mdc.getMyConnection();
        return myConn;
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
        
        myStatement="select * from medical where stu_id=\""+sid+"\" and c_id=\""+dep+cid+"\" and is_delete=0";

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

            myStatement="select * from "+dep.toLowerCase()+"_"+cid+"_attendance where session_type=\""+type+"\" and attendance_status=1 and is_delete=0";

            try {
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(myStatement);

                while(rs.next()){
                    came += 1;
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
               
            myStatement="select * from medical where c_id=\""+dep+cid+"\" and is_delete=0";

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
