/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.reportcardpro;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author arseg9290
 */
public class ReportCard {
    private Student student;
    
    public ReportCard(Student student) {
        super();
        this.student = student;
    }
    
    public Student getStudent() {
        return student;
    }
    
    public void writeToFile() {
         try (PrintStream out = new PrintStream (student.getLastName() + ".txt");){
            
            out.println(student.name());
            out.println();
            
            int totalMark = 0;
            int courseCount = 0;
            
            for(Subject subject : student.getSubjects()) {
                out.println(subject.getName() + ": " + subject.getMark() + "%");
                out.println();
                
                totalMark += subject.getMark();
                courseCount++;
            }
            
            out.println();
            out.println("Average: " + Math.round(totalMark / courseCount) + "%");
            
         } catch (IOException e) {
             JOptionPane.showMessageDialog(null, "Error occurred, please try again");
         }
    }
}
