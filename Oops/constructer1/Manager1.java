class B{
    int s_id;
    String s_name;
    String s_address;


    public B(int i, String name, String address) {
        this.s_id =i;
        this.s_name=name;
        this.s_address=address;

    
    }
    

}
public class Manager1 {
   public static void main(String[] args) {
     B obj = new B(2011,"Raja","Chennai");
     B obj1 = new B(2012,"Kiran","Chennai");
    
     B obj2 = new B(2013,"sam","Chennai");
    
    System.out.println(obj.s_id);
    System.out.println(obj.s_name);
    System.out.println(obj.s_address);

    System.out.println(obj1.s_id);
    System.out.println(obj1.s_name);
    System.out.println(obj1.s_address);

    System.out.println(obj2.s_id);
    System.out.println(obj2.s_name);
    System.out.println(obj2.s_address);
    } 
}
