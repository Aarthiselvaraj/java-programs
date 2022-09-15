import java.util.Scanner;
class Read_the_numbers{
public static void main(String[]args)
{
  Scanner input= new Scanner(System.in);
    int count = 0;
    double negative=0;
    double positive =0;
    
    System.out.print("Enter an integer : ");
    int data = input.nextInt();
    while (data !=-1) {
    
    System.out.print("Enter an integer: ");
    data=input.nextInt();
    if (data < 0){
    negative++;
    }else if (data > 0){
    positive++;
    }
    count++;
  }
    System.out.println("the avg of positive numbers:"positive-count/data);
    System.out.println("the avg of negative  numbers:"+);
  }   
}