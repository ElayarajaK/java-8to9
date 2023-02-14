import java.util.Scanner;

/*
 * do{
 *      logic execute
 * }while(condition);
 * 
 * 
 */

public class Manager5 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the values : ");
                   int values= sc.nextInt();

                    do{
                        values--;

                        System.out.println(values);
                   }
                   while(values > 0 && values < 100);
                   

    }
}
