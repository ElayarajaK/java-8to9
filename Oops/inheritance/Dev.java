class Consumer{
    int c_id;
    String c_name;
    String p_name;
    int price;

    /*public Consumer(int i,int j){
        System.out.println("from default const "+i+","+j);
    }*/

    /*public Consumer(){
        super();
    }*/
    
    public Consumer(String name){
        System.out.println(name);
    }

}
public class Dev{
    public static void main(String[] args) {
       // Consumer obj =new Consumer(10,20); 
       Consumer obj = new Consumer("name");

       //Consumer obj1= new Consumer();
    }
}