/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginFrame;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author KrzYoFreaK
 */
public class LoginTest {
    private String uname;
    private String pass;
    MyDBConnector mdc = new MyDBConnector();
    Connection con = getConnection();
    Statement stmt;

    LoginTest(String uname,String pass){
        this.uname = uname;
        this.pass = pass;
    }
    
    private Connection getConnection() {
        Connection myConn = mdc.getMyConnection();
        return myConn;
    }
    
    public int validateLogin(){
        if(uname == null){
            return 1;
        } else {
        }
        return 0;
        
    }
}
