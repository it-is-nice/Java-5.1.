public class Main<bonus> {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount =1000_60;
        boolean registered = true;
        long expected =30;

        long actual = service.calculate(registered, amount);

        boolean passed = expected == actual;
        System.out.println(passed);
    }
}
