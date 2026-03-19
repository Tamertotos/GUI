public class NewRelease extends Movie{


    public NewRelease(String title, double price, String category) {
        super(title, price, category);
    }

    @Override
    public double getPrice(){
        return price * 1.5;
    }
}
