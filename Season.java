public class Season {
    public static String method(int number) {
        if (number == 12 || number <= 2) {
            return "Winter";
        } else if (number >= 3 && number <= 5) {
            return "Spring";
        } else if (number >= 6 && number <= 8) {
            return "Summer";
        } else if (number >= 9 && number <= 11) {
            return "Autumn";
        } else {
            return "Нет такого месяца";
        }
    }
}
