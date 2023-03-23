interface dev1{
//    int method(int i,int j);
    void method();
}
public class Manager3 {
 public static void main(String[] args) {
    
   /*
   ()->{};
   (para1)->{};
   (para1,para2)->{};
   */
  dev1 obj= ()->{
    System.out.println("From lambda");
    
  };
 obj.method();  
 }   
}
