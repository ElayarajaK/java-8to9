/*
    types of variable
    1.local variable
    2.nonstatic variable or instance vatriable
    3.static variable or globel variable

 */


public class Manager6
{
   static int s_id;//static variable heap

   String s_name="Java";
    public static void main(String[] args) {
     int k;//local variable stack
         System.out.println(s_id);
         System.out.println(k);
         Method1();


         System.out.println(s_name);
    }

    public static void Method1(){
        System.out.println(s_id);
    }
 }