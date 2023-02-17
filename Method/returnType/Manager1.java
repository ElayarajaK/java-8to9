public class Manager1 {
    public static void main(String[] args) {
        
        Method3("Angular");
    }   
    
    
    public static void Method(String name){
        System.out.println("My name is : "+name);
        Method1("Jhon");

    }

    /* Recursion */
    public static void Method3(String name){
        System.out.println("My name is : "+name);
        Method3("Python");

    }

    public static void Method1(String name){
        Method2("Java");
        System.out.println("My name is : "+name);

    }

     public static void Method2(String name){
        System.out.println("My name is : "+name);

    }
}
