package weektwo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What do you want to buy?");
        String product = userInput.nextLine();
        System.out.println("How many are you purchasing?");
        int quantity = userInput.nextInt();
        System.out.println("What is the price for the product?");
        double price = userInput.nextDouble();
        double total = price * quantity;
        System.out.println("How many miles did you travel?");
        double miles = userInput.nextInt();
        int travelPrice = 0;
        if (miles == 0 && miles <= 5){
            travelPrice = 2;
        }
        else if (miles >5 && miles <= 15){
            travelPrice = 5;
        }
        else if (miles >15 && miles <=25){
            travelPrice = 10;
        }
        else if (miles >25 && miles <=50){
            travelPrice = 15;
        }
        else if (miles > 50){
            travelPrice = 20;
        }
        else {}
        double finalprice = ((quantity * total) + travelPrice);
        System.out.printf("%-10s%-12s%-10s%-10s%-10s\n", "Product","Quantity", "Price", "Miles", "Total");
        System.out.printf("%-10s%-12s%-10s%-10s%-10s\n", "-------", "--------", "-----", "-----", "-----");
        System.out.printf("%-10s%-12s%-10s%-10s%-10s\n", product, quantity, price, miles, finalprice);
        System.out.println("            Thank you. Come again!");
    }
}
