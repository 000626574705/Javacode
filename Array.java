
class Student {
    int rollno;
    String name;
    int marks;
}
public class Array
{
    public static void main(String a[]){
        {
           Student s1=new Student();
           s1.rollno=1;
           s1.name="Navin";
           s1.marks=88;

           Student s2=new Student();
           s2.rollno=2;
           s2.name="Harsh";
           s2.marks=67;

           Student s3=new Student();
           s3.rollno=3;
           s3.name="Nav";
           s3.marks=89;

          // System.out.println();

           Student students[] = new Student[3];
           students[0]=s1;
           students[1]=s2;
           students[2]=s3;

         //  for(int i=0;i<students.length;i++){
          //  System.out.println(students[i].name +" "+students[i].rollno +" "+students[i].marks);
         //  }

         //or we can use 
           for(Student stud:students){
            System.out.println(stud.name+" "+stud.marks);
           }
        }
    }
}
