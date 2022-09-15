import java.util.Scanner;  
public class Sum_of_digits  
{  
public static void main(String arg[])  
{  
int number, sum;  
Scanner as=new Scanner(System.in);  
System.out.print("Enter a number: ");  
number=as.nextLong();  

for(sum=0; number!=0; number=number/10)  
{  

sum = sum + number % 10;  
}  

System.out.println("Sum of digits: "+sum);  
}  
}  