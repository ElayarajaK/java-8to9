class A{
    int id=20100;
    A(){
        System.out.println("From Constructer");
    }
}
public class Manager1 {
    public static void main(String[] args) {
      "
      A obj = new A();
      A obj = new A();
      A obj = new A();
      "
      
        A obj = new A();
      obj.id=50100;
        A obj1 = obj;
        A obj2 = obj1;

        System.out.println(obj.id+","+obj1.id+","+obj2.id);
    }
}
