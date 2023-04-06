class flower{
    public void flowerAction(){
        System.out.println("from flower");
    }
}
class rose extends flower{
    public void roseAction(){
        System.out.println("from rose");
    }
}
class sun extends flower{
    public void sunAction(){
        System.out.println("from sun");
    }
}

public class Manager1 {
 public static void main(String[] args) {
    flower obj = new flower();

    flower obj1=(flower) new rose();
    flower obj2 =(flower) new sun();

    flower obj3 = (flower)obj1;//auto upcasting

    obj3.flowerAction();

    Object obj4 =(Object) new flower();
    Object obj5= obj2; 

    System.out.println("Done");
   // obj3.roseAction() invalid
 }   
}
