class Booking {
    private int bookingId;
    private Showtime showtime;
    private Customer customer;
    private int numberOfSeats;

    public Booking(int bookingId, Showtime showtime, Customer customer, int numberOfSeats) {
        this.bookingId = bookingId;
        this.showtime = showtime;
        this.customer = customer;
        this.numberOfSeats = numberOfSeats;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId){
        this.bookingId = bookingId;
    }

    public Showtime getShowTime() {
        return showtime;
    }

    public void setShowTime(Showtime showtime){
        this.showtime = showtime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId + ", Showtime: " + showtime + ", Customer: " + customer + ", Seats: " + numberOfSeats;
    }
}