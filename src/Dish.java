public class Dish {

    private String name;
    private int price;
    private String category;

    public Dish(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void displayInfo(){
        System.out.println("Назва: "+name+" Ціна: "+price+" Категорія: "+category+".");
    }
}
