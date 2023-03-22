abstract class dev1{
    abstract int add(int i,int j);
    abstract int mul(int i,int j);
    abstract int div(int i,int j);
    abstract int mod(int i,int j);

}
abstract class dev2 extends dev1{
    int add(int i,int j){
        return i+j;
    }        
}

abstract class dev3 extends dev1{
    int mul(int i,int j){
        return i*j;
    }
}
class dev4 extends dev1{

    int div(int i, int j) {
        return i/j;
        }

   
    int mod(int i, int j) {
        return i%j;
    }
    
}

public class Manager3 
{
    public static void main(String[] args) {
    System.out.println("Done");        
    }    
}




