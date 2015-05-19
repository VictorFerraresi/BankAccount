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
public class Student {
    protected long ID;
    protected String name;
    protected String address;
    protected String phone;
    protected String email;
    protected ArrayList<Course> courses;
    
    public Student(long ID, String name, String address, String phone, String email){
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.courses = new ArrayList<Course>();
    }
    
    public long getID(){
        return this.ID;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void registerCourse(Course course){
        this.courses.add(course);
    }
    
    public void deRegisterCourse(Course course){
        this.courses.remove(course);
    }
    
    public ArrayList<Course> getCourses(){
        return this.courses;
    }
    
    @Override
    public boolean equals(Object obj){
        return (this == obj);
    }
    
    @Override
    public String toString(){
        String sformat = String.format("teste");
        return sformat;
    }
    
}
