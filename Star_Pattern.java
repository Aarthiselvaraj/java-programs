import java.util.Scanner;
public class Star_Pattern
{
public static void main(String args[]){
 Scanner scan=new Scanner(System.in); 
System.out.print("Enter the number of rows: ");
int rows=scan.nextInt();
System.out.println("entre the symbol:");
char ch=scan.next().charAt(0);
System.out.print("\n");
int i=1;
do{ 
int j=0;
   do{//inner while loop
       System.out.print(" ");
 j++;
}while(j<rows-i);
j=0; 
do{
   System.out.print(ch);
    j++;
}while(j<i);
 System.out.print("\n");
  i++;
}while(i<rows);
}
}