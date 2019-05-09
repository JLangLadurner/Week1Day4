import java.util.Scanner;

/**
 * Write a program that asks the user for the first number and the last number and
 * then prints odd numbers between those two.
 *
 * Example:
 *
 * 1, 3, 5, 7, 9, 11, 13, 15, 17
 */
public class Intermediate_A3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = sc.nextInt();
        System.out.println("Enter second number");
        int second = sc.nextInt();

        for(int i=first; i <=second; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
