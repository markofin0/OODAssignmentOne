package Assignment1;

import java.awt.*;

public class Order {
MenuItem item1;
MenuItem item2;
MenuItem item3;
double totalAmount = 0;

public void addItem1(MenuItem item) {
    item1 = item;
    totalAmount += item1.getPrice();

}
public void addItem2(MenuItem item) {
    item2 = item;
    totalAmount += item2.getPrice();

}
public void addItem3(MenuItem item){
    item3 = item;
    totalAmount += item3.getPrice();

}

public double calculateTotal(Order order){
    addItem1(order.item1);
    addItem2(order.item2);
    addItem3(order.item3);
    return totalAmount;
}

public void displayOrderDetails(Order order){
    System.out.println(item1.getName() + ": " + order.item1.getPrice());
    System.out.println(item2.getName() + ": " + order.item2.getPrice());
    System.out.println(item3.getName() + ": " + order.item3.getPrice());
    calculateTotal(order);
    System.out.println("Your total is: " + totalAmount);
}
}
