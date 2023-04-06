import java.util.*; 
public class Manager6 {
    public static void main(String[] args) {
        

        /*int i1[]=new int[10];
        System.out.println(i1.length);
        System.out.println(i[5]);*/
        /*i1[5]=100;
        System.out.println(i1[5]);
        */
        Scanner input=new Scanner(System.in);
        int value=input.nextInt();//100
        int i[]={10,20,30,100,40,5,50,60,70};
        int mid=i.length/2;
        System.out.println(i[mid]);
        String checkValue=null;
        for(int k=0;k<i.length;k++)
        {
            if(i[k] == value)
            {
                checkValue ="index value is : "+k+" value  : "+i[k];
            }
            else{
                checkValue="There is no values";
            }    
    }
        System.out.println(checkValue);
        }
}
