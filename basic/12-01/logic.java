
public class logic {

    /*
         AND(&&)                        
        A         B         C    Result
        
      true     true      false   false
      false   false     true    false
      true   false     true     false
      true   true      true      true
      false  false     false     false

      OR(||)
       A         B         C     Result
       true    true      false   true
       true    false     false   true
       false   true     true     true
       false  false     false    false
       true   true     true      true

    !(NOT)
    
    A 
    true   false
    * 
     * 
     */
    public static void main(String[] args) {

        int ramage=21;
        int vickramage=25;
        int cholaage=30;
        int aadhiage=40;
        
        System.out.println((ramage > vickramage) && (vickramage < cholaage));
        System.out.println((ramage > vickramage) || (vickramage < cholaage));
        System.out.println(!(ramage > vickramage));
        System.out.println(!(ramage > vickramage)&&!(vickramage < cholaage));
        System.out.println("==================");

        System.out.println((ramage<aadhiage) && (vickramage > ramage) && (cholaage<aadhiage) && (vickramage<cholaage));
        
        
        System.out.println((ramage>aadhiage) & (vickramage > ramage) & (cholaage<aadhiage) & (vickramage<cholaage));
        
        System.out.println((ramage>aadhiage) && (vickramage > ramage) || (cholaage > aadhiage));
        
    }
}
