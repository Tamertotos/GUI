import java.util.Arrays;

public class OnlineRentalStore extends RentalCart{
    private RegularMovie regularMovie;
    private NewRelease newRelease;
    private ClassicMovie classicMovie;

    static void main() {
        OnlineRentalStore rentalCart = new OnlineRentalStore();

        Movie movie1 = new RegularMovie("Inception", 4.99, "Action");
        Movie movie2 = new NewRelease("Dune: Part Two", 7.99, "Sci-Fi");
        Movie movie3 = new ClassicMovie("The Godfather", 5.99, "Drama");
        Movie movie4 = new RegularMovie("Interstellar", 4.99, "Sci-Fi");

        rentalCart.addMovie(movie1);
        rentalCart.addMovie(movie2);
        rentalCart.addMovie(movie3);
        rentalCart.addMovie(movie4);

        System.out.println("Total price: " + rentalCart.getTotalPrice());

        rentalCart.removeMovie(movie2);

        System.out.println("Total price after removing a movie: " + rentalCart.getTotalPrice());



    }


}
