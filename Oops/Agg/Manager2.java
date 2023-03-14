package Agg;

class Vachile{
    int rent;
    String bname;
    String type;
    Vachile(int rent,String bname,String type)
    {
        this.bname=bname;
        this.type=type;
        this.rent=rent;
    }

}
class car{
     Vachile obj;
     int km;
     String driverName;
    car(int km,String name,Vachile obj){
        this.km=km;
        this.driverName=name;
        this.obj=obj;
    }
}

public class Manager2 {
    public static void main(String[] args) {
        Vachile obj=new Vachile(10, "M","com");
        car obj1=new car(10, "raja", obj);
        System.out.println(obj1.driverName);
        System.out.println(obj1.km);
        System.out.println(obj1.obj.bname);
        System.out.println(obj1.obj.rent*obj1.km);
        System.out.println(obj1.obj.type);

    }    
}
