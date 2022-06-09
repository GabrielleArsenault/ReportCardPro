package my.reportcardpro;

import java.io.IOException;
import java.io.PrintStream;
import javax.swing.JOptionPane;

/**
 *
 * @author arseg9290
 */

// This class is used to create the txt files/final report card. 
// To use the ReportCard class you must pass in a student in order to get the correct information printed

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
        
        // used in printing buttons
        // creates a txt file called the student's last name . txt to write to
        
        try (PrintStream out = new PrintStream (student.getLastName() + ".txt");){
           
            // first line prints the name of student
             
            out.println(student.name());
            out.println();
            
            // variables that will keep track of marks and # of courses to calculate average
            
            int totalMark = 0;
            int courseCount = 0;
            
            // for each subject a student has, the name and mark get printed on the same line
            
            for(Subject subject : student.getSubjects()) {
                
                out.println(subject.getName() + ": " + subject.getMark() + "%");
                out.println();
                
                // adds marks together and course count goes up by one
                
                totalMark += subject.getMark();
                courseCount++;
            }
            
            // displaying / calculating average by dividing the added up marks by the course count 
            // (rounds to the nearest percentage)
            
            out.println();
            out.println("Average: " + Math.round(totalMark / courseCount) + "%");
            
         } catch (IOException e) {
             
            // in case an error occurs, the string message will appear as a pop up window
             
            JOptionPane.showMessageDialog(null, "Error occurred, please try again");
        }
    }
}
