class A{   //super class
   public A(){
    super();
    System.out.println("in A");
   }
   public A(int x){
      this(); //this will call constructor of same class not of super class
    System.out.println("in A"+ x);
   }

}

class B extends A{//subclass
   public B(){   //default constructor
     
    System.out.println("B");
   }

   public B(int a){ 
    //parameterised constructor
    super(8);  //by this we are calling super class  parameterised constructor passign value 8
    System.out.println("B"+a);
   }
}


public class Mob4 {
   public static void main(String a[]){
    B obj1=new B(6);
   } 
}
