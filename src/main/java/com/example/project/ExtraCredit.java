package com.example.project;
import java.util.Scanner;

public class ExtraCredit {
    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        //COPY AND PASTE YOUR CODE HERE 
        double tip;
        double totalBill;
        double personCostWithoutTip;
        double tipPerPerson;
        double totalCostPerPerson;
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        tip = Math.round(((percent / 100.0) * cost) * 100.0) / 100.0; // I learned how to round here https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        result.append("Total tip: $" + tip + "\n");
        totalBill = Math.round((tip + cost) * 100.0) / 100.0;
        result.append("Total Bill with tip: $" + totalBill + "\n");
        personCostWithoutTip = Math.round((cost / people) * 100.0) / 100.0;
        result.append("Per person cost before tip: $" + personCostWithoutTip + "\n");
        tipPerPerson = Math.round((tip / people) * 100.0) / 100.0;
        result.append("Tip per person: $" + tipPerPerson + "\n");
        totalCostPerPerson = Math.round(((cost * ((percent / 100.0) + 1)) / people) * 100.0) / 100.0;
        result.append("Total cost per person: $" + totalCostPerPerson + "\n");
        result.append("-------------------------------\n");

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);

        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 12;
        int percent = 15;
        double cost = 566.97;
        String item;
        String items = ""; 
        //Your scanner object and while loop should go here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an item name or type '-1' to finish: ");
        item = scan.next();
        
        // I figured out how to compare Strings with https://www.quora.com/How-do-you-check-if-a-string-is-not-equal-to-another-string-in-Java
        while (! item.equals("-1")) {
            items += (item + "\n");
            System.out.println("Enter an item name or type '-1' to finish: ");
            item = scan.next();
        }

        scan.close();
                             
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
