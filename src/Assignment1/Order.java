package Assignment1;

import java.awt.*;

public class Order {
    MenuItem item1; // three menu item objects initialized
    MenuItem item2;
    MenuItem item3;
    double totalAmount = 0; // total amount attribute of order

    public void addItem1(MenuItem item) { // sets item1 to the item object given to this method, then adds its price to the total amount
        item1 = item;
        totalAmount += item1.getPrice();

    }
    public void addItem2(MenuItem item) { // does the same as addItem1
        item2 = item;
        totalAmount += item2.getPrice();

    }
    public void addItem3(MenuItem item){ // does the same as addItem1
        item3 = item;
        totalAmount += item3.getPrice();

    }

    public double calculateTotal(Order order){ // caulculates order's totalAmount attribute
        addItem1(order.item1);
        addItem2(order.item2);
        addItem3(order.item3);
        return totalAmount;
    }

    public void displayOrderDetails(Order order){ // prints out all item objects that the order "owns"
        System.out.println(item1.getName() + ": " + order.item1.getPrice());
        System.out.println(item2.getName() + ": " + order.item2.getPrice());
        System.out.println(item3.getName() + ": " + order.item3.getPrice());
        calculateTotal(order);
        System.out.println("Your total is: " + totalAmount);
    }
}
