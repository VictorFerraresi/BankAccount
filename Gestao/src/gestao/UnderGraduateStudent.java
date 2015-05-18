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
        super(ID, name, address, phone, email);        
        this.major = major;
        this.minor = minor;
    }
    
    public String getMajor(){
        return this.major;
    }
    
    public String getMinor(){
        return this.minor;
    }
    
    public void setMajor(String major){
        this.major = major;
    }
    
    public void setMinor(String minor){
        this.minor = minor;
    }
    
    @Override
    public String toString(){
        String sformat = String.format("teste");
        return sformat;
    }
    
}
