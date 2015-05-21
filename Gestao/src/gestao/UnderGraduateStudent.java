package gestao;

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
       return "\n ID: "+super.ID+"\n Nome: "+super.name+"\n Address: "+super.address+"\n Phone: "+super.phone+"\n Email: "+super.email+"\n Minor: "+this.getMinor()+"\n Major: "+this.getMajor();
    }
    
}
