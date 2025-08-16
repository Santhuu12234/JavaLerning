import java.util.*;
import java.io.*;


public class PrimeCheckingUsingWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Number To Check Prime Or Not:");
        int n = scanner.nextInt();
        if(n==1){
            System.out.print("\n1 Is Not A Prime Number... It Has Only One Divisor..");
        }
        else{
            int count=0;
            int d = 1;
            while(d*d<=n){
                if(n%d==0){
                    count++;
                }
                d++;
            }
            if(count==1){
                System.out.print("\nGiven Number Is A Prime Number...\n");
            }
            else{
                System.out.print("\nGiven Number Is Not A Prime Number...\n");
            }
        }
    }
}
