class m1{
    int i;
} 
class m2 extends m1{
    int j;
}
class m3 extends m2{
    int k;
}

public class Manager5 {
   public static void main(String[] args) {
    int i=(int) 10;
    
    m1 obj = (m1)new m1();
    m2 obj1 = new m2();
    m1 obj2 =(m1) new m2();
    m2 obj3= obj;

    System.out.println(obj2.i);
  //  System.out.println(obj2.j);
    System.out.println("Done");
   }

    

}
