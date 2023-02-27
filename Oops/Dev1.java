class Student{
    int s_id;
    String s_name;

    public void Assist(){
        System.out.println("Student Assist : ");
    }
}
class Teacher{
    int t_id;
    String t_name;
    int salary;
    public void Assist(){
        System.out.println("Teacher assiste : "+t_name+", "+t_id+", "+salary);
    }

}


public class Dev1 {


  public static void main(String[] args) 
  {
   Student student1 =  new Student();
    Teacher teacher1 =new Teacher();
    Student student2 =  new Student();
    Student student3 =  new Student();
    Student student4 =  new Student();

    student1.Assist();
    teacher1.Assist();
    Teacher teacher2 =new Teacher();
    Teacher teacher3 =new Teacher();
    Teacher teacher4 =new Teacher();
    teacher4.salary=40000;
    Teacher teacher5 =new Teacher();
    System.out.println(teacher2.salary +","+teacher1.salary+", "+teacher4.salary);
  }  
}
