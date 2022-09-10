import java.util.Scanner;
class voting {

    public static void main(String[] args){
      int age,s;
    Scanner a=new Scanner(System.in);
    System.out.print("enter your age:");
    age=a.nextInt();
    if(age>=18)
   {
     System.out.print("The person is elligible to vote");
   }
    else
     {
       s=18-age;
       System.out.print("sorry"+s+"years for elligible to vote");
    }
  }
}