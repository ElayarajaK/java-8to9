public class Manager8 {
    public static void main(String[] args) {
        System.out.println(1);
        try{
            for(int i=0;i<10;i++)
            {
            Thread.sleep(0);
            System.out.println(i);
            }
        }
        catch(InterruptedException exp){

        }
        System.out.println("Done");

        try{
            Class.forName("Manager8");
        }
        catch(Exception e){
            e.printStackTrace();
        }
               
    }
    
}
