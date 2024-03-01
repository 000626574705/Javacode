public class Charstoring {
    public static void main(String a[]){
        //String name="navin";//string is class  not coorect syntax
        String fame=new String("anvin");//OBJECT of string

        System.out.println(fame);
        System.out.println(fame.charAt(1));
        System.out.println(fame.concat(" Reddy"));
        System.out.println(fame.contains("g"));

         String n1=new String ("navin");
         String  n2=new String ("navin");
         System.out.println(n1==n2);//return false

         String n11="navin";
         String n22="navin";
         System.out.println(n11==n22);//return true

         //Mutable string -> changes
         //Immutable String ->unchange

         StringBuffer sb=new StringBuffer("NAVIN");
         System.out.println(sb.capacity());
         sb.append(" REDDY");
         sb.deleteCharAt(2);
         System.out.println(sb);
         sb.insert(1,"java");
         System.out.println(sb);
         System.out.println(sb.length());


    }
}
