/*A10.  Java array: calculate kcal of a meal
Calorie calculator: you have:
an array with foodPortion[] (“1dl  milk”, “1 slice of bread”, “100 gr chicken breast”, “200gr salad”)
2nd array with kcalPerPortion[] {62, 74, 165, 33}
Create 3 arrays: breakfast, lunch, dinner  that contain the number of portions taken from every
foodPortion (for instance, 2x1dl milk, 3 slices of breath, 0 portions  chicken, 0 portions salad for breakfast)
and display on the screen ONLY the food that has been eaten:
EXAMPLE:

BREAKFAST
===========
2 x 1 dl milk
3 x slice of bread
LUNCH
===========
1 x slice of bread
2 x 100gr chicken breast
1 x 200gr green salad
DINNER
===========
2 x 1 dl milk
3 x slice of bread

2) Calculate total calorie consumption per meal (breakfast, lunch, dinner) and day and print it
ADVANCED: Try to imagine a way how you could use this scheme to do calculations for a whole week.
Discuss with the group
 */
public class advancedArray_A10 {

    public static void main (String[] args){
        String[] foodPortion = {"1dl  milk", "1 slice of bread", "100 gr chicken breast", "200gr salad"};
        int [] kcalPerPortion= {62, 74, 165, 33};
        int[] breakfast = {2,3,0,0};
        int[] lunch = {0,0,2,1};
        int[] dinner = {0,1,1,0};

        System.out.println("Breakfast");
        System.out.println("=========");

        for (int i = 0; i < foodPortion.length; i++){
            if (breakfast[i]!= 0){
                System.out.println(breakfast[i] +" x "+ foodPortion[i]);
            }
        }

        //lunch
        System.out.println();
        System.out.println("lunch");
        System.out.println("=========");
        for (int i = 0; i < foodPortion.length; i++){
            if (lunch[i]!= 0){
                System.out.println(lunch[i] +" x "+ foodPortion[i]);
            }
        }
        //dinner
        System.out.println();
        System.out.println("dinner");
        System.out.println("=========");
        for (int i = 0; i < foodPortion.length; i++){
            if (dinner[i]!= 0){
                System.out.println(dinner[i]+ " x " + foodPortion[i]);
            }
        }
        System.out.println();
        int calBr =0;
        for (int i = 0; i < foodPortion.length; i++){
            if (breakfast[i]!= 0){
               calBr = calBr + (kcalPerPortion[i]*breakfast[i]);
            }
        }
        System.out.println("Breakfast calories are " + calBr);
        //lunch cal
        System.out.println();
        int calLu =0;
        for (int i = 0; i < foodPortion.length; i++){
            if (lunch[i]!= 0){
                calLu = calLu + (kcalPerPortion[i]*lunch[i]);
            }
        }
        System.out.println("Lunch calories are " + calLu);

        //dinner cal
        System.out.println();
        int calDi =0;
        for (int i = 0; i < foodPortion.length; i++){
            if (dinner[i]!= 0){
                calDi = calDi + (kcalPerPortion[i]*dinner[i]);
            }
        }
        System.out.println("Dinner calories are " + calDi);
    }
}
