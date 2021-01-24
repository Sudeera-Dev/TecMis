/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginFrame;

import javax.swing.JFrame;

/**
 *
 * @author KrzYoFreaK
 */
public class StudentResultsFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentResultsFrame
     */
    public StudentResultsFrame() {
        initComponents();
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE  );
        
        String stu_id = LoginTest.uid;
        
        ResultTypeOne ICT1131 = new ResultTypeOne(stu_id,"ict_1131_result");
            ICT1131.subjectData();
            ict1131q1.setText(Double.toString(ICT1131.quiz1));
            ict1131q2.setText(Double.toString(ICT1131.quiz2));
            ict1131q3.setText(Double.toString(ICT1131.quiz3));

         
            ict1131mid.setText(Double.toString(ICT1131.mid));

            ict1131ft.setText(Double.toString(ICT1131.final_theory));
            ict1131fp.setText(Double.toString(ICT1131.final_prac));
            
            double ict1131_ca = ICT1131.caTotal();
            double ict1131_subject_total = ICT1131.subjectTotal();
            
            ict1131_ca_marks.setText(Double.toString(ict1131_ca));
            ict1131_ca_status.setText(ICT1131.ca_status);
            
            ict1131_final.setText(Double.toString(ICT1131.subjectTotal()));
            ict1131_grade.setText(ICT1131.grade);
            ict1131_sgpa.setText(Double.toString(ICT1131.sgpa));
            
            
        ResultTypeOne ICT1121 = new ResultTypeOne(stu_id,"ict_1121_result");
        
            ICT1121.subjectData();
            ict1121q1.setText(Double.toString(ICT1121.quiz1));
            ict1121q2.setText(Double.toString(ICT1121.quiz2));
            ict1121q3.setText(Double.toString(ICT1121.quiz3));

         
            ict1121mid.setText(Double.toString(ICT1121.mid));

            ict1121ft.setText(Double.toString(ICT1121.final_theory));
            ict1121fp.setText(Double.toString(ICT1121.final_prac));
            
            double ict1121_ca = ICT1121.caTotal();
            double ict1121_subject_total = ICT1121.subjectTotal();
            
            ict1121_ca_marks.setText(Double.toString(ict1121_ca));
            ict1121_ca_status.setText(ICT1121.ca_status);
            
            ict1121_final.setText(Double.toString(ICT1121.subjectTotal()));
            ict1121_grade.setText(ICT1121.grade);
            ict1121_sgpa.setText(Double.toString(ICT1121.sgpa));
            
        
        ResultTypeTwo ICT1141 = new ResultTypeTwo(stu_id,"ict_1141_result");
            ICT1141.subjectData();
            ict1141q1.setText(Double.toString(ICT1141.quiz1));
            ict1141q2.setText(Double.toString(ICT1141.quiz2));
            ict1141q3.setText(Double.toString(ICT1141.quiz3));
            ict1141q4.setText(Double.toString(ICT1141.quiz4));
         
            ict1141a1.setText(Double.toString(ICT1141.assess1));
            ict1141a2.setText(Double.toString(ICT1141.assess2));

            ict1141ft.setText(Double.toString(ICT1141.final_theory));
            
            double ict1141_ca = ICT1141.caTotal();
            double ict1141_subject_total = ICT1141.subjectTotal();
            
            ict1141_ca_marks.setText(Double.toString(ict1141_ca));
            ict1141_ca_status.setText(ICT1141.ca_status);
            
            ict1141_final.setText(Double.toString(ICT1141.subjectTotal()));
            ict1141_grade.setText(ICT1141.grade);
            ict1141_sgpa.setText(Double.toString(ICT1141.sgpa));
       
        
        ResultTypeThree ICT1111 = new ResultTypeThree(stu_id,"ict_1111_result");
            ICT1111.subjectData();
            ict1111q1.setText(Double.toString(ICT1111.quiz1));
            ict1111q2.setText(Double.toString(ICT1111.quiz2));
            ict1111q3.setText(Double.toString(ICT1111.quiz3));

            ict1111a1.setText(Double.toString(ICT1111.assess1));
            ict1111a2.setText(Double.toString(ICT1111.assess2));
            ict1111a3.setText(Double.toString(ICT1111.assess3));

            ict1111ft.setText(Double.toString(ICT1111.final_theory));
            ict1111fp.setText(Double.toString(ICT1111.final_prac));
            
            double ict1111_ca = ICT1111.caTotal();
            double ict1111_subject_total = ICT1111.subjectTotal();
            
            ict1111_ca_marks.setText(Double.toString(ict1111_ca));
            ict1111_ca_status.setText(ICT1111.ca_status);
            
            ict1111_final.setText(Double.toString(ICT1111.subjectTotal()));
            ict1111_grade.setText(ICT1111.grade);
            ict1111_sgpa.setText(Double.toString(ICT1111.sgpa));
            
     
       
       
      ResultTypeThree ICT1112 = new ResultTypeThree(stu_id,"ict_1112_result");
            ICT1112.subjectData();
            ict1112q1.setText(Double.toString(ICT1112.quiz1));
            ict1112q2.setText(Double.toString(ICT1112.quiz2));
            ict1112q3.setText(Double.toString(ICT1112.quiz3));

            ict1112a1.setText(Double.toString(ICT1112.assess1));
            ict1112a2.setText(Double.toString(ICT1112.assess2));
            ict1112a3.setText(Double.toString(ICT1112.assess3));

            ict1112ft.setText(Double.toString(ICT1112.final_theory));
            ict1112fp.setText(Double.toString(ICT1112.final_prac));
            
            double ict1112_ca = ICT1112.caTotal();
            double ict1112_subject_total = ICT1112.subjectTotal();
            
            ict1112_ca_marks.setText(Double.toString(ict1112_ca));
            ict1112_ca_status.setText(ICT1112.ca_status);
            
            ict1112_final.setText(Double.toString(ICT1112.subjectTotal()));
            ict1112_grade.setText(ICT1111.grade);
            ict1112_sgpa.setText(Double.toString(ICT1112.sgpa));
       
        
        ResultTypeFour ICT1123 = new ResultTypeFour(stu_id,"ict_1123_result");
            ICT1123.subjectData();
            ict1123q1.setText(Double.toString(ICT1123.quiz1));
            ict1123q2.setText(Double.toString(ICT1123.quiz2));
            ict1123q3.setText(Double.toString(ICT1123.quiz3));

            ict1123a1.setText(Double.toString(ICT1123.assess1));
            ict1123a2.setText(Double.toString(ICT1123.assess2));
            ict1123a3.setText(Double.toString(ICT1123.assess3));

            ict1123ft.setText(Double.toString(ICT1123.final_theory));
            ict1123fp.setText(Double.toString(ICT1123.final_prac));
            
            double ict1123_ca = ICT1123.caTotal();
            double ict1123_subject_total = ICT1123.subjectTotal();
            
            ict1123_ca_marks.setText(Double.toString(ict1123_ca));
            ict1123_ca_status.setText(ICT1123.ca_status);
            
            ict1123_final.setText(Double.toString(ICT1123.subjectTotal()));
            ict1123_grade.setText(ICT1123.grade);
            ict1123_sgpa.setText(Double.toString(ICT1123.sgpa));
            
     /**************** GPA Calculation ********************************/  

    double cgpa_final;
    String class_obtained;

     double ICT1131_obtained = ICT1131.sgpa * 3;
     double ICT1121_obtained = ICT1121.sgpa * 2;
     double ICT1141_obtained = ICT1141.sgpa * 4;
     double ICT1111_obtained = ICT1111.sgpa * 1;
     double ICT1112_obtained = ICT1112.sgpa * 1;
     double ICT1123_obtained = ICT1123.sgpa * 2;
            
     double sum_gpa =   ICT1131_obtained + ICT1121_obtained + ICT1141_obtained + ICT1111_obtained + ICT1112_obtained + ICT1123_obtained;   
      
     int sum_credit = 3+2+4+1+1+2;
     
     cgpa_final = sum_gpa/sum_credit;
     cgpa_final =  Math.round(cgpa_final*100.0)/100.0;   
     
     
     
     cgpa.setText(Double.toString(cgpa_final));
     
     if (cgpa_final>=3.70){
          txtClass.setText("First Class Awarded");
     }else if(cgpa_final>=3.30) {
         txtClass.setText("Second Class Upper Awarded");
     }else if(cgpa_final>=3.0) {
         txtClass.setText("Second Class Lower ");
     }else if(cgpa_final>=2.0) {
         txtClass.setText("General Awarded");
     }else{
         txtClass.setText("You have not awarded");
     }
        
         
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ICT1111 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ict1111q1 = new javax.swing.JLabel();
        ict1111a1 = new javax.swing.JLabel();
        ict1111q2 = new javax.swing.JLabel();
        ict1111q3 = new javax.swing.JLabel();
        ict1111a2 = new javax.swing.JLabel();
        ict1111ft = new javax.swing.JLabel();
        ict1111a3 = new javax.swing.JLabel();
        ict1111fp = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        ict1111_ca_marks = new javax.swing.JLabel();
        ict1111_ca_status = new javax.swing.JLabel();
        ict1111_final = new javax.swing.JLabel();
        ict1111_grade = new javax.swing.JLabel();
        ict1111_sgpa = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        ict1112q1 = new javax.swing.JLabel();
        ict1112a1 = new javax.swing.JLabel();
        ict1112q2 = new javax.swing.JLabel();
        ict1112q3 = new javax.swing.JLabel();
        ict1112a2 = new javax.swing.JLabel();
        ict1112ft = new javax.swing.JLabel();
        ict1112a3 = new javax.swing.JLabel();
        ict1112fp = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        ict1112_ca_marks = new javax.swing.JLabel();
        ict1112_ca_status = new javax.swing.JLabel();
        ict1112_final = new javax.swing.JLabel();
        ict1112_grade = new javax.swing.JLabel();
        ict1112_sgpa = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        ict1121q1 = new javax.swing.JLabel();
        ict1121q2 = new javax.swing.JLabel();
        ict1121q3 = new javax.swing.JLabel();
        ict1121ft = new javax.swing.JLabel();
        ict1121mid = new javax.swing.JLabel();
        ict1121fp = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        ict1121_ca_marks = new javax.swing.JLabel();
        ict1121_ca_status = new javax.swing.JLabel();
        ict1121_final = new javax.swing.JLabel();
        ict1121_grade = new javax.swing.JLabel();
        ict1121_sgpa = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ict1123q1 = new javax.swing.JLabel();
        ict1123a1 = new javax.swing.JLabel();
        ict1123q2 = new javax.swing.JLabel();
        ict1123q3 = new javax.swing.JLabel();
        ict1123a2 = new javax.swing.JLabel();
        ict1123ft = new javax.swing.JLabel();
        ict1123a3 = new javax.swing.JLabel();
        ict1123fp = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        ict1123_ca_marks = new javax.swing.JLabel();
        ict1123_ca_status = new javax.swing.JLabel();
        ict1123_final = new javax.swing.JLabel();
        ict1123_grade = new javax.swing.JLabel();
        ict1123_sgpa = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        ict1141q1 = new javax.swing.JLabel();
        ict1141a1 = new javax.swing.JLabel();
        ict1141q2 = new javax.swing.JLabel();
        ict1141q3 = new javax.swing.JLabel();
        ict1141a2 = new javax.swing.JLabel();
        ict1141ft = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        ict1141q4 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        ict1141_ca_marks = new javax.swing.JLabel();
        ict1141_ca_status = new javax.swing.JLabel();
        ict1141_final = new javax.swing.JLabel();
        ict1141_grade = new javax.swing.JLabel();
        ict1141_sgpa = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        ict1131q1 = new javax.swing.JLabel();
        ict1131q2 = new javax.swing.JLabel();
        ict1131q3 = new javax.swing.JLabel();
        ict1131ft = new javax.swing.JLabel();
        ict1131mid = new javax.swing.JLabel();
        ict1131fp = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        ict1131_ca_marks = new javax.swing.JLabel();
        ict1131_ca_status = new javax.swing.JLabel();
        ict1131_final = new javax.swing.JLabel();
        ict1131_grade = new javax.swing.JLabel();
        ict1131_sgpa = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        txtClass = new javax.swing.JLabel();
        cgpa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ICT1111.setBackground(new java.awt.Color(204, 204, 204));
        ICT1111.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ICT1111.setName(""); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Quiz 01");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Quiz 03");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Quiz 02");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("Assessment 01");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setText("Assessment 03");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setText("Assessment 02");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setText("Final Practical");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setText("Final Theory");

        ict1111q1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1111q1.setText("q1 result");
        ict1111q1.setName("txtQuiz1"); // NOI18N

        ict1111a1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1111a1.setText("Assess 1");
        ict1111a1.setName("txtAssess1"); // NOI18N

        ict1111q2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1111q2.setText("q2 result");
        ict1111q2.setName("txtQuiz2"); // NOI18N

        ict1111q3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1111q3.setText("q3 result");
        ict1111q3.setName("txtQuiz3"); // NOI18N

        ict1111a2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1111a2.setText("Assess 2");
        ict1111a2.setName("txtAssess2"); // NOI18N

        ict1111ft.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1111ft.setText("Final Theory");
        ict1111ft.setName("txtFtheory"); // NOI18N

        ict1111a3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1111a3.setText("Assess 3");
        ict1111a3.setName("txtAssess3"); // NOI18N

        ict1111fp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1111fp.setText("Final Prac");
        ict1111fp.setName("txtFprac"); // NOI18N

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel35.setText("CA ");

        ict1111_ca_marks.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1111_ca_marks.setText("ca");

        ict1111_ca_status.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1111_ca_status.setText("ca_status");

        ict1111_final.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1111_final.setText("final");

        ict1111_grade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1111_grade.setText("grade");

        ict1111_sgpa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1111_sgpa.setText("sgpa");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel36.setText("Subject Final");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ict1111_final)
                .addGap(44, 44, 44)
                .addComponent(ict1111_grade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(ict1111_sgpa)
                .addGap(23, 23, 23))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(65, 65, 65)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(ict1111_ca_marks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ict1111_ca_status)
                .addGap(55, 55, 55))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel35)
                .addGap(56, 56, 56)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ict1111_ca_marks)
                    .addComponent(ict1111_ca_status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(48, 48, 48)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ict1111_final)
                    .addComponent(ict1111_grade)
                    .addComponent(ict1111_sgpa))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ict1111q1)
                        .addContainerGap(589, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ict1111a1)
                                .addComponent(ict1111q3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(ict1111q2)
                            .addComponent(ict1111a2)
                            .addComponent(ict1111a3)
                            .addComponent(ict1111ft)
                            .addComponent(ict1111fp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ict1111q1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ict1111q2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ict1111q3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(ict1111a1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ict1111a2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(ict1111a3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(ict1111ft))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(ict1111fp))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(65, 65, 65))))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Database Management System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ICT1111.addTab("ICT1111", jPanel3);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Web Application Development");

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel27.setText("Quiz 01");

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel28.setText("Quiz 03");

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel29.setText("Quiz 02");

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel30.setText("Assessment 01");

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel31.setText("Assessment 03");

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel32.setText("Assessment 02");

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel33.setText("Final Practical");

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel34.setText("Final Theory");

        ict1112q1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1112q1.setText("q1 result");
        ict1112q1.setName("txtQuiz1"); // NOI18N

        ict1112a1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1112a1.setText("Assess 1");
        ict1112a1.setName("txtAssess1"); // NOI18N

        ict1112q2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1112q2.setText("q2 result");
        ict1112q2.setName("txtQuiz2"); // NOI18N

        ict1112q3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1112q3.setText("q3 result");
        ict1112q3.setName("txtQuiz3"); // NOI18N

        ict1112a2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1112a2.setText("Assess 2");
        ict1112a2.setName("txtAssess2"); // NOI18N

        ict1112ft.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1112ft.setText("Final Theory");
        ict1112ft.setName("txtFtheory"); // NOI18N

        ict1112a3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1112a3.setText("Assess 3");
        ict1112a3.setName("txtAssess3"); // NOI18N

        ict1112fp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1112fp.setText("Final Prac");
        ict1112fp.setName("txtFprac"); // NOI18N

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel37.setText("CA ");

        ict1112_ca_marks.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1112_ca_marks.setText("ca");

        ict1112_ca_status.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1112_ca_status.setText("ca_status");

        ict1112_final.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1112_final.setText("final");

        ict1112_grade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1112_grade.setText("grade");

        ict1112_sgpa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1112_sgpa.setText("sgpa");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel38.setText("Subject Final");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ict1112_final)
                .addGap(44, 44, 44)
                .addComponent(ict1112_grade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(ict1112_sgpa)
                .addGap(23, 23, 23))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(65, 65, 65)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(ict1112_ca_marks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ict1112_ca_status)
                .addGap(55, 55, 55))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel37)
                .addGap(56, 56, 56)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ict1112_ca_marks)
                    .addComponent(ict1112_ca_status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(48, 48, 48)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ict1112_final)
                    .addComponent(ict1112_grade)
                    .addComponent(ict1112_sgpa))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel28)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33))
                .addGap(49, 49, 49)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ict1112fp)
                    .addComponent(ict1112ft)
                    .addComponent(ict1112a2)
                    .addComponent(ict1112q3)
                    .addComponent(ict1112a1)
                    .addComponent(ict1112q1)
                    .addComponent(ict1112a3)
                    .addComponent(ict1112q2))
                .addGap(152, 152, 152)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(ict1112q1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(ict1112q2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(ict1112q3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(ict1112a1))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(ict1112a2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(ict1112a3))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(ict1112ft))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(ict1112fp))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 780, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ICT1111.addTab("ICT1112", jPanel4);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Object Oriented Analysis");

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));

        jLabel79.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel79.setText("Quiz 01");

        jLabel80.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel80.setText("Quiz 03");

        jLabel81.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel81.setText("Quiz 02");

        jLabel83.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel83.setText("Mid");

        jLabel85.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel85.setText("Final Practical");

        jLabel86.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel86.setText("Final Theory");

        ict1121q1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1121q1.setText("quiz 1");
        ict1121q1.setName("txtQuiz1"); // NOI18N

        ict1121q2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1121q2.setText("quiz 2");
        ict1121q2.setName("txtQuiz2"); // NOI18N

        ict1121q3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1121q3.setText("quiz 3");
        ict1121q3.setName("txtQuiz3"); // NOI18N

        ict1121ft.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1121ft.setText("Final Theory");
        ict1121ft.setName("txtFtheory"); // NOI18N

        ict1121mid.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1121mid.setText("Mid");
        ict1121mid.setName("txtAssess3"); // NOI18N

        ict1121fp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1121fp.setText("Final Pract");
        ict1121fp.setName("txtFprac"); // NOI18N

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel39.setText("CA ");

        ict1121_ca_marks.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1121_ca_marks.setText("ca");

        ict1121_ca_status.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1121_ca_status.setText("ca_status");

        ict1121_final.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1121_final.setText("final");

        ict1121_grade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1121_grade.setText("grade");

        ict1121_sgpa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1121_sgpa.setText("sgpa");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel40.setText("Subject Final");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ict1121_final)
                .addGap(44, 44, 44)
                .addComponent(ict1121_grade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(ict1121_sgpa)
                .addGap(23, 23, 23))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(65, 65, 65)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(ict1121_ca_marks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ict1121_ca_status)
                .addGap(55, 55, 55))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel39)
                .addGap(56, 56, 56)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ict1121_ca_marks)
                    .addComponent(ict1121_ca_status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addGap(48, 48, 48)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ict1121_final)
                    .addComponent(ict1121_grade)
                    .addComponent(ict1121_sgpa))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79)
                    .addComponent(jLabel81)
                    .addComponent(jLabel80)
                    .addComponent(jLabel83)
                    .addComponent(jLabel86)
                    .addComponent(jLabel85))
                .addGap(49, 49, 49)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ict1121fp)
                    .addComponent(ict1121ft)
                    .addComponent(ict1121q3)
                    .addComponent(ict1121q1)
                    .addComponent(ict1121mid)
                    .addComponent(ict1121q2))
                .addGap(130, 130, 130)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(ict1121q1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81)
                            .addComponent(ict1121q2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel80)
                            .addComponent(ict1121q3))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(ict1121mid))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(ict1121ft))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(ict1121fp))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(834, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ICT1111.addTab("ICT1121", jPanel5);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Data Structures & Algorithms");

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setText("Quiz 01");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel16.setText("Quiz 03");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setText("Quiz 02");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel18.setText("Assessment 01");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel19.setText("Assessment 03");

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel20.setText("Assessment 02");

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel21.setText("Final Practical");

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel22.setText("Final Theory");

        ict1123q1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1123q1.setText("quiz 1");
        ict1123q1.setName("txtQuiz1"); // NOI18N

        ict1123a1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1123a1.setText("assess 1");
        ict1123a1.setName("txtAssess1"); // NOI18N

        ict1123q2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1123q2.setText("quiz 2");
        ict1123q2.setName("txtQuiz2"); // NOI18N

        ict1123q3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1123q3.setText("quiz 3");
        ict1123q3.setName("txtQuiz3"); // NOI18N

        ict1123a2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1123a2.setText("assess 2");
        ict1123a2.setName("txtAssess2"); // NOI18N

        ict1123ft.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1123ft.setText("final theory");
        ict1123ft.setName("txtFtheory"); // NOI18N

        ict1123a3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1123a3.setText("assess 3");
        ict1123a3.setName("txtAssess3"); // NOI18N

        ict1123fp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1123fp.setText("final prac");
        ict1123fp.setName("txtFprac"); // NOI18N

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel45.setText("CA ");

        ict1123_ca_marks.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1123_ca_marks.setText("ca");

        ict1123_ca_status.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1123_ca_status.setText("ca_status");

        ict1123_final.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1123_final.setText("final");

        ict1123_grade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1123_grade.setText("grade");

        ict1123_sgpa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1123_sgpa.setText("sgpa");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel46.setText("Subject Final");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ict1123_final)
                .addGap(44, 44, 44)
                .addComponent(ict1123_grade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(ict1123_sgpa)
                .addGap(23, 23, 23))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(65, 65, 65)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(ict1123_ca_marks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ict1123_ca_status)
                .addGap(55, 55, 55))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel45)
                .addGap(56, 56, 56)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ict1123_ca_marks)
                    .addComponent(ict1123_ca_status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(48, 48, 48)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ict1123_final)
                    .addComponent(ict1123_grade)
                    .addComponent(ict1123_sgpa))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21))
                .addGap(49, 49, 49)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ict1123fp)
                    .addComponent(ict1123ft)
                    .addComponent(ict1123a2)
                    .addComponent(ict1123q3)
                    .addComponent(ict1123a1)
                    .addComponent(ict1123q1)
                    .addComponent(ict1123a3)
                    .addComponent(ict1123q2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(ict1123q1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(ict1123q2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(ict1123q3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(ict1123a1))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(ict1123a2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(ict1123a3))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(ict1123ft))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(ict1123fp)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(801, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ICT1111.addTab("ICT1123", jPanel6);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Professional Issues of ICT");

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));

        jLabel127.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel127.setText("Quiz 01");

        jLabel128.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel128.setText("Quiz 03");

        jLabel129.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel129.setText("Quiz 02");

        jLabel130.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel130.setText("Assessment 01");

        jLabel132.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel132.setText("Assessment 02");

        jLabel134.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel134.setText("Final Theory");

        ict1141q1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1141q1.setText("quiz 1");
        ict1141q1.setName("txtQuiz1"); // NOI18N

        ict1141a1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1141a1.setText("aassess 1");
        ict1141a1.setName("txtAssess1"); // NOI18N

        ict1141q2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1141q2.setText("quiz 2");
        ict1141q2.setName("txtQuiz2"); // NOI18N

        ict1141q3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1141q3.setText("quiz 3");
        ict1141q3.setName("txtQuiz3"); // NOI18N

        ict1141a2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1141a2.setText("assess 2");
        ict1141a2.setName("txtAssess2"); // NOI18N

        ict1141ft.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1141ft.setText("final theory");
        ict1141ft.setName("txtFtheory"); // NOI18N

        jLabel131.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel131.setText("Quiz 04");

        ict1141q4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1141q4.setText("quiz 4");
        ict1141q4.setName("txtQuiz4"); // NOI18N

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel43.setText("CA ");

        ict1141_ca_marks.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1141_ca_marks.setText("ca");

        ict1141_ca_status.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1141_ca_status.setText("ca_status");

        ict1141_final.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1141_final.setText("final");

        ict1141_grade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1141_grade.setText("grade");

        ict1141_sgpa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1141_sgpa.setText("sgpa");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel44.setText("Subject Final");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ict1141_final)
                .addGap(44, 44, 44)
                .addComponent(ict1141_grade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(ict1141_sgpa)
                .addGap(23, 23, 23))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel44)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(65, 65, 65)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(ict1141_ca_marks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ict1141_ca_status)
                .addGap(55, 55, 55))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel43)
                .addGap(56, 56, 56)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ict1141_ca_marks)
                    .addComponent(ict1141_ca_status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addGap(48, 48, 48)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ict1141_final)
                    .addComponent(ict1141_grade)
                    .addComponent(ict1141_sgpa))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel127)
                    .addComponent(jLabel129)
                    .addComponent(jLabel130)
                    .addComponent(jLabel128)
                    .addComponent(jLabel132)
                    .addComponent(jLabel134)
                    .addComponent(jLabel131))
                .addGap(49, 49, 49)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ict1141q4)
                    .addComponent(ict1141ft)
                    .addComponent(ict1141a2)
                    .addComponent(ict1141q3)
                    .addComponent(ict1141a1)
                    .addComponent(ict1141q1)
                    .addComponent(ict1141q2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel127)
                            .addComponent(ict1141q1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel129)
                            .addComponent(ict1141q2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel128)
                            .addComponent(ict1141q3))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel131)
                            .addComponent(ict1141q4))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel130)
                            .addComponent(ict1141a1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel132)
                            .addComponent(ict1141a2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel134)
                            .addComponent(ict1141ft))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(822, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        ICT1111.addTab("ICT1141", jPanel8);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Object Oriented Development");

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

        jLabel111.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel111.setText("Quiz 01");

        jLabel112.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel112.setText("Quiz 03");

        jLabel113.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel113.setText("Quiz 02");

        jLabel115.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel115.setText("Mid");

        jLabel117.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel117.setText("Final Practical");

        jLabel118.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel118.setText("Final Theory");

        ict1131q1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1131q1.setText("quiz 1");
        ict1131q1.setName("txtQuiz1"); // NOI18N

        ict1131q2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1131q2.setText("quiz 2");
        ict1131q2.setName("txtQuiz2"); // NOI18N

        ict1131q3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1131q3.setText("quiz 3");
        ict1131q3.setName("txtQuiz3"); // NOI18N

        ict1131ft.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1131ft.setText("final theory");
        ict1131ft.setName("txtFtheory"); // NOI18N

        ict1131mid.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1131mid.setText("mid");
        ict1131mid.setName("textMid"); // NOI18N

        ict1131fp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ict1131fp.setText("final prac");
        ict1131fp.setName("txtFprac"); // NOI18N

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel41.setText("CA ");

        ict1131_ca_marks.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1131_ca_marks.setText("ca");

        ict1131_ca_status.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1131_ca_status.setText("ca_status");

        ict1131_final.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1131_final.setText("final");

        ict1131_grade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1131_grade.setText("grade");

        ict1131_sgpa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ict1131_sgpa.setText("sgpa");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel42.setText("Subject Final");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ict1131_final)
                .addGap(44, 44, 44)
                .addComponent(ict1131_grade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(ict1131_sgpa)
                .addGap(23, 23, 23))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel42)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(65, 65, 65)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(ict1131_ca_marks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ict1131_ca_status)
                .addGap(55, 55, 55))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel41)
                .addGap(56, 56, 56)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ict1131_ca_marks)
                    .addComponent(ict1131_ca_status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
                .addComponent(jLabel42)
                .addGap(48, 48, 48)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ict1131_final)
                    .addComponent(ict1131_grade)
                    .addComponent(ict1131_sgpa))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel111)
                    .addComponent(jLabel113)
                    .addComponent(jLabel112)
                    .addComponent(jLabel115)
                    .addComponent(jLabel118)
                    .addComponent(jLabel117))
                .addGap(49, 49, 49)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ict1131fp)
                    .addComponent(ict1131ft)
                    .addComponent(ict1131q3)
                    .addComponent(ict1131q1)
                    .addComponent(ict1131mid)
                    .addComponent(ict1131q2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(ict1131q1))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(ict1131q2))
                .addGap(27, 27, 27)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(ict1131q3))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(ict1131mid))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(ict1131ft))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(ict1131fp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 783, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ICT1111.addTab("ICT1131", jPanel7);

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));

        txtClass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtClass.setText("class");

        cgpa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cgpa.setText("GPA");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(cgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 135, Short.MAX_VALUE)
                .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(cgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        ICT1111.addTab("CGPA", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ICT1111, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ICT1111)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentResultsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResultsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResultsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResultsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResultsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane ICT1111;
    private javax.swing.JLabel cgpa;
    private javax.swing.JLabel ict1111_ca_marks;
    private javax.swing.JLabel ict1111_ca_status;
    private javax.swing.JLabel ict1111_final;
    private javax.swing.JLabel ict1111_grade;
    private javax.swing.JLabel ict1111_sgpa;
    private javax.swing.JLabel ict1111a1;
    private javax.swing.JLabel ict1111a2;
    private javax.swing.JLabel ict1111a3;
    private javax.swing.JLabel ict1111fp;
    private javax.swing.JLabel ict1111ft;
    private javax.swing.JLabel ict1111q1;
    private javax.swing.JLabel ict1111q2;
    private javax.swing.JLabel ict1111q3;
    private javax.swing.JLabel ict1112_ca_marks;
    private javax.swing.JLabel ict1112_ca_status;
    private javax.swing.JLabel ict1112_final;
    private javax.swing.JLabel ict1112_grade;
    private javax.swing.JLabel ict1112_sgpa;
    private javax.swing.JLabel ict1112a1;
    private javax.swing.JLabel ict1112a2;
    private javax.swing.JLabel ict1112a3;
    private javax.swing.JLabel ict1112fp;
    private javax.swing.JLabel ict1112ft;
    private javax.swing.JLabel ict1112q1;
    private javax.swing.JLabel ict1112q2;
    private javax.swing.JLabel ict1112q3;
    private javax.swing.JLabel ict1121_ca_marks;
    private javax.swing.JLabel ict1121_ca_status;
    private javax.swing.JLabel ict1121_final;
    private javax.swing.JLabel ict1121_grade;
    private javax.swing.JLabel ict1121_sgpa;
    private javax.swing.JLabel ict1121fp;
    private javax.swing.JLabel ict1121ft;
    private javax.swing.JLabel ict1121mid;
    private javax.swing.JLabel ict1121q1;
    private javax.swing.JLabel ict1121q2;
    private javax.swing.JLabel ict1121q3;
    private javax.swing.JLabel ict1123_ca_marks;
    private javax.swing.JLabel ict1123_ca_status;
    private javax.swing.JLabel ict1123_final;
    private javax.swing.JLabel ict1123_grade;
    private javax.swing.JLabel ict1123_sgpa;
    private javax.swing.JLabel ict1123a1;
    private javax.swing.JLabel ict1123a2;
    private javax.swing.JLabel ict1123a3;
    private javax.swing.JLabel ict1123fp;
    private javax.swing.JLabel ict1123ft;
    private javax.swing.JLabel ict1123q1;
    private javax.swing.JLabel ict1123q2;
    private javax.swing.JLabel ict1123q3;
    private javax.swing.JLabel ict1131_ca_marks;
    private javax.swing.JLabel ict1131_ca_status;
    private javax.swing.JLabel ict1131_final;
    private javax.swing.JLabel ict1131_grade;
    private javax.swing.JLabel ict1131_sgpa;
    private javax.swing.JLabel ict1131fp;
    private javax.swing.JLabel ict1131ft;
    private javax.swing.JLabel ict1131mid;
    private javax.swing.JLabel ict1131q1;
    private javax.swing.JLabel ict1131q2;
    private javax.swing.JLabel ict1131q3;
    private javax.swing.JLabel ict1141_ca_marks;
    private javax.swing.JLabel ict1141_ca_status;
    private javax.swing.JLabel ict1141_final;
    private javax.swing.JLabel ict1141_grade;
    private javax.swing.JLabel ict1141_sgpa;
    private javax.swing.JLabel ict1141a1;
    private javax.swing.JLabel ict1141a2;
    private javax.swing.JLabel ict1141ft;
    private javax.swing.JLabel ict1141q1;
    private javax.swing.JLabel ict1141q2;
    private javax.swing.JLabel ict1141q3;
    private javax.swing.JLabel ict1141q4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel txtClass;
    // End of variables declaration//GEN-END:variables
}
