
//final -variable,methods,class
//final class we cannot extend it or we stop inheritance using final
//final method :-  no one can override your method syntax public final datatype methodname



final class Calc {  //final class
    public final void show(){  //final method
       System.out.println("in show");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }

}



public class Mob6 {
    public static void main(String a[]){
    //    final int num=8; //using final we make num as const never change its value
      //  System.out.println(num);

      Calc obj=new Calc();
      obj.show();
      obj.add(4,5);
    }
}
