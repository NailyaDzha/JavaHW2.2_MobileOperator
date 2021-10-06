public class Main {
    public static void main(String[] args) {
        int clientbalance = 200;
        int newsum = 1101;

        int bonus;
        if (newsum >= 1000 + 100) {
            bonus = newsum / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Ваш бонус: " + bonus);

        int totalclientbalance = clientbalance + newsum + bonus;
        System.out.println("Ваш баланс: " + totalclientbalance);
    }
}
