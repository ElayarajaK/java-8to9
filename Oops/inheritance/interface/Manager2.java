@FunctionalInterface
interface app1{
    int value=10;
    void method1();
    public static void method3(){

    }
    default void method4(){

    }
}

public class Manager2 {
    public static void main(String[] args) {
        app1 obj = new app1(){
            public void method1(){
                System.out.println("from annanymous");
            }
        };

        obj.method1();
        obj.method4();
    }
}
