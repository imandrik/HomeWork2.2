public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;
        int totalBalance;
        int bonus = refill / 100;
        if (refill <= 1000) {
            bonus = 0;
        }
        totalBalance = balance + refill + bonus;
        System.out.println("Ваш бонус: " + bonus + " рублей");
        System.out.println("Баланс вашего счета: " + totalBalance + " рублей" );
    }
}
