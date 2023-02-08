class Manager4 {
/*
 * while(condituin){
 *          logic execute
 * }
 */
    public static void main(String[] args) {
        System.out.println("Begin");

        

        int value=0;
        int value2=10;
        while(value < 10){

            while(value2 > 0)
            {
                value2--;

                System.out.print(value2 +",");
            }
            System.out.println(value);
            value++;
        }
    }
    
}
