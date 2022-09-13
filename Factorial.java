import java.util.Scanner;
class Factorial
{
 public static void main(String[]args)
 {
  int i,factorial=1,num;
  System.out.print("enter the number:");
  Scanner as=new Scanner(System.in);
  num=as.nextInt();
  for(i=1;i<=num;i++)
  {
   factorial=factorial*i;
 }
  System.out.println("The factorial of the entered number is:"+factorial);
 }

}