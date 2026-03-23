package Loops;
import java.util.*;

public class breakKeyword {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        
        do{
            System.out.println("Enter your number");
            int num = sc.nextInt();
            if(num%10==0){
                System.out.println("No is multiple of 10");
                break;
            }
            System.out.println(num);
        } while(true);
    }
}
