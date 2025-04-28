import java.util.*;

public class ProfitAndLoss {
    public static void main(String[] args) {

        float costPrice, sellingPrice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price of the Product :- ");
        costPrice = sc.nextFloat();
        System.out.println("Enter the Selling Price of the Product :- ");
        sellingPrice = sc.nextFloat();

        if (sellingPrice > costPrice) {
            System.out.println("The seller has made the profit");
            float profit = sellingPrice - costPrice;
            System.out.println("The Total Profit made is :- " + profit);
        } else if (sellingPrice < costPrice) {
            System.out.println("The seller has made the loss");
            float loss = costPrice - sellingPrice;
            System.out.println("The Total Profit made is :- " + loss);
        } else {
            System.out.println("NO PROFIT and NO LOSS");
        }
    }
}
