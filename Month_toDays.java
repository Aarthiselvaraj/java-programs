import java.util.Scanner;
class Month_toDays
{
  public static void main(String[]args)
 {
   int month,year;
   System.out.print("enter the month:");
   Scanner as=new Scanner(System.in);
   month=as.nextInt();
   System.out.print("enter the year:");
   year=as.nextInt();
   
   if(((month==2)&&(year%4==0))||((year%100==0)&&(year%400==0)))
   {
    System.out.print("Number of days is 29");
   }
   else if(month==2)
   {
    System.out.print("Number of days is 28"); 
   }
    else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)

    {
      System.out.print("Number of days is 31");  
   }
	else
   {
      System.out.print("Number of days is 30");

    }
  }
}