final class  College{
    int c_id=300311;
    String c_name="IIT";

     public void sevices(String name){
        System.out.println("providing good education to student");
    }
}

class Staff1 extends College{
   

    int s_id=20112;
    String s_name="Rajesh";
    int Salary=30000;
    @Override
    public void sevices(String name){
        System.out.println("providing learning system");
        
    }
}



public class Manager1 {
    public static void main(String[] args) {
         int i=100;
  
    
        i=200;

        System.out.println(i);
        
        College clg = new College();

        System.out.println(clg.c_name);

        Staff1 obj1= new Staff1();

        System.out.println(obj1.c_id+","+obj1.c_name+","+obj1.s_name+","+obj1.s_id+","+obj1.Salary);
        
        obj1.sevices("raja");
        
    }
}
