class Mobile{

    //instance variables
    String brand;
    int price;
    String network;
    //static instance variable we can make it common value for all if we change value of variable it affect all object variable value
   //we can also call it by name with class namme :-classname.variable
   //using static we make it as class variable
    static  String name;

    static{ //called once& first irrespective oof number of objects u created
        name="Piush";
    }


    //this show() method will allow to print all object value 
   
    public void show(){
        System.out.println(brand +" :" + price +" "+name );
    }

}


public class Mob {
    public static void main(String a[]){

        //Class.forName(className:"Mobile");  it loads class Mobile
      Mobile obj1=new Mobile();
      obj1.brand="Apple";
      obj1.price=10000;
      obj1.name="Harish";

      Mobile obj2=new Mobile();
      obj2.brand="Redmi";
      obj2.price=8000;
      obj2.name="Shreeti";

      Mobile obj3=new Mobile();
      obj3.brand="Samsung";
      obj3.price=17000;
      obj3.name="Sujal";

      obj1.name="phone";

      obj1.show();
      obj2.show();
      obj3.show();

    }
    
}
