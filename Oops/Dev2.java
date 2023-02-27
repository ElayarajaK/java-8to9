class A{
    A(){
        System.out.println("constructer");
    }

    public void run(){
        System.out.println("Running ...");
    }
}

public class Dev2 {
    public static void main(String[] args) {
       new A() ;  
       new A() ;  
       new A() ;       
       
    }
    
}
