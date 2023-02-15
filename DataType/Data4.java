public class Data4 {
    public static void main(String[] args) {
          short Salary=30000;


        System.out.println(Salary);

        int Person1Salary =(int) Salary;

        System.out.println(Person1Salary);

        float getValue = Person1Salary;
    // float getValue=(float) Person1Salary;  this  is called as auto type  casting i has done bu jvm

        System.out.println(getValue);
        int My_id=3012;
        System.out.println(My_id);
        short short_id =(short)My_id;
        System.out.println(short_id);


        double avgMarks=30.40;

        System.out.println(avgMarks);

        float avgfloatValue=(float)avgMarks;

        System.out.println(avgfloatValue);

        int getValue1=8000;

        short getValuel=(int)getValue1;

        System.out.println(getValuel);
    }
}


/*      ---------------autoconversion------------>
 *      byte-->short-->int-->float-->long-->double
 *      <-------------explicity type casting------- 
        byte<--short<--int<--float<--long<--double
        JVM will not provide auto conversion in this place explicity converion will jvm will expect     
 */