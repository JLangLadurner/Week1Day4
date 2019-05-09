/*A4: Write a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.
Example:
Until what? 3
Sum is 6*/


import java.util.Scanner;

public class Intermediate_A4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Until what  ");
        int input = sc.nextInt();
        int sum = 0;

        for(int i=0; i <= input; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
