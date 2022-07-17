public class Main {
    public static void main(String[] args) {
        int cost = 500;

        int bonusValue = 20; // стоимость 1-ой мили в рублях.
        int miles = (cost / bonusValue);

        System.out.println(miles);
    }
}
