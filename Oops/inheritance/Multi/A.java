package inheritance.Multi;

public class A {

    public void method(int...i){
        for(int temp:i){
            System.out.println(temp);
        }
    }

    public void method(boolean...i){
        
        for(boolean temp : i){
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        A obj =new A();

        obj.method(10,400);
        
        obj.method(true);
    }
    
}


class B{

}
class C{

}
class D extends B extends C{

}