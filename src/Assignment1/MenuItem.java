package Assignment1;

public class MenuItem {
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

    public void displayItemInfo(){
        System.out.println("Item: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }
}
