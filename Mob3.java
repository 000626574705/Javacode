
class Human{
   private int age; 
   private String name;
// constructor we created should be of same name as of class
//everytime we create object we call constructor
   public Human(){
        System.out.println("cosntructor");
        age=20;
        name="Harish";
   }

  public void setName(String s){
    name=s;
  }
  public void setAge(int n){
    age=n;
  }


   public int getAge(){
    return age;
   }
   public String getName(){
    return name;
   }
}
public class Mob3 {
   public static void main(String a[]){
     Human obj1=new Human();
    // obj1.age = 11;
     //obj1.name="Navin";
    // obj1.setName("Shreeti");
    // obj1.setAge(8);
     System.out.println(obj1.getName()+" "+obj1.getAge());
   
       }
    
}
