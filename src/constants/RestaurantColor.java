package constants;

public enum RestaurantColor {

    RESET("\033[0m"),
    GREEN_BOLD("\033[1;32m"),   // GREEN
    RED_UNDERLINED("\033[4;31m"),       // RED
    GREEN_UNDERLINED("\033[4;32m");    // GREEN
    private final String code;

    RestaurantColor(String s) {
        this.code = s;
    }

    @Override
    public String toString() {
        return code;
    }

}
