import java.lang.reflect.Array;

public class Manager5 {

    public static void main(String[] args) {
        
        int values[] = {10,20,30,40,50,60,60,70,80,90};

        int arr[]=new int[10];
        arr[5]=100;
        arr[7]=200;

        System.out.println(arr[5]);

        System.out.println(arr.length);

        System.out.println(values[3]);
        System.out.println(values[values.length-1]);


        for(int i=0; i < arr.length;i++){
            System.out.println("index value : "+ arr[i]);
        }
    }    
}
