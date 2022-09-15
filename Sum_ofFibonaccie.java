import java.util.*;
class Sum_ofFibonaccie{
 public static void main(String[] args){
 int a=0;
 int b=1;
 int c=a+b;
 Scanner sa=new Scanner(System.in);
 System.out.print("enter teh number:");
 int n=sa.nextInt();
 List<Integer>li=new ArrayList<>();
 li.add(a);
 li.add(b);
 for(int i=0;i<(n*2)-1;i++){
 c=a+b;
 a=b;
 b=c;
 li.add(c);
 }

 int sum=0;
 for(int i=0;i<li.size();i++){
 if(i%2==0){

 sum=sum+li.get(i);
 }
 }
 System.out.println("sum of even fibonacci is="+sum);
 }
}