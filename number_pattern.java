import java.util.*;
    class number_pattern{
        public static void main(String[] args){
         int rows,i,j,k,s,mid;
            Scanner a=new Scanner(System.in);
            System.out.println("Enter the number of rows");
            rows=a.nextInt();
            mid=(rows/2)+1;
            s=mid;
            k=1;
            for(i=1;i<=rows;i++){
                if(i<=mid){
                    for(j=1;j<=i;j++){
                        System.out.print(i+" ");
                    }
                }
                else{
                    s--;
                    for(j=1;j<=mid-k;j++){
                        System.out.print(s+" ");
                       
                    }
                    k++;
                }
                System.out.println();
            }
            if(rows%2==0){
                System.out.println(1);
            }

        }
    }
