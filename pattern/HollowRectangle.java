import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i = 1; i <= row; i++) {

            for(int j = 1; j <= col; j++) {

                if( (i == 1 && j >= 2 && j <= col-1) ||     // top row
                    (i == 2 && (j == 1 || j == col)) ||     // second row
                    (i == row-1 && j == col) ||             // right middle
                    (i == row && j >= 1 && j <= col-1) )    // bottom row
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}