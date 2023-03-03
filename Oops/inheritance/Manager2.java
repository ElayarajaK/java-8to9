class A
{
int value1=10;
public void method1(){
    System.out.println("from method 1");
}
}
class B extends A{
    int value2=100;
    public void method2(){
        System.out.println("from method 2");
    }
}

public class Manager2{
    public static void main(String[] args) {
        A obj = new A();  
        B obj1=new B();        
        obj.method1();
        obj1.method2();
        obj1.method1();
        //obj.method2();
    }
}