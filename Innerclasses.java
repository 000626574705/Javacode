
class A{
    int age;
    public void show(){
    System.out.println("In show");

    }
    class B{
        public void config(){
            System.out.println("In config");
        }
    }
}




public class Innerclasses {

    public static void main(String a[]){
    A obj =new A();
    obj.show();
   // A.B obj1=new B();
     A.B obj1=obj.new B();
     obj1.config();

    }
}
