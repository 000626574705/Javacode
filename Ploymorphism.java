
//Many behaviour 
//two types of it COMPILE TIME(Early binding ) &Run time(Late binding)

//overloading is king of Compile time   polymorphism  overloading means same method name with different parameters
//overriding class B extends class A but both has same method with same no. of parameters than which will execute so its kind of runtime polymorphism

  //Dynamic method Dispatch:-



   class Computer {

   }
   class Laptop extends Computer{

   }
 class A {
     public void show(){
        System.out.println("IN show A");

     }
 }
 class B extends A{
    public void show(){
        System.out.println("IN show B");

     }
 }
public class Ploymorphism {
   public static void main(String a[]){
    A obj =new A();
    obj.show();
    Computer obj1=new Laptop();

   }
    
}
