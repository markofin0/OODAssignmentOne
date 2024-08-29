package Assignment1;

public class TestProgram {
    static MenuItem burger;
    static Order order;
    static void makeBurger(){
        burger = new MenuItem();
        burger.setName("Burger");
        burger.setPrice(10);
        burger.setCategory("Lunch");
    }

    public static void main(String[] args) {
        makeBurger();
        burger.displayItemInfo();
        order = new Order();
        order.addItem1(burger);
        order.addItem2(burger);
        order.addItem3(burger);
        order.totalAmount = 0;
        order.displayOrderDetails(order);

        Cafe cafe = new Cafe();
        cafe.addMenuItem1(burger);
        cafe.addMenuItem2(burger);
        cafe.addMenuItem3(burger);
        System.out.println(cafe.menu);
        cafe.displayMenu();
    }
}
