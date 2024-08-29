package Assignment1;

import java.util.*;

public class Cafe {
MenuItem menuItem1;
MenuItem menuItem2;
MenuItem menuItem3;
Order currentOrder;

List<String> menu=new ArrayList<String>();

void addMenuItem1(MenuItem item) {
    menu.add(item.getName());
}

void addMenuItem2(MenuItem item) {
        menu.add(item.getName());
}

void addMenuItem3(MenuItem item) {
        menu.add(item.getName());
}

void placeOrder(Order order) {
    currentOrder = order;
    order.calculateTotal(order);
}

void displayMenu(){
    for (int i = 0; i < menu.size(); i++) {
        System.out.println(menu.get(i));
    }
}

}
