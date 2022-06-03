/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.reportcardpro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabi
 */
public class Student {
    private final String firstName;
    private final String lastName;
    private final List<Subject> subjects;
    
    public Student(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = new ArrayList();
        
        subjects.add(new Subject());
        subjects.add(new Subject());
        subjects.add(new Subject());
        subjects.add(new Subject());
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public List<Subject> getSubjects(){
        return subjects;
    }

    public String name() {
        return firstName + " " + lastName;
    }
}
