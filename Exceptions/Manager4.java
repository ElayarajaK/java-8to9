class A{
    int i;
}
class B extends A{
    int j;
}
public class Manager4 {
    public static void main(String[] args) {
        System.out.println("begin");
        System.out.println(1);
        try{
            System.out.println(2);
            System.out.println(1/0);
            System.out.println(3);
        }
        catch(ArithmeticException ae){
            System.out.println(4);
        }

        /*
        try{

        }
        System.out.println("invalid");
        catch(ArithmeticException ae){

        } */
       int i=100;

        System.out.println("1st Done");

        System.out.println("====================");
        System.out.println(1);
        try{
            System.out.println(2);
            System.out.println(3);

        }
        catch(Exception E){
            System.out.println(4);
        }

        System.out.println("2nd done");

        System.out.println("===============");

        System.out.println(1);
        
        A obj=new A();

        try{
            
        B obej1=(B)obj;
        }
        catch(ClassCastException cce){
            System.out.println("Exception handled");
        }
        System.out.println("Finished");

            String name="Java is biggest";

            try{
                name.charAt(100);
            }
            catch(RuntimeException aaa){

            }

            System.out.println("Done");
          


            

        
    }
    
}
