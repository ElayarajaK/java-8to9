interface B{
    static final int i=10;
    
}
class c implements B{
int j=10;
}

public class Manager1 {
    
    public static void main(String[] args) {
        //new B();

        System.out.println(B.i);
    }
}
