/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao;

/**
 *
 * @author 41419839
 */
public class Course {
    private String code;
    private String title;
    private int numCredits;
    private int maxStudents;
    
    public Course(String code, String title, int numCredits, int maxStudents) {
        this.code = code;
        this.title = title;
        this.numCredits = numCredits;
        this.maxStudents = maxStudents;
    }

    public String getCode(){
        return this.code;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setCredits(int numCredits){
        this.numCredits = numCredits;
    }
    
    public void setMaxStudents(int maxStudents){
        this.maxStudents = maxStudents;
    }
}
