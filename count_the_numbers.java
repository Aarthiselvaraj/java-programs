import java.util.*;
class count_the_numbers
   {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        try{
            int n=a.nextInt();
            int c=0;
            while(n!=0){
                n=n/10;
                c++;
            }
             System.out.println("enter the number")
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
