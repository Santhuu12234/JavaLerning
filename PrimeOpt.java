import java.io.*;
import java.util.*;

public class PrimeOpt {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter Number To Print Prime Numbers Up To n:");
            int n = sc.nextInt();
            if(n==1){
                System.out.print("\n1 is not a prime number");
            }
            else{
                for(int i=1;i<=n;i++){
                    int count =0;
                    for(int j=1;j<i;j++){
                        if(i%j==0){
                            count++;
                        }
                    }
                    if(count==1){
                        System.out.print("\n"+i);
                    }
                }
            }
        }
}
