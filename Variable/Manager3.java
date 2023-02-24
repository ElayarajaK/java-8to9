public class Manager3 {
    
    public void method1(){
        System.out.println("from method1");
    }

    public void method1(int i){
        method1(100,200);
        System.out.println("again from method 1 "+i);
    }

    void method1(int value,int value1){
        System.out.println("2arg : "+value+","+value1);
    }

public static void main(String[] args) {
    Manager3 obj=new Manager3();
    obj.method1();
    obj.method1(100);
   
}
}
