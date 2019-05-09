import java.util.Scanner;

/**
 * Java loops: nested loops (advanced)
 *
 * Write a program to display the pattern like right angle triangle with a number. Example input/output:
 *
 *
 * Input number of rows : 10
 *
 *
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Challenge_A6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int n=1; n<=i; n++){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
