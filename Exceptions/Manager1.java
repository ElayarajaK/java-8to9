import java.io.*;
class A{
int j;
}
class B extends A{
int i;
}
class Manag{
    public static void main(String[] args) {
        System.out.println("Hello ");

   ///    System.out.println(10/0); 

       int i[]={10,20,30,40};
       System.out.println(i[0]);
       System.out.println(i[0]);
    //   System.out.println(i[4]); 
       
       String name[]={"raja","kamal","java","python"};
      // System.out.println(name[4]);

       String name1="Raja";
       System.out.println(name1.length());
       //System.out.println(name1.charAt(10));SIOBE
        A obj= new A();
        B obj1 = new B();

        A obj2 =(A) new B();

        //B obj3=(B) obj;(CCE)

        ///System.out.println(obj3.j);

       /// Manager1 obj5 = new Manager1();
        //obj5.method1(20);

      // FileWriter fw =new FileWriter("Hello.txt");
      // File obj5=new File("Hello.txt"); 
      // System.out.println(obj5.exists());

       Thread.sleep(1000);
       System.out.println("Done");
    }


    public int method1(int i){
        return 0;
        
    }
    public long method1(short i){
        return 0;
       
    }

    
}


/*    
 * Throwable-->Exception -->RuntimeException->ArithmeticException
 *     
 */