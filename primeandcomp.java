import java.util.Scanner;
public class primeandcomp {

public static void main(String[] args) {
int number ;
Scanner input = new Scanner(System.in);
System.out.print("Enter a number:");
number = input.nextInt();
boolean isPrime = true;
for(int i = 2; i <= number/2; i++)
{
// condition for nonprime number
if(number % i == 0)
{
isPrime = false;
break;
}
}
if (isPrime==true)
System.out.println(number + " is a Prime number.");
else
System.out.println(number + " is not a Prime number\n(it is a Composite number.)");
}
} 
     