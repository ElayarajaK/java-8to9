public class Manager1 {

    static void method4(){
        System.out.println("from method 4");
    }
    public static void main(String[] args) {
        method();
        
        method1();

        method3();

        method4();

        System.out.println("End");
    }


     static void method(){
      System.out.println("From method ");
      method1();  
    }

    static void method1(){
        method3();
        System.out.println("from method 1");
        method4();
    }
    static void method3(){
        System.out.println("from method 3");
    }

    /* returntype methodidentifier(){

    }
     * 
     * 
     * 
     */
}
