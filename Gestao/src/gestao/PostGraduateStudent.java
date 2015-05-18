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
public class PostGraduateStudent extends Student {
    private String thesisTitle;
    private String supervisor;
    
    public PostGraduateStudent(long ID, String name, String address, String phone, String email, String thesisTitle,
            String supervisor){
        super(ID, name, address, phone, email);       
        this.thesisTitle = thesisTitle;
        this.supervisor = supervisor;
    }
    
    public void setThesisTitle(String thesisTitle){
        this.thesisTitle = thesisTitle;
    }
    
    public void setSupervisor(String supervisor){
        this.supervisor = supervisor;
    }
}
