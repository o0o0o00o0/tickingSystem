public class TicketThread extends Thread{
    private Station station;
    public  TicketThread(Station station) {
        this.station = station;
    }
    @Override
    public void run() {
        while (true) {
            System.out.print(currentThread().getName());
            station.getTickets();
        }
    }
}
