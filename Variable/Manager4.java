package Variable;

public class Manager4 {

    public void method1(int... values){
       for(int i=0; i< values.length;i++){
        System.out.print(values[i]+",");
       }
       System.out.println();
    }

    public static void main(String[] args) {
        Manager4 obj = new Manager4();

        obj.method1(10);
        obj.method1(10,20);
        obj.method1(10,20,30);
        obj.method1(10,20,30,40);
        
    }
    
}
