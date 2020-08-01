public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public Student(){

    }

    public Student(String name, String id, String group, String email){
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
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
    public String getInfo(){
        return name + " - " + id + " - " + group + " - " + email + "/n";
    } 

    public static void main(String[] args){
        Student student1 = new Student();
        student1.setName("Nguyen Van An");
        student1.setId("17020001");
        student1.setGroup("K62CC");
        student1.setEmail("17020001@vnu.edu.vn");
        System.out.println("Name: " + student1.getName());
        System.out.println("Id: " + student1.getId());
        System.out.println("Group: " + student1.getGroup());
        System.out.println("Email: " + student1.getEmail());
        Student student2 = new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn");
        System.out.println(student2.getInfo());
    }
}