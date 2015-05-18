/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao;

/**
 *
 * @author Victor
 */
public class Registration {
    private Student student;
    private Course course;
    private int acadYear;
    private int semester;
    
    public Registration(Student student, Course course, int acadYear, int semester){
        this.student = student;
        this.course = course;
        this.acadYear = acadYear;
        this.semester = semester;
        
    }
    
    public Student getStudent(){
        return this.student;
    }
    
    public Course getCourse(){
        return this.course;
    }
    
    public int getAcadYear(){
        return this.acadYear;
    }
    
    public int getSemester(){
        return this.semester;
    }
}
