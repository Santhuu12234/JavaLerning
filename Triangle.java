/*write a program to print Triangle*/

import java.io.*;
import java.util.*;

class Triangle{
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Size Of Triangle:");
        n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=10-i+1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}