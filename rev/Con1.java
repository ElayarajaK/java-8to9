

/*(&&)
    A       B        C     Result

    true    true    false    false
    true    false   false    false
    false   false   false    false
    true    true    true     true
 * 
 * 

 */

 /*(OR (||))

 A           b      c       Result
 True       false  true       true
 true       true   true       true
 false      false  false      false         
 */

public class Con1 
{
    public static void main(String[] args) 
    {
        int person1=30;
        int VotingAge=18;
        int person2=25;
        int person3=28;
          System.out.println(VotingAge > person1 || VotingAge < person2);
          System.out.println((VotingAge > person3) && (person3 < person1) & (person1> VotingAge));



          System.out.println(!(VotingAge > person1) && !(person2 > VotingAge));
          

    }
}
