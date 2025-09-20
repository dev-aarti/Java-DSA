package Conditionals;
//If cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss or profit no loss. Also determine how mich profit he made or loss he incurred.
import java.util.*;
public class ProfitAndLoss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price of an Item: ");
        float costPrice = sc.nextFloat();
        System.out.println("Enter the Selling Price of an Item: ");
        float sellingPrice = sc.nextFloat();

        if(sellingPrice>costPrice){
            System.out.println("The Profit has been incurred by the seller");
            float profit = sellingPrice- costPrice;
            System.out.println("Total Profit is: " + profit);
        }
        else{
            System.out.println("The Loss has been incurred by the seller");
            float Loss = costPrice-sellingPrice;
        }
    }
}
