
abstract class Car{  //you only have abstract method in abstract class
    public abstract void drive(); //abstract method
        
    
    public void play(){
        System.out.println("Play Music");
    }
}

class WagonR extends Car{  //whichever class extending abstract class must have abtract methood if not it will give error

    public void drive(){
        System.out.println("Driving");
    }
}




public class Abstract {
      public static void main (String a[]) {
         Car obj=new WagonR();  // we cannot create object of abstract class we can create object of entend class which extend that class
         obj.drive();
         obj.play();
      }  
    
}
