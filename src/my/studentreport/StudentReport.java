package my.studentreport;

import javax.swing.JFrame;
import my.reportcardpro.Student;
import my.reportcardpro.ReportCard;

/**
 *
 * @author gabi
 */

// jframe where the student's subject information can be edited by the user (not including name)
public class StudentReport extends javax.swing.JFrame {
    private Student student;
    
    /**
     * Creates new form StudentReport
     */
    public StudentReport() {
        initComponents();
        
        // when the x in the top right corner is clicked only the StudentReport jframe closes
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSubject1 = new javax.swing.JTextField();
        txtSubject2 = new javax.swing.JTextField();
        txtSubject3 = new javax.swing.JTextField();
        txtSubject4 = new javax.swing.JTextField();
        txtMark1 = new javax.swing.JTextField();
        txtMark2 = new javax.swing.JTextField();
        txtMark3 = new javax.swing.JTextField();
        txtMark4 = new javax.swing.JTextField();
        lblAverage = new javax.swing.JLabel();
        txtAverage = new javax.swing.JTextField();
        lblStudentName = new javax.swing.JLabel();
        btnPrint2 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdateAverage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 17))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Subject Names");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Marks");

        txtSubject1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtSubject1.setText("Subject 1");
        txtSubject1.setMinimumSize(new java.awt.Dimension(120, 23));

        txtSubject2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtSubject2.setText("Subject 2");

        txtSubject3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtSubject3.setText("Subject 3");

        txtSubject4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtSubject4.setText("Subject 4");
        txtSubject4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubject4ActionPerformed(evt);
            }
        });

        txtMark1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        txtMark2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtMark2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMark2ActionPerformed(evt);
            }
        });

        txtMark3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtMark3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMark3ActionPerformed(evt);
            }
        });

        txtMark4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        lblAverage.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblAverage.setText("Average:");

        txtAverage.setEditable(false);
        txtAverage.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAverageActionPerformed(evt);
            }
        });

        lblStudentName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblStudentName.setText("Student Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMark3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMark1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMark2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSubject4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMark4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMark1, txtMark2, txtMark3, txtMark4});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel5, txtSubject1, txtSubject2, txtSubject3, txtSubject4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSubject1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(txtMark1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMark2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMark3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSubject4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtMark4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtSubject1, txtSubject2, txtSubject3, txtSubject4});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMark1, txtMark2, txtMark3, txtMark4});

        btnPrint2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnPrint2.setText("Print");
        btnPrint2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint2ActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdateAverage.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnUpdateAverage.setText("Update Average");
        btnUpdateAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAverageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdateAverage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrint2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdateAverage, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnPrint2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSubject4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubject4ActionPerformed
        
    }//GEN-LAST:event_txtSubject4ActionPerformed

    private void txtMark2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMark2ActionPerformed
        
    }//GEN-LAST:event_txtMark2ActionPerformed

    private void txtMark3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMark3ActionPerformed
        
    }//GEN-LAST:event_txtMark3ActionPerformed

    private void txtAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAverageActionPerformed
        
    }//GEN-LAST:event_txtAverageActionPerformed

    private void btnUpdateAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAverageActionPerformed
        // performed when update average is clicked
        
        // variables to store int values of the subject marks
        int num1, num2, num3,num4, result;
        
        // retrive int values of the strings
        
        num1 = Integer.valueOf(txtMark1.getText());
        
        num2 = Integer.valueOf(txtMark2.getText());
        
        num3 = Integer.valueOf(txtMark3.getText());
        
        num4 = Integer.valueOf(txtMark4.getText());
        
        result = Math.round((num1+num2+num3+num4)/4);
        
        txtAverage.setText(String.valueOf(result) + "%");
    }//GEN-LAST:event_btnUpdateAverageActionPerformed

    //This button is used to save the updated information                                        
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveStudent();
    }//GEN-LAST:event_btnSaveActionPerformed

     //This function is used to save the student’s information
    private void saveStudent(){
        //Saves subject 1
        //Saves mark of subject 1
        student.getSubjects().get(0).setName(txtSubject1.getText());
        student.getSubjects().get(0).setMark(Integer.valueOf(txtMark1.getText()));
        
        //Saves subject 2
        //Saves mark of subject 2
        student.getSubjects().get(1).setName(txtSubject2.getText());
        student.getSubjects().get(1).setMark(Integer.valueOf(txtMark2.getText()));
        
        //Saves subject 3
        //Saves mark of subject 3
        student.getSubjects().get(2).setName(txtSubject3.getText());
        student.getSubjects().get(2).setMark(Integer.valueOf(txtMark3.getText()));
        
        //Saves subject 4
        //Saves mark of subject 4
        student.getSubjects().get(3).setName(txtSubject4.getText());
        student.getSubjects().get(3).setMark(Integer.valueOf(txtMark4.getText()));
    }
     //This button is used to print the file of the student                                          
    private void btnPrint2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint2ActionPerformed
       //Creates a report card for the student
       ReportCard reportCard = new ReportCard(student);
       
       //Saves the student information
       saveStudent();
       
       //Writes the information to the text file
       reportCard.writeToFile();
    }//GEN-LAST:event_btnPrint2ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint2;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdateAverage;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAverage;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JTextField txtAverage;
    private javax.swing.JTextField txtMark1;
    private javax.swing.JTextField txtMark2;
    private javax.swing.JTextField txtMark3;
    private javax.swing.JTextField txtMark4;
    private javax.swing.JTextField txtSubject1;
    private javax.swing.JTextField txtSubject2;
    private javax.swing.JTextField txtSubject3;
    private javax.swing.JTextField txtSubject4;
    // End of variables declaration//GEN-END:variables

    //This is used to set the information of the student in the text file
    public void setStudent(Student student) {
        this.student = student;
        
        //Sets name to student file
        lblStudentName.setText(student.name());
        
        //Sets subject 1 name to student file
        //Sets mark of subject 1 to student file
        txtSubject1.setText(student.getSubjects().get(0).getName());
        txtMark1.setText(String.valueOf(student.getSubjects().get(0).getMark()));
        
        //Sets subject 2 name to student file
        //Sets mark of subject 2 to student file
        txtSubject2.setText(student.getSubjects().get(1).getName());
        txtMark2.setText(String.valueOf(student.getSubjects().get(1).getMark()));
        
        //Sets subject 3 name to student file
        //Sets mark of subject 3 to student file
        txtSubject3.setText(student.getSubjects().get(2).getName());
        txtMark3.setText(String.valueOf(student.getSubjects().get(2).getMark()));
        
        //Sets subject 4 name to student file
        //Sets mark of subject 4 to student file
        txtSubject4.setText(student.getSubjects().get(3).getName());
        txtMark4.setText(String.valueOf(student.getSubjects().get(3).getMark()));
    }
}
