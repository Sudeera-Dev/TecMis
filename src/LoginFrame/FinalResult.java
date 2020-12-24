/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginFrame;

/**
 *
 * @author User
 */
public class FinalResult {
    
    String stu_id = LoginTest.uid;
    double caMarks;
    double finalMarks;
    double result;
    char grade;
    
    
    public void resultProcess() {
    
    
    
    ResultTypeOne ICT1131 = new ResultTypeOne(stu_id,"ict_1131_result");
    ICT1131.subjectData();
    caMarks = ICT1131.caTotal();
    finalMarks =ICT1131.subjectTotal();
    
    
    
    
    
    
    /**
    
    ResultTypeOne ICT1121 = new ResultTypeOne(stu_id,"ict_1121_result");
    ICT1131.subjectData();
    
    
    ResultTypeTwo ICT1141 = new ResultTypeTwo(stu_id,"ict_1141_result");
    ICT1131.subjectData();
    
    
    ResultTypeThree ICT1111 = new ResultTypeThree(stu_id,"ict_1111_result");
    ICT1131.subjectData();
    
    ResultTypeThree ICT1112 = new ResultTypeThree(stu_id,"ict_1112_result");
    ICT1131.subjectData();
    
    ResultTypeFour ICT1123 = new ResultTypeFour(stu_id,"ict_1123_result");
    ICT1131.subjectData();
    
    **/
    }   
    
}
