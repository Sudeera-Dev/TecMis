/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginFrame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KrzYoFreaK
 */
public class MyDBConnector {
    private void registerMyConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("error registering drive");
        }
    }
    
    /**
     *
     * @return
     */
    public Connection getMyConnection(){
        String url = "jdbc:mysql://81.19.211.39:3306/madushan_teclms";//url to the hosting place your databse
        String user = "madushan"; //user name
        String pw = "Myweb@123"; // password for the user
        
        Connection myConnection = null;
        try {
            myConnection = DriverManager.getConnection(url, user, pw);
        } catch (SQLException ex) {
            Logger.getLogger(MyDBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return myConnection;
        
    }
}
