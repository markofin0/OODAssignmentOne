package Assignment1;

import java.util.*;

public class Cafe {
    MenuItem menuItem1;
    MenuItem menuItem2; // adds 3 MenuItems to the Cafe object/class as attributes
    MenuItem menuItem3;
    Order currentOrder; // defines a order class owned by the cafe class

    List<String> menu=new ArrayList<String>(); // makes a new ArrayList which acts as a menu

    void addMenuItem1(MenuItem item) { // these three next methods all add MenuItem objects to the classes menu ArrayList
        menu.add(item.getName());
    }

    void addMenuItem2(MenuItem item) {
        menu.add(item.getName());
    }

    void addMenuItem3(MenuItem item) {
        menu.add(item.getName());
    }

    void placeOrder(Order order) { // places an order, which means it takes the given order, and sets it as the value of the current order, then uses the calculateTotal method to calculate the price
        currentOrder = order;
        order.calculateTotal(order);
    }

    void displayMenu(){ // displays the ArrayList menu
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }
    }

}
