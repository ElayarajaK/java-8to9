import java.util.Scanner;

public class Con2 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the sethil marks");
        int sethil = input.nextInt();
        /*System.out.println("Enter the raj marks");
        int raj = input.nextInt();
        System.out.println("Enter the kamal marks");
        int kamal = input.nextInt();
        System.out.println("Enter the vickram marks");
        int vickram = input.nextInt();*/

        if(sethil <= 35){
            if((sethil >0)&&(sethil <10)){
                System.out.println("Great Job");

            }
            else if((sethil <=20)&&(sethil>=10)){
                System.out.println("Give More Hard work");
            }
            else if((sethil <=30)&&(sethil>=20)){
                System.out.println("well try will pass on next");
            
            }
            else{
                System.out.println("ask with teachers make it as pas matrks");
            }
           
        }
        else if((sethil < 50)&&(sethil > 35)){

            System.out.println("your grade is C ");
        }
        else if((sethil <65) && (sethil >= 50)){
            System.out.println("Grade B");
        }
        else{
            System.out.println("grade S");
        }


        System.out.println("End");
        
    }

    
    
}
