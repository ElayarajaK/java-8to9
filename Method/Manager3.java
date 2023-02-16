import java.util.Scanner;
public class Manager3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter student id : ");
        int s_id= sc.nextInt();
        System.out.println("Eneter student name : ");
        String s_name=sc.next();
        System.out.println("Eneter student address : ");
        String s_address=sc.next();
        System.out.println("Eneter student marks : ");
        int s_marks=sc.nextInt();
       
        printValue(s_id, s_name, s_address, s_marks);
    }


    public static void printValue(int s_id,String s_name,String s_address,int marks){
        System.out.println("student id is : "+s_id+" , student name is : "+s_name+"he's from : "+s_address+" and marks is : "+marks);
    }

    

    
}
