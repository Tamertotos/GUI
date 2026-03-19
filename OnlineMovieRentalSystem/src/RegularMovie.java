public class RegularMovie extends Movie{

    public RegularMovie(String title, double price, String category) {
        super(title, price, category);
    }

    @Override
    public double getPrice(){
        return price;
    }
}
