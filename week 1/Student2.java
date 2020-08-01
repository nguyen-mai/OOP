public class Student2 {
    private String name;
    private String id;
    private String group;
    private String email;

    public Student2(){
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    public Student2(String name, String id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    public Student2(Student2 other){
        
    }

    public String getInfo(){
        return name + " - " + id + " - " + group + " - " + email;
    } 

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getGroup(){
        return group;
    }

    public void setGroup(String group){
        this.group = group;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}