import java.io.*;
import java.util.Scanner;

class Tables{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Table:");
        int n = scanner.nextInt();
        System.out.print("Enter Up To:");
        int m = scanner.nextInt();
        System.out.print("\nThe "+n+" Table Are:\n");
        for(int i=1;i<=m;i++){
            System.out.print(n+"x"+i+"="+(n*i)+"\n");
        }
    }
}