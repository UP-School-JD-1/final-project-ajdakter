package menu;

public enum FoodEnum {
    KABURGADOLMASI(1,"Kalamar Dolması  ",1000,50," xxx"),
    ISKENE(2,"Taze Fasulye      ",500,45,"xxx"),
    TATARBOREGI(3,"Tatar Böreği      ",1000,35,"xxx"),
    CIBOREK(4,"Çibörek           ",500,25,"xxx"),
    KUSKONMAZCORBASI(5,"Kuşkonmaz Çorbası ",425,24,"xxx"),
    RADIKASALATASI(6,"Radika Salatası   ",250,15,"xxx");
    FoodEnum(long foodId, String foodName, long preparationTime, float foodPrice, String foodDescription) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.preparationTime = preparationTime;
        this.foodPrice = foodPrice;
        this.foodDescription=foodDescription;
    }
    long foodId;
    String foodName;
    long preparationTime;
    float foodPrice;
    String foodDescription;

    public long getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public long getPreparationTime() {
        return preparationTime;
    }

    public float getFoodPrice() {
        return foodPrice;
    }

    public String getFoodDescription() {
        return foodDescription;
    }
}
