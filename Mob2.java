
class Mobile{
    String brand;
    int price;
    
    public static void show1(){
       System.out.println("ins tatic method");  
    }
}


public class Mob2 {
    public static void main(String a[]){
      Mobile obj1=new Mobile();
      Mobile.show1();
      

    }
}
