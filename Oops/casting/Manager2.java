class Tata{
    public void tataInAction(){
        System.out.println("Tata Ride");
    }
}
class Altraz extends Tata{
    public void altrazAction(){
        System.out.println("Altraz Ride");
    }
}
public class Manager2 {
   public static void main(String[] args) {
    Tata parent = new Altraz();
    Altraz child =(Altraz)parent; // explicit down casting
    System.out.println("Done");
    child.altrazAction();
    child.tataInAction();  
    System.out.println(parent instanceof Altraz);  
     
    System.out.println("=======================");
    Tata obj = new Tata();
    Altraz obj1 = new Altraz();
    System.out.println(obj instanceof Altraz);
    Altraz obj2=null;
    if(obj instanceof Altraz)
    {
        obj2 =(Altraz) obj;
    }

    //obj2.tataInAction();
    //obj2.altrazAction();
} 
}
