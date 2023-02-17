package returnType;

public class Manager3 {

    public static void main(String[] args) {
      int result=  method1(20,30);

      System.out.println(result);

      System.out.println(method1(100, 200));

      System.out.println( method2());

      long getSalary=(long)method3(30000);
      System.out.println(getSalary);
    }

    static int method1(int i,int j){
        return i+j;
       
    }

    static boolean method2(){

        System.out.println("from method 2");
        return true;
    }

    static double method3(double salary){

        return salary+2000;
    }
    
}
