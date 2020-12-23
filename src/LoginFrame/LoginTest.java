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
public class LoginTest {
    private String uname;
    private String pass;
    private int loginMode;
    
    MyDBConnector mdc = new MyDBConnector();
    Connection con = getConnection();
    Statement stmt;

    LoginTest(String uname,String pass,int loginMode){
        this.uname = uname;
        this.pass = pass;
        this.loginMode = loginMode;
    }
    
    private Connection getConnection() {
        Connection myConn = mdc.getMyConnection();
        return myConn;
    }
    
    /**
     *
     * @return 
     */
    private String panelDirect(){
         
        switch(loginMode){
            case 1:
                return (checkStudent());
            case 2:
                return (checkStaff());
            default:
                return "select an option";
        }
    }
    
    public String validateLogin(){
        if("".equals(uname)){
            return "Username is empty";
        }else if("".equals(pass)){
            return "Password is empty";
        }else{
            return (panelDirect());
        }
        
    }
    
    private String checkStaff(){
        int count=0;
        String job="";
        String myStatement = "SELECT * FROM staff WHERE emp_id=\""+uname+"\" and password=\""+pass+"\" ";
        
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myStatement);
            
            while(rs.next()){
                count += 1;
                job=rs.getString("job_role");
            }
            if (count == 0){
                return  "No record found";
            }else{
                if(null != job)switch (job) {
                    case "ADMIN":
                    {
                        AdminFrame frame = new AdminFrame();
                        frame.setVisible(true);
                        return  "Sucess";
                    }
                    case "LEC":
                    {
                        LecturerFrame frame = new LecturerFrame();
                        frame.setUname(uname);
                        frame.setVisible(true);
                        return  "Sucess";
                    }
                    case "TEC_OFF":
                    {
                        TechOfficerFrame frame = new TechOfficerFrame();
                        frame.setUname(uname);
                        frame.setVisible(true);
                        return  "Sucess";
                    }
                    default:
                        break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
    private String checkStudent(){
        int count=0;
        String myStatement = "SELECT * FROM student WHERE stu_id=\""+uname+"\" and password=\""+pass+"\" ";
        
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myStatement);
            
            while(rs.next()){
                count += 1;
            }
            if (count == 0){
                return  "No record found";
            }else{
                StudentFrame frame = new StudentFrame();
                frame.setUname(uname);
                frame.setVisible(true);
                return  "Sucess";
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
