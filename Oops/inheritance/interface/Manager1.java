class B{
    /*
     * int interface fields are by deafult static and final
     * methods are public and abstract
     */
    static final int i=10;

    int add(int i,int j){
        return 0;
    }
    String printData(String data){
        return null;
    }
     
   public static void method(){
    System.out.println("i am from static methods");
   }

   /*default void defaultmethods(){
    System.out.println("i am default methods");
   }*/
    
}

class c extends B{
    @Override
    public long add(long i,int j){
        return i+j;
    }
    @Override
    public String printData(String data){
        return data;
    }
} 


public class Manager1 {
    
    public static void main(String[] args) {
        //new B();
     /* c obj =new c();
        System.out.println( obj.add(20, 300));
        System.out.println(obj.printData("Hello all"));
        System.out.println("===========");
        obj.defaultmethods();
        B.method();*/
    }
}
