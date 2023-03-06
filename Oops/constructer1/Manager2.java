class C{
    C(){
        System.out.println("no arg");
    }
    C(int i){
        this(10,"raja");
        
        System.out.println("1 arg");
       
    }
    C(int i,String name){
        this();
        System.out.println("2 arg");
    }
    C(int i,String name,String Address){
        System.out.println("3 arg");
    }
}


public class Manager2 {

    public static void main(String[] args) {
        C obj = new C(10);
        
    }
    
}
