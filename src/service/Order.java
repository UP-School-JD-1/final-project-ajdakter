
package service;

import menu.DrinkEnum;
import menu.FoodEnum;

import java.util.List;

public class Order {
   private List<FoodEnum> foods;

    public List<FoodEnum> getFoods() {
        return foods;
    }

    public Order() {
    }

    public DrinkEnum getDrinkEnum() {
        return drinkEnum;
    }

    private DrinkEnum drinkEnum;

    public Order(List<FoodEnum> foods, DrinkEnum drinkEnum) {
        this.foods = foods;
        this.drinkEnum = drinkEnum;
    }

}