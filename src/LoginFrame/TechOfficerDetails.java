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
 * @author KrzYoFreaK
 */
public class TechOfficerDetails {
    private String uname;
    private String fname,lname,address,contact;
    
    MyDBConnector mdc = new MyDBConnector();
    Connection con = getConnection();
    Statement stmt;

    TechOfficerDetails(String fname, String lname, String address, String contact) {
         //To change body of generated methods, choose Tools | Templates.
         this.fname = fname;
         this.lname = lname;
         this.address=address;
         this.contact=contact;
         uname=LoginTest.uid;
         
    }
     private Connection getConnection() {
        Connection myConn = mdc.getMyConnection();
        return myConn;
    }
     
    public String updateData(){
        
        String sql =  "UPDATE staff SET f_name=\""+fname+"\",l_name=\""+lname+"\",address=\""+address+"\",mobile_no=\""+contact+"\" WHERE emp_id=\""+uname+"\"";
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
    
    public String getUname(){
        return uname;
        
    }

  
}
