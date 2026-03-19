import java.util.ArrayList;
import java.util.Arrays;

abstract public class RentalCart {
        private ArrayList<Movie> movies = new ArrayList<>();

     public void addMovie(Movie movie){
         movies.add(movie);
     }

     public void removeMovie(Movie movie){
        movies.remove(movie);
     }

     public double getTotalPrice(){
         double totalPrice = 0.0;
        for (int i = 0; i < movies.size() ; i++){
            totalPrice += movies.get(i).getPrice();
        }

        if (movies.size() >= 3) return totalPrice - totalPrice * 0.1;

        return totalPrice;
     }



}
