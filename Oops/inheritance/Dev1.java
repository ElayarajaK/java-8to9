
class Tata{
    String B_name;
    float a_profit;
    float totalcost;
    String name;

    Tata(String B_name,float profit,float t_cost,String name){
        this.B_name=B_name;
        this.a_profit=profit;
        this.totalcost=t_cost;
        this.name=name;
    } 
}



public class Dev1 {
   public static void main(String[] args) {
    Tata t1 = new Tata("TCS",20.20f,2.2f,"rathan");

    System.out.println(t1.B_name+","+t1.a_profit+","+t1.name+","+t1.totalcost);//

   } 
}
