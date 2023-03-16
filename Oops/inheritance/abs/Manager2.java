abstract class A1
{
    A1(){
        System.out.println("cons ..");
    }
     void method1()
    {
        System.out.println("from abs");
    }
    
    
    abstract  int amethod1();
    abstract void amethod2();
    abstract String amethod3();
    abstract boolean amethod4();

} 

abstract class A2 extends A1{

     int amethod1(){
        return 0;
     }
     void amethod2(){}
}
class A3 extends A2{
     String amethod3(){
        return "";
     }
     boolean amethod4(){
        return true;
     }
}
class A4 extends A3{

}

public class Manager2 {
    public static void main(String[] args) {
    // A1.method1();
     //new A1();
    
        new A4();
    }
}
