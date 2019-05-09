/*A9.  You are writing an application for weather forecast. You have got (from a temperature  sensor)
an array with 24
values representing daily temperatures for every hour (doubles).
Write a Java program to calculate the average daily temperature.
Write a Java program that finds the minimal daily temperature.
Write a Java program that finds the maximal daily temperature.
Write a Java program to get the difference between the largest and smallest temperature of the day.
You are working now with two temperature arrays, one of the currentDay[],
and one of the previousDay[]. Print the changes in temperature by hour between those two days. Then, find out the
temperature difference between average temperatures.
 */

public class Basic_Arr_A9 {

    public static void main(String[] args) {

        double[] temp = {19, 21, 30, 40, 22, 18, -5, -2, 0, 10, 9, 15, 2, 34, 31, 28, 29, 30.2, 11, 12, 41, 22, 23, 24};
        double[] tempPrev = {18, 20, 30, 40, 21, 18, -5, -3, 0, 10, 10, 17, 2, 34, 31, 28, 20, 31, 12, 12, 41, 23, 23, 24};
        double sum = 0;
        double sum2 = 0;

        for (int i = 0; i < temp.length; i++) {
            sum = sum + temp[i];
        }
        double avg1 = sum / temp.length;
        System.out.println(avg1);

        double minVal = Integer.MAX_VALUE;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < minVal) {
                minVal = temp[i];
            }
        }
        System.out.println(minVal);

        double maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > maxVal) {
                maxVal = temp[i];
            }
        }
        System.out.println(maxVal);
        System.out.println(maxVal-minVal);

        for (int i = 0; i < temp.length; i++){
            double diff = temp[i]-tempPrev[i];
            System.out.println(Math.abs(diff));
        }
        for (int i = 0; i < tempPrev.length; i++) {
            sum2 = sum2 + tempPrev[i];
        }
        double avg = sum2/tempPrev.length;
        System.out.println(avg1-avg);
    }

}
