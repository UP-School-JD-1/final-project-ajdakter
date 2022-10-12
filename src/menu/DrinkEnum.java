package menu;

public enum DrinkEnum {
    AYRAN(1,"Ayran",150,15),
    SU(2,"Su   ",100,5),
    KIMIZ(3,"Kımız",150,25);


    DrinkEnum(long drinkId, String drinkName, long preparationTime, float drinkPrice) {
        this.drinkId = drinkId;
        this.drinkName = drinkName;
        this.preparationTime = preparationTime;
        this.drinkPrice = drinkPrice;
    }

    public long getDrinkId() {
        return drinkId;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public long getPreparationTime() {
        return preparationTime;
    }

    public float getDrinkPrice() {
        return drinkPrice;
    }
    long drinkId;
    String drinkName;
    long preparationTime;
    float drinkPrice;
}
