import java.util.ArrayList;

public class Restaurant {
    private static ArrayList<Dish> dishes = new ArrayList<>();

    public Restaurant() {
    }


    public static ArrayList<Dish> getDishes() {
        return dishes;
    }

    public static void setDishes(ArrayList<Dish> dishes) {
        Restaurant.dishes = dishes;
    }


    public void addDish(Dish dish){
        dishes.add(dish);
    }

    public static int getTotalDishes(){
        int total = 0;
        for (Dish dish : dishes){
            total++;
        }
        System.out.println("Загальна кількість доступних страв: "+total);
        return total;
    }
}
