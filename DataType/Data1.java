/*   primitive datatype
 *      decimal point datatype
 *          1.byte (1 byte)(-128 to 127)
 *          2.short (2 bytes)
 *          3.int  (4 bytes)
 *          4.long (8 bytes)
 *          5.float (4 bytes)
 *          6.double (8 bytes)
        boolean datatype
            7.boolean
        charecter datatype
           8. char(2 bytes)

    non-primitive datatype
        1.String 
 */
public class Data1 {

public static void main(String[] args) {
    
    //byte minValues=-129;

    //System.out.println(minValues);

    System.out.println(Short.MIN_VALUE);
    System.out.println(Short.MAX_VALUE);

    short MinValue=-32768;
    short Maxvalues=32767;

    System.out.println("Max values for short "+Maxvalues);
    
    System.out.println("Max values for short "+MinValue);

    System.out.println("fsdaf : "+Double.MIN_VALUE);
    System.out.println(Double.MAX_VALUE);

    int IntMaxValue=2147483647;
    int Intminvalue=-2147483648;
    System.out.println("Int Max : "+IntMaxValue);
    System.out.println("Int Min : "+Intminvalue);

    long LongMaxVal=9223372036854775807l;
    long LongMinVal=-9223372036854775808l;
    System.out.println("Long Max :"+LongMaxVal);
    System.out.println("Long Min :"+LongMinVal);

    char values='\u0171';

    System.out.println(values);

    float avg=20.30f;

    System.out.println("Float min values : "+Float.MAX_VALUE);
    System.out.println("Float Max values : "+Float.MIN_VALUE);

    System.out.println("Double Max values :"+Double.MAX_VALUE);
    System.out.println("Double min values :"+Double.MIN_VALUE);

}    
    
}
