package Agg;

class Product{
    public void method1(Product p1){
        System.out.println("from method product");
    }

    public Product method2(Product obj)
    {
        //return obj
        return new Product();
    }
}
class Order{
    public void method1(Order o1){
        System.out.println("from method order");
    }
}
public class Manager1 {
    public static void main(String[] args) {
        Product obj =new Product();
        Product obj1 =obj;
        Product obj2 =obj;
        Product obj3 =new Product();
        Product obj4 =new Product();

        Product obj5 = obj.method2(obj);
        Product obj6= obj.method2(obj);
        Product obj7 = obj.method2(obj);
        Product obj8 = obj.method2(obj);

        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj4.hashCode());
        System.out.println(obj5.hashCode());
        System.out.println(obj6.hashCode());
        System.out.println(obj7.hashCode());
        System.out.println(obj8.hashCode());

        Order o1= new Order();
        obj.method1(obj);
        o1.method1(o1);
    }
}
