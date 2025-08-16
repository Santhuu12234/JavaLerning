import java.io.*;
import java.util.*;

public class PrimeUsingWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Up-To To Print Prime Numbers:");
        int n = scanner.nextInt();
        if(n==1){
            System.out.print("\nIt Is Not A Prime Number Because Of It Has Only One Divisor");
        }
        else{
            int m = 2;
            while(m<=n){
                int c=1;
                int count =0;
                while(c<m){
                    if(m%c==0){
                        count++;
                    }
                    c++;
                }
                if(count==1){
                    System.out.print("\n"+m);
                }
                m++;
            }
        }
    }
}
