/*A7 - Fill and Print an array
Write a program that stores 10 integers in an array.
Once they are all read in, print them to the screen with a loop.*/

public class Basic_Arr_A7 {

    public static void main(String[] args) {

        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;

            System.out.println(myArray[i]);
        }


    }
}

