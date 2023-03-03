class College{
    int c_id=30112011;
    String c_name="IIT";
}
class Teacher1 extends College{
    int t_id=1810;
    String t_name="Raja";
}
class Teacher2 extends College{
    
    int t_id=4011;
    String t_name="APJ";
}
public class Manager1 {
    public static void main(String[] args) {
        Teacher1 teac1= new Teacher1();
        System.out.println();

     /*    System.out.println(teac1.t_id);
        System.out.println(teac1.t_name);

        System.out.println(teac1.c_id);
        System.out.println(teac1.c_name);*/
        System.out.println(teac1.t_id+", "+teac1.t_name+","+teac1.c_id+","+teac1.c_name);
        System.out.println(teac1);
        Teacher2 tech2 = new Teacher2();

        System.out.println(tech2.t_id+","+tech2.t_name+","+tech2.c_id+","+tech2.c_name);


        College clg=new College();
        System.out.println(clg.c_id);
        System.out.println(clg.c_name);

        System.out.println(clg.t_id);
        
        
    }
}

