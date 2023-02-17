public class Manager {
 private int s_id;
 
 public Manager(){

 }

 public Manager(int s_id){
    this.s_id=s_id;
 }

 public int getid(){
    return s_id;
 }

 public void setId(int s_id){
    this.s_id=s_id;
 }


  record RecordManager(int s_id) {    
}
 public static void main(String[] args) {
    Manager obj = new Manager(10);
    System.out.println(obj.getid());

    RecordManager obj1=new RecordManager(10);
    System.out.println(obj1);

 }
}
