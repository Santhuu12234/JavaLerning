import java.io.*;
import java.util.*;

public class PrimeCheckingUsingFor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Number To Check Prime Or Not:");
        int n = scanner.nextInt();
        if(n==1){
            System.out.print("\n1 Is Not A Prime Number Becase Of It Have Only One Divisor...");
        }
        else{
            int count =0;
            for(int i=1;i*i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==1){
                System.out.print("\nIt Is A Prime Number...");
            }
            else{
                System.out.print("\nIt Is Not A Prime Number...");
            }
        }
    }  
}
