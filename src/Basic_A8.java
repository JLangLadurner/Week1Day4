import java.util.Scanner;

/**
 *Read in 10 integers from the keyboard storing them in an array. Then print out the same
 * integers in reverse order of input
 */

public class Basic_A8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for(int i=0; i<10; i++){
        System.out.println("Enter number");
        num[i] = sc.nextInt();
        }

        for(int i=9; i>=0; i--){
            System.out.println(num[i]);
        }
    }
}
