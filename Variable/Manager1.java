package Variable;

public class Manager1 {

    static int value;
    int value2;
    public static void main(String[] args) {

       Manager1 obj=    new Manager1();

        System.out.println(value);

        System.out.println(obj.value2);//0///

        System.out.println(Manager1.value);
        System.out.println(obj.value);

    }
    
}
