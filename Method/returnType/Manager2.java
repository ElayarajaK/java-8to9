public class Manager2 {
static int i=10;
    public static void main(String[] args) {
        System.out.println("From main 1");
        method1(null);
    }

    public static void method1(String name){
        System.out.println("From method 1"+name);
        if(i ==10)
        {
            ++i; 
            main(null);
          
            
        }
    }
    
}
