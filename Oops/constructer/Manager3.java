class A{
    static{
        System.out.println("from sib A`");
    }

    {
        System.out.println("A IIB");
    }

    A(){
    System.out.println("from cons A");
    }


}
class B{
    static{
        System.out.println("from sib B");
    }

    {
        System.out.println("B IIB");
    }
    B(){
        System.out.println("from B cons");
    }
}

public class Manager3 {
    static{
        System.out.println("from manager3 SIB");
    }
    
    {
        System.out.println("M3 IIB");
    }

    Manager3(){
        System.out.println("from m3 cons");
    }
    public static void main(String[] args) {
        new Manager3();
        new Manager3();

        new A();
        new A();
        new A();

        new B();
        new B();
        new B();
        new Manager3();
    }
}
