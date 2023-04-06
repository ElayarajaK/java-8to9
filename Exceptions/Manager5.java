
public class Manager5 
{
    int i=10;
    public static void main(String[] args) 
    {
        System.out.println(1);

       try{
        Manager5 obj=(Manager5)new Object();
        System.out.println(obj.toString());
       }
       catch(ClassCastException ce){
        System.out.println("Handled "+ce);
       }

       System.out.println("Done");
       
       
       
        //System.out.println(obj.i);

       System.out.println("===================");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            //System.out.println(e);
          //java.lang.ArithmeticException: / by zero
            //e.printStackTrace();
            /*
             * java.lang.ArithmeticException: / by zero
        at Manager5.main(Manager5.java:25)
             */
            //    / by zero
            System.out.println(e.getMessage());
        }   
        System.out.println("Done 1 ");     
    


    try{

    }
    
    catch(Exception e23){
        
    }
    catch(ArithmeticException ae){
        System.out.println(1);
    }
    catch(ClassCastException ar)
    {
        System.out.println(2);
    }
    catch(IndexOutOfBoundsException a3){
        System.out.println(4);
    }
    
}
}
