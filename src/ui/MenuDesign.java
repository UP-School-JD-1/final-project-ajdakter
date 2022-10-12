package ui;

import constants.RestaurantColor;
import menu.DrinkEnum;
import menu.FoodEnum;

import java.util.List;
import java.util.Scanner;

public class MenuDesign {
    public void showMenu(List<FoodEnum> foodEnumList,List<DrinkEnum> drinkEnumList){

        System.out.println("                    Foods Menu");
        for(int i=0;i<foodEnumList.size();i++){
            System.out.println(RestaurantColor.RED_UNDERLINED+"************************************************************"+RestaurantColor.RESET);
            System.out.println(RestaurantColor.GREEN_BOLD+ String.valueOf(foodEnumList.get(i).getFoodId())+
                    "    "+foodEnumList.get(i).getFoodName()+
                    "    "+foodEnumList.get(i).getFoodPrice()+
                    "    "+foodEnumList.get(i).getFoodDescription()+RestaurantColor.RESET);
        }
        System.out.println("                    Drinks Menu");
        for(int i=0;i<drinkEnumList.size();i++){
            System.out.println(RestaurantColor.RED_UNDERLINED+"************************************************************"+RestaurantColor.RESET);
            System.out.println(RestaurantColor.GREEN_BOLD+ String.valueOf(drinkEnumList.get(i).getDrinkId())+
                    "    "+drinkEnumList.get(i).getDrinkName()+
                    "    "+drinkEnumList.get(i).getDrinkPrice()+RestaurantColor.RESET);
        }
    }
}
