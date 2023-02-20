public class Manager4 {
    
    public static void main(String[] args) {
        
        int arr1[]={10,20,30,40,50,60,50,60};
       //            0  1  2  3  4  5  6  7

        int retArr[]=   method3(arr1);
        System.out.println(retArr[5] +","+retArr[3]+","+retArr[1]);
        System.out.println(retArr.length);
        
        System.out.println("from begin");
        byte values=100;
        System.out.println(Method(values));

       int values1= Method((byte)100);    
       System.out.println( values1);

       System.out.println(method2(550));
    
    }
      
      

    public static  int Method(byte number1){

        byte addnumber=number1;

        return addnumber;
    } 


    public  static short method2(int values){

        return (short)(values + values);
    }

    public static int[] method3(int valus[]){

        return valus;
    }
    
}
