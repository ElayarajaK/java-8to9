import java.util.Scanner;

public class Con1 {
    /*
     * synta
     * 
        if(true){
            //statement
        }
     */
    public static void main(String[] args) {
        System.out.println("If stmt");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int myage=sc.nextInt();
        if(myage < 18){
            System.out.println("i am not eligible for the voting : "+myage);
        }
        else{
            System.out.println("i am eligible : "+myage);
        }









        //int age=10;
       /* if(false)
        {
            System.out.println("Hello i am big man");
        }
        else{
            System.out.println("Hello i am small");
        }*/




    }
    
}
