import java.util.Scanner;

public class ATM
{
    public static void main(String args[])
    {
       Scanner sa=new Scanner(System.in);
       int A,A1,B,B1,C,C1,D,D1,X;
       System.out.println("Enter the 1st Denomination:");
       A=sa.nextInt();
       System.out.println("Enter the 1st Denomination number of notes");
       A1=sa.nextInt();
       System.out.println("Enter the 2nd Denomination:");
       B=sa.nextInt();
       System.out.println("Enter the 2nd Denomination number of notes");
       B1=sa.nextInt();
       System.out.println("Enter the 3rd Denomination:");
       C=sa.nextInt();
       System.out.println("Enter the 3rd Denomination number of notes");
       C1=sa.nextInt();
       System.out.println("Enter the 4th Denomination:");
       D=sa.nextInt();
       System.out.println("Enter the 4th Denomination number of notes");
       D1=sa.nextInt();
       X=((A*A1)+(B*B1)+(C*C1)+(D*D1));
       System.out.println("Total Available Balance in ATM:"+X);
     }
}