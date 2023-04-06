public class Manager7 {
    public static void main(String[] args) {
        System.out.println("Hi ..");


        try{
            System.out.println(10/0);

        }
        catch(ArithmeticException AE)
        {
            AE.printStackTrace();
            System.out.println("=============");
            System.out.println(AE);
            System.out.println("=============");
            System.out.println(AE.getMessage());
            System.out.println("=============");
        }
        catch(Exception E)
        {

        }

        System.out.println("Done");



        int []a={10,20};

        System.out.println("2nd ---->");

        try{
            System.out.println(1);
            System.out.println(a[10]);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
