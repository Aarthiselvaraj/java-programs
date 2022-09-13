import java.util.Scanner;
public class Composite{
  public static void main(String[]args){
    int start,end;
    System.out.print("A=");
    Scanner sa = new Scanner(System.in);
    start = sa.nextInt();
    System.out.print("B = ");
    Scanner as = new Scanner(System.in);
    end = as.nextInt();
    int count = 0;
    int i = 1;

    System.out.format("Composite Numbers between %d and %d:\n", start, end);
    for(start=start; start<=end; start++)
    {
    for(i=1; i<=start; i++)
    {
      if(start % i == 0)
     count++;
    }
    if(count > 2)
      System.out.format("%d ", start);
     count = 0;
   }
 }
}