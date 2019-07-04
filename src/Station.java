public class Station {
    private static int tickets = 20;
    public synchronized  void getTickets() {
        if (tickets>0)
            System.out.println("还剩"+(--tickets));
    }
}
