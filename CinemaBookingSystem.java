import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CinemaBookingSystem {
    private List<Movie> movies;
    private List<Showtime> showtimes;
    private List<Customer> customers;
    private List<Booking> bookings;
    private Scanner scanner;

    public CinemaBookingSystem() {
        movies = new ArrayList<>();
        showtimes = new ArrayList<>();
        customers = new ArrayList<>();
        bookings = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void menu() {
        while (true) {
            System.out.println("1. Add Movie");
            System.out.println("2. View All Movies");
            System.out.println("3. Add Showtime");
            System.out.println("4. View All Showtimes");
            System.out.println("5. Add Customer");
            System.out.println("6. View All Customers");
            System.out.println("7. Create Booking");
            System.out.println("8. View All Bookings");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    viewAllMovies();
                    break;
                case 3:
                    addShowtime();
                    break;
                case 4:
                    viewAllShowtimes();
                    break;
                case 5:
                    addCustomer();
                    break;
                case 6:
                    viewAllCustomers();
                    break;
                case 7:
                    createBooking();
                    break;
                case 8:
                    viewAllBookings();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void addMovie() {
        System.out.print("Enter movie ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter movie duration (in minutes): ");
        String duration = scanner.nextLine();
        scanner.nextLine(); 

        movies.add(new Movie(id, title, duration));
        System.out.println("Movie added successfully!");
    }

    private void viewAllMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies found!");
        } else {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }

    private void addShowtime() {
        System.out.print("Enter showtime ID: ");
        int showtimeId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter movie ID for the showtime: ");
        int movieId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter showtime (e.g., 2024-07-04 14:30): ");
        String time = scanner.nextLine();

        Movie movie = findMovieById(movieId);
        if (movie != null) {
            showtimes.add(new Showtime(showtimeId, movie, time));
            System.out.println("Showtime added successfully!");
        } else {
            System.out.println("Movie not found!");
        }
    }

    private void viewAllShowtimes() {
        if (showtimes.isEmpty()) {
            System.out.println("No showtimes found!");
        } else {
            for (Showtime showtime : showtimes) {
                System.out.println(showtime);
            }
        }
    }

    private void addCustomer() {
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer contact info: ");
        String contactInfo = scanner.nextLine();

        customers.add(new Customer(customerId, name, contactInfo));
        System.out.println("Customer added successfully!");
    }

    private void viewAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found!");
        } else {
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }

    private void createBooking() {
        System.out.print("Enter booking ID: ");
        int bookingId = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter showtime ID: ");
        int showtimeId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter number of seats: ");
        int numberOfSeats = scanner.nextInt();
        scanner.nextLine();  

        Showtime showtime = findShowtimeById(showtimeId);
        Customer customer = findCustomerById(customerId);

        if (showtime != null && customer != null) {
            bookings.add(new Booking(bookingId, showtime, customer, numberOfSeats));
            System.out.println("Booking created successfully!");
        } else {
            System.out.println("Invalid showtime or customer details.");
        }
    }

    private void viewAllBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found!");
        } else {
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }

    private Movie findMovieById(int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    private Showtime findShowtimeById(int id) {
        for (Showtime showtime : showtimes) {
            if (showtime.getId() == id) {
                return showtime;
            }
        }
        return null;
    }

    private Customer findCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}
