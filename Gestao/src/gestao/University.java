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
    private ArrayList<Registration> registrations;
    
    public University(String name){
        this.courses = new ArrayList<Course>();
        this.students = new ArrayList<Student>();
        this.registrations = new ArrayList<Registration>();
        this.name = name;        
    }
    
    public Course addCourse(String code, String title, int numCredits, int maxStudents){
        Course c = new Course(code, title, numCredits, maxStudents);
        courses.add(c);
        return c;
    }
    
    public Course updateCourse(String code, String title, int numCredits, int maxStudents){  
        Course crs = getCourse(code);
        crs.setTitle(title);
        crs.setCredits(numCredits);
        crs.setMaxStudents(maxStudents);
        return crs;
    }
    
    public UnderGraduateStudent addUnderGraduateStudent(long ID, String name, String address, String phone, 
            String email, String major, String minor){
        UnderGraduateStudent u = new UnderGraduateStudent(ID, name, address, phone, email, major, minor);
        students.add(u);
        return u;
    }
    
    public UnderGraduateStudent updateUnderGraduateStudent(long ID, String name, String address, String phone, 
            String email, String major, String minor){
        Student sid = getStudent(ID);
        sid.setName(name);
        sid.setAddress(address);
        sid.setPhone(phone);
        sid.setEmail(email);
        ((UnderGraduateStudent)sid).setMajor(major);
        ((UnderGraduateStudent)sid).setMinor(minor);
        return ((UnderGraduateStudent)sid);
    }
    
    public PostGraduateStudent addPostGraduateStudent(long ID, String name, String address, String phone, 
            String email, String thesisTitle, String supervisor){
        PostGraduateStudent p = new PostGraduateStudent(ID, name, address, phone, email, thesisTitle, supervisor);
        students.add(p);
        return p;
    }
    
    public PostGraduateStudent updatePostGraduateStudent(long ID, String name, String address, String phone, 
            String email, String thesisTitle, String supervisor){
        Student sid = getStudent(ID);
        sid.setName(name);
        sid.setAddress(address);
        sid.setPhone(phone);
        sid.setEmail(email);
        ((PostGraduateStudent)sid).setThesisTitle(thesisTitle);
        ((PostGraduateStudent)sid).setSupervisor(supervisor);
        return ((PostGraduateStudent)sid);
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
    
    public ArrayList<Course> getCourses(long studentID){       
       return getStudent(studentID).getCourses();
    }
    
    public ArrayList<Student> getStudents(String courseCode){
       return getCourse(courseCode).getStudents();
    }
    
    public Registration getRegistration(long studentID, String courseCode){
        Student sid = getStudent(studentID);
        Course cid = getCourse(courseCode);
        for(Registration registration : registrations) { 
            if(sid.equals(registration.getStudent()) && cid.equals(registration.getCourse())){ 
                return registration;
            }
        }
        return null;
    }
    
    public boolean registerStudent(long studentID, String courseCode){
        Student std = getStudent(studentID);
        Course crs = getCourse(courseCode);
        if(crs.getMaxStudents() <= crs.getActualStudents()){
            System.out.println("Este curso está lotado. Falhou."); //TODO
            return false;
        }
        int year = 1; int semester = 2; //TODO
        Registration reg = new Registration(std, crs, year, semester);
        
        std.registerCourse(crs);
        crs.registerStudent(std);
        
        registrations.add(reg);
        return true;
    }
    
    public boolean deRegisterStudent(long studentID, String courseCode){                
        if(getRegistration(studentID, courseCode) == null){
            System.out.println("Este aluno não está registrado neste curso."); //TODO
            return false;
        }
        
        Registration reg = getRegistration(studentID, courseCode);
        Student std = getStudent(studentID);
        Course crs = getCourse(courseCode);
        
        std.deRegisterCourse(crs);
        crs.deRegisterStudent(std);
        
        registrations.remove(reg);
        return true;
    }
    
    public String getCourses(){
        String formatcourses = "Formate a arraylist courses"; //TODO
        return formatcourses;
    }
    public String getStudents(){
        String formatstudents = "Formate a arraylist students"; //TODO
        return formatstudents;
    }
}