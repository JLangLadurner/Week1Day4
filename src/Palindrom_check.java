import java.util.Scanner;

public class Palindrom_check {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to check if it's a palindrom");

        String word = sc.nextLine();

        boolean isPalindrome = false;

        char[] letter = word.toCharArray();

        for(int i=0; i<letter.length; i++){
            for(int j=letter.length-1; j>0; j--){
                if(letter[i] == letter[j]){
                    isPalindrome = true;
                }
            }
        }
        if(isPalindrome){
            System.out.println(word + " is a palindrome");
        }else
            System.out.println(word + " isn't a palindrome");
    }
}
