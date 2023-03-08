class Tata{
    Tata(){
        super();
        System.out.println("TATA conns");
    }
    Tata(int id,String name){
        System.out.println(id+","+name);
    }
    {
        System.out.println("tata iib");
    }
    
    static{
        System.out.println("SIB TATA");
    }
}
class TCS extends Tata{
    TCS(){
        System.out.println("tcscons");
    }
    TCS(String Tech){
        super(1011,"Tata Group");        

        System.out.println(Tech);
    }
    {
        System.out.println("tcs iib");
    }
        static{
        System.out.println("SIB TCS");
    }
}
class TSteal extends TCS
{
    TSteal(){

        System.out.println("tscons");
    }
    TSteal(String name,double ticome,int profit){
        
        System.out.println(name+","+ticome+","+profit);
    }
    {
        System.out.println("ts iib");
    }

    static{
        System.out.println("SIB TS");
    }
} 

public class Manager2 {
    public static void main(String[] args) {
        TSteal obj = new TSteal("TATA Group",30.4,5);
        TCS obj1 = new TCS("Ratan");
    }
}
