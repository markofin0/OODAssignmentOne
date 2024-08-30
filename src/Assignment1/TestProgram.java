package Assignment1;

public class TestProgram {
    static MenuItem burger;
    static Order order;
    static void makeBurger(){ // makes a new MenuItem object name burger
        burger = new MenuItem();
        burger.setName("Burger");
        burger.setPrice(10);
        burger.setCategory("Lunch");
    }

    public static void main(String[] args) { // main method to test the different objects and methods of the program
        makeBurger(); // makes the burger object
        burger.displayItemInfo(); // displays the burger objects attributes
        order = new Order(); // initializes a new Order object
        order.addItem1(burger); // adds the burger object to all three item slots of the order Object
        order.addItem2(burger);
        order.addItem3(burger);
        order.totalAmount = 0;
        order.displayOrderDetails(order); // displays the Order objects attributes

        Cafe cafe = new Cafe(); // new Cafe object
        cafe.addMenuItem1(burger);
        cafe.addMenuItem2(burger); // adds three burgers to the menu
        cafe.addMenuItem3(burger);
        System.out.println(cafe.menu); // prints the menu
        cafe.displayMenu(); // calls the displayMenu method
    }
}
