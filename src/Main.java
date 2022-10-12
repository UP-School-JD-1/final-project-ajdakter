import service.Order;
import menu.DrinkEnum;
import menu.FoodEnum;
import menu.Menu;
import service.Chef;
import service.Customer;
import service.Waiter;
import ui.MenuDesign;
import constants.RestaurantColor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static constants.AppConstans.*;

public class Main {

    public static void main(String[] args) {

        Menu menu=new Menu(new MenuDesign());


        System.out.println(RestaurantColor.GREEN_UNDERLINED+"************************************************************"+RestaurantColor.RESET);
        System.out.println(RestaurantColor.GREEN_BOLD+"                Welcome to the restaurant."+RestaurantColor.RESET);
        System.out.println(RestaurantColor.GREEN_UNDERLINED+"************************************************************"+RestaurantColor.RESET);

        menu.getMenu();

        ExecutorService exec = Executors.newFixedThreadPool(totalWorker);
        ExecutorService waiterExecutor = Executors.newFixedThreadPool(waiters);
        ExecutorService chefExecutor = Executors.newFixedThreadPool(chefs);

        Random random = new Random();
        int customerNumber = random.nextInt(totalCustomer);

        for(int i=1;i<=customerNumber;i++){
            exec.submit(new Customer(i,new Waiter(i)));

        }
        for(int i=1;i<=3;i++) {
            List<FoodEnum> foods =new ArrayList<FoodEnum>();

            foods.add(menu.getFoodData().get(random.nextInt(totalFood)));
            foods.add(menu.getFoodData().get(random.nextInt(totalFood)));
            DrinkEnum drink =menu.getDrinkData().get(random.nextInt(totalDrink));

            Order order=new Order(foods,drink);
            waiterExecutor.submit(new Waiter(i, new Customer(i,order), new Chef(i)));
        }

        for(int i=1;i<=2;i++) {
            chefExecutor.submit(new Chef(i, new Waiter(i)));
        }

        exec.shutdown();
        waiterExecutor.shutdown();
        chefExecutor.shutdown();

        try{
            exec.awaitTermination(45, TimeUnit.SECONDS);
            waiterExecutor.awaitTermination(45, TimeUnit.SECONDS);
            chefExecutor.awaitTermination(45, TimeUnit.SECONDS);
        }
        catch (InterruptedException ex){

        }
        System.out.println("All customer is leaved in restaurant");

    }

}