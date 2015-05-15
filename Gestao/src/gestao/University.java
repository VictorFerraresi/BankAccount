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
        for(Course actual : courses) {            
            if(actual.getCourse(code)){
                Course courses.indexOf(actual) = 
                courses.indexOf(actual);
            }
        }
}
    }
}
