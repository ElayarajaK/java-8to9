class Manager2 {
    
    public static void main(String[] args) {
       

        /*for(int i=0,j=10;i < 10 && j >0;i++,j--){

            System.out.println(i+","+j);

        }*/

        for(int i=0;i < 6;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }


            System.out.println();
            
        }

        for(int i=6;i > 0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }

            
            System.out.println();
            
        }

        
    }
}
