/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginFrame;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Yohan
 */
public class TechMedicalDetails {
   
    private String ref,cid,sid,date,edate,time,stat;
  
    
    MyDBConnector mdc = new MyDBConnector();
    Connection con = getConnection();
    Statement stmt;

    private Connection getConnection() {
        Connection myConn = mdc.getMyConnection();
        return myConn;
    }
    
    TechMedicalDetails(String ref, String cid, String sid, String date,String edate,String time,String stat){
        this.ref = ref;
        this.cid = cid;
        this.sid = sid;
        this.date = date;
        this.edate = edate;
        this.time = time;
        this.stat = stat;
       
        
        
    }
    
         
     
    
    public String AddDate(){
        String sql =  "INSERT INTO medical(ref_id, stu_id, date, c_id, end_date, time, status) VALUES (\""+ref+"\" ,\""+sid+"\",\""+date+"\",\""+cid+"\",\""+edate+"\",\""+time+"\",\""+stat+"\")";
        
        try {
            stmt = con.createStatement();
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Inserted SuccsesFully");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(TechMedicalDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
