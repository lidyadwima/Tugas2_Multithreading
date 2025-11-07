public class OrderTable {
    private int orderNumber = 1;
    private int totalIncome = 0;

    public synchronized int takeOrder(String waiterName) {
        int number = orderNumber;
        System.out.println(waiterName + " mengambil pesanan #" + number);
        orderNumber++;
        return number;
    }

    public synchronized void addIncome(int amount) {
        totalIncome += amount;
    }

    public int getTotalIncome() {
        return totalIncome;
    }
}
