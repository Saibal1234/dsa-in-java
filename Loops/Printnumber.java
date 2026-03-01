package Loops;
import java.util.*;

public class Printnumber {

    public static void printNumber(){
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
    }

    public static void printNumberTillN (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int i = 1;
        while(i <= num){
            System.out.println(i);
            i++;
        }
        sc.close();
    }

    public static void main (String [] args){
        //printNumber();
        printNumberTillN();
    }
}