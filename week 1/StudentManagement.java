public class StudentManagement {
    private String name;
    private String id;
    private String group;
    private String email;

    public StudentManagement(){

    }

    public StudentManagement(String name, String id, String group, String email){
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public boolean equals(StudentManagement other){
        if(this.getGroup().equals(other.getGroup())){
            return true;
        }
        return false;
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
    public static void main(String[] args) {
        StudentManagement student1 = new StudentManagement("A", "001", "K62", "A@vnu.edu.vn");
        StudentManagement student2 = new StudentManagement("B", "002", "K62", "B@vnu.edu.vn");
        System.out.println(student1.equals(student2));
    }
}