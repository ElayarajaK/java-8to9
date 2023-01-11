class Operators1 {
    public static void main(String[] args) {
        int i=0;
        int j=10;
        int k =0;

        k=++i + j++ + i++ + ++j + ++i +i;
    //     1  +  10 +  1  + 12 +  3  3+

        System.out.println(i +","+j+","+k);

        /*System.out.println(i++);   //0
        System.out.println(++i);//2
        System.out.println(i--);//2
        System.out.println(--i);//0
        */
    }
    
}
