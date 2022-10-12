package menu;

import ui.MenuDesign;

import java.util.Arrays;
import java.util.List;

public class Menu {
    public Menu(MenuDesign menuDesign) {
        this.menuDesign = menuDesign;
    }

    MenuDesign menuDesign;

    public Menu() {
    }

    public void getMenu(){
     menuDesign.showMenu(getFoodData(),  getDrinkData());

    }
    public List<FoodEnum> getFoodData(){
        List<FoodEnum> foods;
        foods=Arrays.asList(FoodEnum.values());
       return foods;
    }

    public List<DrinkEnum> getDrinkData(){
        List<DrinkEnum> drinks;
        drinks=Arrays.asList(DrinkEnum.values());
        return drinks;
    }
}
