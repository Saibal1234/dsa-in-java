package Loops;
import java.util.*;

public class continueKeyword {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        
        do{
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            if(num%10==0){
                //System.out.println("No is multiple of 10");
                continue;
            }
            System.out.println(num);
        } while(true);
    }
}
