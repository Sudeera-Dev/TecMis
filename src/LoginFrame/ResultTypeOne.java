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
 * @author User
 */

    
    
public class ResultTypeOne {
    
    MyDBConnector mdc = new MyDBConnector();
    Connection con = getConnection();
    Statement stmt;
    
     String stu_id;
     String subject;
     double quiz1;
     double quiz2;
     double quiz3;

     double mid;
     double final_theory;
     double final_prac;
    
      private Connection getConnection() {
        Connection myConn = mdc.getMyConnection();
        return myConn;
    }
    
    public ResultTypeOne(String stu_id,String subject) {
        
        this.stu_id = stu_id;
        this.subject = subject;
        
    }
    public void subjectData(String subject, String uname){
        
 
         String myStatement = "SELECT * FROM "+ ""+subject+" WHERE stu_id=\""+stu_id+"\"";
         
         
         
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myStatement);
            
             quiz1 = rs.getFloat("quiz_1");
             quiz2 = rs.getFloat("quiz_2");
             quiz3 = rs.getFloat("quiz_3");
             
             mid = rs.getFloat("mid");
             final_theory = rs.getFloat("final_theory");
             final_prac = rs.getFloat("final_prac");
            
            
        } catch (SQLException ex) {
            
            Logger.getLogger(ResultTypeOne.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
 

   
 /*************** calculating  CA Marks *******************************/
   
   
   
public double caTotal(){
    
    double caTotal;
    double temp;
    
    double[] quizTotal = {quiz1,quiz2,quiz3};
    for (int i = 0; i < quizTotal.length; i++) {     
            for (int j = i+1; j < quizTotal.length; j++) {     
               if(quizTotal[i] < quizTotal[j]) {    
                   temp = quizTotal[i];    
                   quizTotal[i] = quizTotal[j];    
                   quizTotal[j] = temp;    
               }     
            }     
    }    
    
    caTotal = ((quizTotal[0]+quizTotal[1])/20)+(mid/5);
    
    return caTotal;
}


 /*************** Subject Total Marks *******************************/


public double subjectTotal(){
    
    double subjectTotal;
    double caTotal = caTotal();
    
    
    subjectTotal = (final_theory/100*40)+(final_prac/100*30+caTotal);
    
    
 return subjectTotal;
}


      
    
 
      
    
}

   
    

