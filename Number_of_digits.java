import java.util.Scanner;
public class Number_of_digits {
   public static void main(String args[]){
    try
     {
      int num,count = 0;
      Scanner as = new Scanner(System.in);
      System.out.println("Enter a number:");
      num = as.nextInt();
      while(num!=0){
         num = num/10;
         count++;
      }
      System.out.println("Number of digits in the entered integer are : "+count);
   }catch(Exception e){
   System.out.println("error");
}
}
}