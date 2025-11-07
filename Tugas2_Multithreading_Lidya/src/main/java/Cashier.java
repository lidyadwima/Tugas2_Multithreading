public class Cashier {
    public void processPayment(int orderNumber, OrderTable table) {
        System.out.println("Kasir: Memproses pembayaran untuk pesanan " + orderNumber);
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        System.out.println("Kasir: Pembayaran pesanan " + orderNumber + " selesai.");
        table.addIncome(45000); // misal harga tetap per pesanan
    }
}
