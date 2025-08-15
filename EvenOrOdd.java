import java.io.*;
import java.util.*;

class EvenOrOdd{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Number:");
        int n = scanner.nextInt();
        if(n%2==0){
            System.out.print("\nGiven Number Is A Even NUmber...\n");
        }
        else{
            System.out.print("\nGiven Number Is A Odd NUmber...\n");
        }
    }
}