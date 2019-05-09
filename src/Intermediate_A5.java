import java.util.Scanner;

/**
 * find all occurrences of X in a number array
 *
 * Write a program that does following:
 *
 * 1. Creates an array of 10 items and fills it with various numbers, for example: 3, 10, 42, 12, ....
 *
 * 2. User can enter a number and ask to find it in the array
 *
 * 3. The program loops through the array and counts the number of found item(s)
 *
 * 4. If nothing is found - do not display 0, instead display "Nothing found"
 *
 * 5. If at least one item is found - display the number of found items
 */
public class Intermediate_A5 {

    public static void main(String[] args){
        int[] items = {3,45,45,23,75,3,76,43,90,44};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean isFound = false;

        for(int i=0; i<items.length; i++){
            if(num == items[i]){
                isFound = true;
            }
        }
        if(isFound) {
            System.out.println("Number found " + num);
        }

        int counter = 0;
        for(int i=0; i<items.length; i++){
            if(num == items[i]){
                counter++;
            }
        }
        if(counter != 0) {
            System.out.println("Number " + num + " is found " + counter + " times");
        }else
            System.out.println("Nothing found");

    }
}
