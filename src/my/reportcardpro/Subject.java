package my.reportcardpro;

/**
 *
 * @author gabi
 */

// This class is used to keep track of subjects
// handles the suject names and marks

public class Subject {
    private String name;
    private int mark;
    
    public Subject(){
        super();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getMark(){
        return mark;
    }
    
    public void setMark(int mark){
        this.mark = mark;
    }
}
