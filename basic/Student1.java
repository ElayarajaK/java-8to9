public class Student1 {
    public static void main(String[] args) {
        
        int Id=2010;
        
        String name="java";

        boolean id=true;
        
        Id=3000;//re-initialization

        System.out.println(Id);
        System.out.println(id);
        System.out.println(name);

        /*
         * variable  name valid & invalid
         * 
         * 999abc  invalid
         * abc     valid
         * abc99   valid
         * _abc99  valid
         * _abc_99  valid
         * abc@3%   invalid
         * 
         */
        
    }    
}
