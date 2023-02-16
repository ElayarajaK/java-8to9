public class Manager2 {


  public static void main(String[] args) {
   //calling the method
   Addition();
   Addition();
   Addition();
   Add(10);
   Add1(100,200);
  } 

/*Declaring the method */
  public static void Addition() {
    System.out.println(" no-arg addition");
  } 

  public static void Add(int i) {
    System.out.println(" 1 args addition : "+i);
  } 
  public static void Add1(int i,int j) {
    System.out.println(" 2 args addition : "+i+j);
  } 




}
