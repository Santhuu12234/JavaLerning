import java.io.*;
import java.util.*;

class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter The Number To Check Prime Or Not:");
        int n = sc.nextInt();
        if(n==1){
            System.out.print("\n1 is not a prime number");
        }
        else if(n==2){
            System.out.print("\n2 is a prime number..");
        }
        else{
            int count = 0;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==0){
                System.out.print("\nIt is a prime number..");
            }
            else{
                System.out.print("\nIt is not a prime number..");
            }
        }
    }
}