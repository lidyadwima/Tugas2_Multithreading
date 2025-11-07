public class Chef {
    public void cookOrder(int orderNumber) {
        System.out.println("Koki: Memasak pesanan " + orderNumber);
        try { Thread.sleep(800); } catch (InterruptedException e) {}
        System.out.println("Koki: Pesanan " + orderNumber + " selesai dimasak.");
    }
}
