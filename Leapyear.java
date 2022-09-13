import java.util.Scanner;
class Leapyear
{
  
  public static void main(String[]args)
  {
   int year; 
   Scanner as=new Scanner(System.in);
   System.out.print("Enter the year:");
   year=as.nextInt();
   
   if (year%400==0){
   
     System.out.print("the entered year is leap year");
   }
   else if ((year % 4 == 0) && (year % 100 != 0)){
     System.out.print("the entered year is leap year");
   }
   else
   {
     System.out.print("the entered yera is not a leap year");
   }
  }
}