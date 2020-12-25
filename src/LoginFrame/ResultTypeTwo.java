package LoginFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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

    
    
public class ResultTypeTwo{
    
    MyDBConnector mdc = new MyDBConnector();
    Connection con = getConnection();
    Statement stmt;
    
     String stu_id;
     String subject;
     
     double quiz1;
     double quiz2;
     double quiz3;
     double quiz4;
     
     double assess1;
     double assess2;
     

     double mid;
     double final_theory;
     
     String ca_status;
     String grade;
     double sgpa;
     


    
      private Connection getConnection() {
        Connection myConn = mdc.getMyConnection();
        return myConn;
    }
    
    public ResultTypeTwo(String stu_id,String subject) {
        
        this.stu_id = stu_id;
        this.subject = subject;
        
    }
    public void subjectData(){
        
 
         String myStatement = "SELECT * FROM " + subject + " WHERE stu_id=\""+stu_id+"\"";
         
         
         
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myStatement);
            
            while (rs.next()){
                quiz1 = rs.getFloat("quiz_1");
                quiz2 = rs.getFloat("quiz_2");
                quiz3 = rs.getFloat("quiz_3");
                quiz4 = rs.getFloat("quiz_4");

                assess1 = rs.getFloat("assess_1");
                assess2 = rs.getFloat("assess_2");

                mid = rs.getFloat("mid");
                final_theory = rs.getFloat("final_theory");
                
           
            }
            
            
        } catch (SQLException ex) {
            
            Logger.getLogger(ResultTypeTwo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
 

   
 /*************** calculating  CA Marks *******************************/
   
   
   
public double caTotal(){
    
    double caTotal;
    double temp;
    
    double[] quizTotal = {quiz1,quiz2,quiz3,quiz4};
    for (int i = 0; i < quizTotal.length; i++) {     
            for (int j = i+1; j < quizTotal.length; j++) {     
               if(quizTotal[i] < quizTotal[j]) {    
                   temp = quizTotal[i];    
                   quizTotal[i] = quizTotal[j];    
                   quizTotal[j] = temp;    
               }     
            }     
    }    
    
    caTotal = ((quizTotal[0]+quizTotal[1]+quizTotal[2])/30)+(assess1+assess2)/20+mid/5;
    caTotal =  Math.round(caTotal*100.0)/100.0;
    return caTotal;
}


 /*************** Subject Total Marks *******************************/


public double subjectTotal(){
    
    double subjectTotal;
    double caTotal = caTotal();
    
    
    subjectTotal = (final_theory/100*60)+caTotal;
    subjectTotal =  Math.round(subjectTotal*100.0)/100.0;
    
    if (caTotal>=20){
          ca_status="PASS";  
     
    
    
          if (subjectTotal>=85){
                    grade = "A+";
                    sgpa = 4.00;
                }
                else if(subjectTotal>=75){
                    grade = "A";
                    sgpa = 4.00;
                }
                 else if(subjectTotal>=70){
                    grade = "A-";
                    sgpa = 3.70;
                }
                 else if(subjectTotal>=65){
                    grade = "B+";
                    sgpa = 3.30;
                }
                 else if(subjectTotal>=60){
                    grade = "B";
                    sgpa = 3.00;
                }
                 else if(subjectTotal>=55){
                    grade = "B-";
                    sgpa = 2.70;
                }
                 else if(subjectTotal>=50){
                    grade = "C+";
                    sgpa = 2.30;
                    
                }
                 else if(subjectTotal>=45){
                    grade = "C";
                    sgpa = 2.00;
                }
                 else if(subjectTotal>=40){
                    grade = "C-";
                    sgpa = 1.70;
                }
                 else if(subjectTotal>=35){
                    grade = "D+";
                    sgpa = 1.30;
                }
                  else if(subjectTotal>=30){
                    grade = "D";
                    sgpa = 1.00;
                }
                 else {
                     grade = "E";
                     sgpa = 0.00;
                }
                 
     }else {
          ca_status="FAIL";  
      }
    
    
 return subjectTotal;
}


      
    
 
      
    
}

   
    

