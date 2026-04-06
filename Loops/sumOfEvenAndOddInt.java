package Loops;
import java.util.*;

public class sumOfEvenAndOddInt{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num;
        int oddSum= 0;
        int evenSum = 0;
        int choice;
        do{
            System.out.println("Enter a number");
            num = sc.nextInt();
            if(num%2==0){
                evenSum=evenSum+num;

            }else{
                oddSum=oddSum+num;
            }
            System.out.println("if you want to continue press 1 and to stop press 0");
            choice = sc.nextInt();
        } while(choice == 1);

        System.out.println("sum of even number is"+ " " +  evenSum);
        System.out.println("sum of odd number is"+ " "+ oddSum);
    }
}