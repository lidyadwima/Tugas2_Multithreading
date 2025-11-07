public class Waiter extends Thread {
    private String name;
    private OrderTable table;
    private Chef chef;
    private Cashier cashier;

    public Waiter(String name, OrderTable table, Chef chef, Cashier cashier) {
        this.name = name;
        this.table = table;
        this.chef = chef;
        this.cashier = cashier;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (table) {
                int orderNumber = table.takeOrder(name);

                // Proses berurutan: koki -> pelayan -> kasir
                chef.cookOrder(orderNumber);
                System.out.println(name + ": Mengantarkan pesanan " + orderNumber + " ke pelanggan.");
                cashier.processPayment(orderNumber, table);
                System.out.println();
            }
        }
    }
}
