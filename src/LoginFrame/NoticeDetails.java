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
public class NoticeDetails {
    private String nid,notice,dep;
    MyDBConnector mdc = new MyDBConnector();
    Connection con = getConnection();
    Statement stmt;
    
    NoticeDetails(String nid,String dep,String notice){
        this.nid=nid;
        this.dep=dep;
        this.notice=notice;
    }
    
    NoticeDetails(String nid){
        this.nid=nid;
    }
    
    private Connection getConnection() {
        Connection myConn = mdc.getMyConnection();
        return myConn;
    }
    
    public String validateNoticeCreate(){
        if("".equals(nid)){
           return "Notice ID is empty";
       }else if("".equals(notice)){
           return "Notice is empty";
       }else {
           return insertData();
       }
        
    }
    
    private String insertData(){
        int row=0;
        String myStatement;
        myStatement="Select * from notice where notice_id=\""+nid+"\"";
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
            myStatement="INSERT INTO notice values (\""+nid+"\",\""+notice+"\",\""+dep+"\",0)";
                try {
                    stmt = con.createStatement();
                int check = stmt.executeUpdate(myStatement);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
         
            return "notice Created";
            }
        
    }
    
    public String validateNoticeDelete(){
        if("".equals(nid)){
           return "Notice ID is empty";
       }else {
           return deleteData();
       }
        
    }
    
    private String deleteData(){
        int row=0;
        String myStatement;
        myStatement="Select * from notice where notice_id=\""+nid+"\"";
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
                return "ID does not Exist";
            }else{
            myStatement="update notice set is_delete=1 where notice_id=\""+nid+"\"";
                try {
                    stmt = con.createStatement();
                int check = stmt.executeUpdate(myStatement);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
         
            return "notice Deleted";
            }
    }
}
