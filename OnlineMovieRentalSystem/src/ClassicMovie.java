public class ClassicMovie extends Movie{

    public ClassicMovie(String title, double price, String category) {
        super(title, price, category);
    }

    public double getPrice(){
        return price * 0.2;
    }
}
