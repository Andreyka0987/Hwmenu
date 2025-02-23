public class Main {
    public static void main(String[] args) {
            Restaurant list = new Restaurant();
            Dish dish1 = new Dish("a","aa",1);
            Dish dish2 = new Dish("b","bb",2);
            Dish dish3 = new Dish("c","cc",3);

            list.addDish(dish1);
            list.addDish(dish2);
            list.addDish(dish3);



            list.displayAll();

            Restaurant.getTotalDishes();

    }
}