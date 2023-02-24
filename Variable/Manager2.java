public class Manager2 {

   int salary=20000;

    public static void doWorking(int salaryInc){
        Manager2 obj = new Manager2();
        System.out.println("Working is process "+obj.salary);
    }

    public static void main(String[] args) {
        Manager2 worker1 = new Manager2();

        //System.out.println(worker1.i);
        worker1.salary=worker1.salary+200;
        worker1.doWorking(worker1.salary);

        worker1.stopworing();
        Manager2 worker2 = new Manager2();

        worker2.doWorking(worker2.salary);
    
    }    

    public static void stopworing()
    {
        System.out.println("Stop working");
    }
}
