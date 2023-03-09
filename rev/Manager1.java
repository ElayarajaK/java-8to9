class Student {
    int s_id;
    String s_name;
    String s_address;
    int marks;

    public Student() {

    }

    public Student(int i, String name, String address, int marks) {
        this.s_id = i;
        this.s_name = name;
        this.s_address = address;
        this.marks = marks;
    }

    public void setid(int sid) {
        this.s_id = sid;
    }

    public int getid() {
        return this.s_id;
    }

    public void setName(String name){
        this.s_name=name;

    }
    public String getName(){
        return this.s_name;
    }


}

public class Manager1 {
    public static void main(String[] args) {
        Student obj = new Student(20112, "Raja", "Chennai", 200);
        System.out.println(obj.s_id + "," + obj.s_name + "," + obj.s_address + "," + obj.marks);
        Student obj1 = new Student();

        obj1.setid(302111);
        System.out.println(obj1.getid());
        obj1.setName("ABJ");
        System.out.println(obj1.getName());
    }

}
