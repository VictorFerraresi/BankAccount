/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;    
    
    public University(String name){
        this.name = name;        
    }
    
    public Course addCourse(String code, String title, int numCredits, int maxStudents){
        Course c = new Course(code, title, numCredits, maxStudents);
        courses.add(c);
        return c;
    }
    
    public Course updateCourse(String code, String title, int numCredits, int maxStudents){  
        getCourse(code).setTitle(title);
        getCourse(code).setCredits(numCredits);
        getCourse(code).setMaxStudents(maxStudents);
        return getCourse(code);
    }
    
    public UnderGraduateStudent addUnderGraduateStudent(long ID, String name, String address, String phone, 
            String email, String major, String minor){
        UnderGraduateStudent u = new UnderGraduateStudent(ID, name, address, phone, email, major, minor);
        students.add(u);
        return u;
    }
    
    public UnderGraduateStudent updateUnderGraduateStudent(long ID, String name, String address, String phone, 
            String email, String major, String minor){
        getStudent(ID).setName(name);
        getStudent(ID).setAddress(address);
        getStudent(ID).setPhone(phone);
        getStudent(ID).setEmail(email);
        getStudent(ID).setMajor(major);
        getStudent(ID).setMinor(minor);
        return getStudent(ID);
    }
    
    public PostGraduateStudent addPostGraduateStudent(long ID, String name, String address, String phone, 
            String email, String thesisTitle, String supervisor){
        PostGraduateStudent p = new PostGraduateStudent(ID, name, address, phone, email, thesisTitle, supervisor);
        students.add(p);
        return p;
    }
    
    public PostGraduateStudent updatePostGraduateStudent(long ID, String name, String address, String phone, 
            String email, String thesisTitle, String supervisor){
        getStudent(ID).setName(name);
        getStudent(ID).setAddress(address);
        getStudent(ID).setPhone(phone);
        getStudent(ID).setEmail(email);
        getStudent(ID).setThesisTitle(thesisTitle);
        getStudent(ID).setSupervisor(supervisor);
        return getStudent(ID);
    }
    
    public Course getCourse(String code){
        for(Course course : courses) { 
            if(course.getCode().equals(code)){ 
                return course;
            }
        }
        return null;
    }
    
    public Student getStudent(long ID){
        for(Student student : students) { 
            if(student.getID() == ID){ 
                return student;
            }
        }
        return null;
    }
}
