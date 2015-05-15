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
public class UnderGraduateStudent extends Student {
    private String major;
    private String minor;
    
    public UnderGraduateStudent(long ID, String name, String address, String phone, String email, String major,
            String minor){
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.major = major;
        this.minor = minor;
    }
    
    public String getMajor(){
        return this.major;
    }
    
    public String getMinor(){
        return this.minor;
    }
    
}
