package Assignment1;

public class MenuItem { // a MenuItem class that is a blueprint for a menu item object, has attributes name, price, and category with getters and setters
    private String name;
    private double price;
    private String category;

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getCategory(){
        return category;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public void displayItemInfo(){ // displays the menu items attributes
        System.out.println("Item: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }
}
