import java.util.Scanner;

/**
 * Programm zum Testen ob ein Wort ein Palindrom ist
 */

public class Palindrom_check {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to check if it's a palindrom");   //Draculasalucard, Retsinakanister, Kajak, Reittier,
                                                                    //Rentner,
        String word = sc.nextLine();
        boolean isPalindrome = false;

        char[] letter = word.toCharArray();

        int max = letter.length-1;
        for(int i=0; i<=max; i++){
           if(letter[i] == letter[max-i]){              //compares letters upwards and from the other side downwards
                isPalindrome = true;
            }
        }
        if(isPalindrome){
            System.out.println(word + " is a palindrome");
        }else
            System.out.println(word + " isn't a palindrome");
    }
}
