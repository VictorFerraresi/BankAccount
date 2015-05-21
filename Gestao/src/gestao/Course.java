/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao;

import java.util.ArrayList;

/**
 *
 * @author 41419839
 */
public class Course {
    private String code;
    private String title;
    private int numCredits;
    private int maxStudents;
    private ArrayList<Student> students;
    
    public Course(String code, String title, int numCredits, int maxStudents) {
        this.code = code;
        this.title = title;
        this.numCredits = numCredits;
        this.maxStudents = maxStudents;
        this.students = new ArrayList<Student>();
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
    
    public int getMaxStudents(){
        return this.maxStudents;
    }
    
    public int getActualStudents(){
        return students.size();
    }
    
    public int getNumCredits(){
        return this.numCredits;
    }
    
    public void registerStudent(Student student){
        this.students.add(student);
    }
    
    public void deRegisterStudent(Student student){
        this.students.remove(student);
    }
    
    public ArrayList<Student> getStudents(){
        return this.students;
    }
    
    @Override
    public boolean equals(Object obj){
        return (this == obj);
    }

    @Override
    public String toString() {
        return "Course{" + "code=" + code + ", title=" + title + ", numCredits=" + numCredits + ", maxStudents=" + maxStudents + '}';
    }
    
}
