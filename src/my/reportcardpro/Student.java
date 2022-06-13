package my.reportcardpro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabi
 */

// This class is used to store information about a student
// including first and last name, subject names and subject marks

public class Student {
    private final String firstName;
    private final String lastName;
    private final List<Subject> subjects;
    
    // create a student by passing in a first and last name using the add button
    public Student(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = new ArrayList();
        
        // creates list of student subjects, more can be added if there are more than 4 courses
        
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
    
    // adds first and last name into one line
    public String name() {
        return firstName + " " + lastName;
    }
}
