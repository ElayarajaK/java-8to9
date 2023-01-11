public class Operators3 {
    public static void main(String[] args) {
        int i=0;
        int j=10;
        int k=0;

        k= j++ + ++i + j+ 
            --j+ --i + i++ + 
            j++ + k+ ++j+ --i + 
            i++ + --j + j + j++ + 
            k++ + --i + i++;   
         
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        
        
    }
}
