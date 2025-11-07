public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI RESTORAN ===\n");

        OrderTable table = new OrderTable();
        Chef chef = new Chef();
        Cashier cashier = new Cashier();

        Waiter waiterA = new Waiter("Pelayan A", table, chef, cashier);
        Waiter waiterB = new Waiter("Pelayan B", table, chef, cashier);

        waiterA.start();
        waiterB.start();

        try {
            waiterA.join();
            waiterB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total pendapatan hari ini: Rp " + table.getTotalIncome());
        System.out.println("\nRestoran tutup untuk hari ini.");
    }
}
