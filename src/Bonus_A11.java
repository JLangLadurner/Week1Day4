public class Bonus_A11 {

    public static void main (String[] args){
        String [] prodName = {"Beer", "Milk", "Organic Milk", "Bread", "Whiskey", "Humous", "Grissini", "Good Stuff"};
        double [] price = {1,0.85,1.20,3.50, 26, 2.49, 1.99, 2.79};
        int [] vat = {10, 20,20,20,10, 20,20,30};
        int [] prodAmount = {2,3,0,2,1,1,1,2};
        double totalTot = 0;
        double totVat = 0;
        System.out.println();
        System.out.println("Invoice");
        System.out.println("----------------------------------");
        for (int i = 0; i<prodName.length; i++){
            if (prodAmount[i] != 0){
                double itemTot = prodAmount[i] * price[i];
                double itemVat = itemTot * vat[i]/100;
                System.out.printf("%-3d"+"%-15s"+"%6.2f"+"%10.2f%n",prodAmount[i],prodName[i], itemTot, itemVat);
                //(format string)formats the layout
                totalTot += itemTot;
                totVat += itemVat;
            }

        }
        System.out.println("----------------------------------");
        System.out.printf("Total Amount "+"%11.2f"+"%10.2f%n",totalTot,totVat);
        System.out.println("----------------------------------");
        //double total = totalTot+totVat; alternative way;
        System.out.printf("Total Amount incl. Vat"+"%12.2f", totalTot+totVat);


    }


}
